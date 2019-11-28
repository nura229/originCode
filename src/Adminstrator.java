import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Adminstrator  extends systemUser   {
public Adminstrator() throws Exception {
         super();
}

public void addproducttosystem()throws Exception {
   Scanner userInput2 = new Scanner(System.in);
   System.out.println("name of products is:");
   String Pname = userInput2.nextLine();
   System.out.println("category of products is:" );
   String Pcategory = userInput2.nextLine();
   System.out.println("price of products is:" );
   String Pprice = userInput2.nextLine();
   System.out.println("offer on products is:");
   String Poffer = userInput2.nextLine();
         new product().addproductinfo(Pname,Pcategory, Pprice,Poffer);
}
 boolean check=true;
 public boolean AcceptStore() {
   System.out.println("Do you want to add this store to storeOwner enter 1 if no enter 2");
   Scanner request=new Scanner(System.in);
   int what=request.nextInt();
   if(what==1) {
       return check;
   }
  check=false;
  return check;
 }
////////
  public void addBrandtosystem()throws Exception {
   Scanner userInput2 = new Scanner(System.in);
   System.out.println("name of Brands is:");
   String name = userInput2.nextLine();
   System.out.println("category of Brands is:" );
   String category = userInput2.nextLine();
         new Brand().addBrandinfo(name,category);
  }
 public void addnewstatistics() throws IOException {
   BufferedReader br;
   br = new BufferedReader(new FileReader("NumberOfAddedUsersAccounts.txt"));
   String line;
   line = br.readLine();
   System.out.println("Number of users register:"+line);
   BufferedReader br2;
   br2 = new BufferedReader(new FileReader("NumberOfAddedStoreOwnerAccounts.txt"));
   String line2;
   line2 = br2.readLine();
   System.out.println("Number of storeowner register:"+line2);
   ArrayList<ProductEntity> products = new ArrayList<ProductEntity>();
   BufferedReader reader = new BufferedReader(new FileReader(new File("Products.txt")));
   String line1;
   while((line1 = reader.readLine()) != null) {
   String[] arr = line1.split("\\|");
   products.add(new ProductEntity(arr[0], arr[1], arr[2],arr[3]));
   }
   int i;
   for(i = 0; i < products.size(); ++i) {
 
   }
   System.out.println("Number of products :"+i);
   System.out.println("  Products & Offers :");
   BufferedReader br1 = new BufferedReader(new FileReader(new File("Products.txt")));
   String  line3= br1.readLine();
   while(line3 != null) {
   String[] arr = line3.split("\\|");
   System.out.println(arr[0]+" "+arr[3]);
   line3=br1.readLine();

}

 
   
}

}
