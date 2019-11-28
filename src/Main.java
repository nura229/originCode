import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) throws Exception{
        	User u=new User();
        	StoreOwner s=new StoreOwner();
        	boolean storewant=false;
        	product p = new product();
        	Adminstrator a=new Adminstrator();
        	Scanner userInput = new Scanner(System.in);
        	while(true) {
        	System.out.println("For register enter 1: ");
        	System.out.println("For login enter 2: ");
        	int want=userInput.nextInt();
        	if (want==1){
            System.out.println("To return to home page Enter 0: ");
        	System.out.println("For register as a new user enter 1: ");
        	System.out.println("For register as a new store owner enter 2: ");
        	System.out.println("For register as a new Adminstrator enter 3: ");
        	int want1=userInput.nextInt();
        	if(want1==0) {
        		System.out.println("  To Home Pgae  ");
        	}
        	if(want1==1){
        		u.register(1);
        	}
        	if(want1==2){
        		s.register(2);
        	}
        	if(want1==3){
        		a.register(3);
        		
        		
        	}
        	}
        	else if(want==2)
        	{
            System.out.println("To return to home page Enter 0: ");
        	System.out.println("For login as a user enter 1: ");
        	System.out.println("For login as a store owner enter 2: ");
        	System.out.println("For login as an adminstrator enter 3: ");
        	int want2=userInput.nextInt();
        	if(want2==0) {
    			System.out.println("    To the Home Page   ");
    		}
        	if(want2==1){
        		u.login(1);
        		System.out.println("To view products  Enter 1: ");
        		System.out.println("To buy a product  Enter 2: ");
        		System.out.println("To return to home page Enter 0: ");
        		int userwant=userInput.nextInt();
        		if(userwant==0) {
        			System.out.println("    To the Home Page   ");
        		}
        		if(userwant==1) {
        			int count=0;
        			BufferedReader bro;
        			bro = new BufferedReader(new FileReader("count.txt"));
                	String line1;
                	line1 = bro.readLine();
                	bro.close();
                    count = Integer.parseInt(line1);
        			count++;
        			line1 = Integer.toString(count);
        			File file = new File ("count.txt");
        			FileWriter w = new FileWriter(file);
        			w.write(line1);
        			w.close();
        			BufferedReader br = new BufferedReader(new FileReader(new File("ProductOfStoreowner.txt")));
                	String line;
                	while((line = br.readLine()) != null) {
                		System.out.println(line);
                	}
                	//count=count++;
        		}
        		if(userwant==2) {
        			u.userbuyproduct();
        			
        		}
        		
        	}
        	else if(want2==2){
        		s.login(2);
        		if(storewant==true) {
        			if(a.check==true) {
        				System.out.println("Adminstrator accepts to add new store");
        				s.addnewstore();
        			} 
        			else if(a.check==false) {
        				System.out.println("Adminstrator refuses to add new store");
        			}
        		}
        		
        		System.out.println("To return to home page Enter 0: ");
        		System.out.println("To Add new store Enter 1: ");
        		System.out.println("To Add new product to store Enter 2: ");
        		System.out.println("To view statistics  Enter 3: ");
        		int want3=userInput.nextInt();
        		if(want3==0) {
        			System.out.println("    To the Home Page   ");
        		}
        		if(want3==1) {
        			storewant=true;
        			s.wantaddstore();
        		}
        		if(want3==2) {                
        			s.addproducttostoreowner();
        		}
        		if(want3==3) {
        			BufferedReader br = new BufferedReader(new FileReader(new File("count.txt")));
                	String line;
                	line = br.readLine();
                	System.out.println("Number of Users viewed the products is " + line);
                	//////
                	BufferedReader br2;
                	   br2 = new BufferedReader(new FileReader("NumberBoughtProduct.txt"));
                	   String line4;
                	   line4 = br2.readLine();
                	   System.out.println("Number of user buy product: " +line4);
                	/////
        		}
        		
        	}
        	   else if(want2==3){
        		a.login(3);
        		if(storewant) {
        			a.AcceptStore();
        		}
        		System.out.println("To return to home page Enter 0: ");
        		System.out.println("To Add new product Enter 1: ");
        		System.out.println("To Add new brand Enter 2: ");
        		System.out.println("To see new statistics Enter 3:");
        		int want4=userInput.nextInt();
        		if(want4==0) {
        			System.out.println("    To the Home Page   ");
        		}
        		if(want4==1) {
        			a.addproducttosystem();
        		}
        		if(want4==2) {
        			a.addBrandtosystem();
        			
        		}
        		if(want4==3) {
        			a.addnewstatistics();
        		}
        		
        		
        		
            }
           }
          }
		}
}