import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class systemUser {

	private ArrayList<UserEntity> userDatabase = new ArrayList<UserEntity>();
	private ArrayList<UserEntity> AdminDatabase = new ArrayList<UserEntity>();
	private ArrayList<UserEntity> StoreODatabase = new ArrayList<UserEntity>();
	
        protected String nameOremail;
        protected String password;
        protected String conf;
       // public File myObj=new File("Accounts.txt");
        public systemUser() throws Exception {
      	  userDatabase = readFromFile(userDatabase,"UserAccounts.txt");
      	  AdminDatabase = readFromFile( AdminDatabase,"AdminAccounts.txt");
       	  StoreODatabase = readFromFile(StoreODatabase,"StoreOwnerAccounts.txt");
		}
		private Scanner input;
		public static void usingBufferedWritter(String textToAppend,String FileName) throws IOException 
		{
		    BufferedWriter writer = new BufferedWriter(new FileWriter(FileName, true));
		    writer.write(textToAppend);  
		    writer.newLine();   //Add new line
		    writer.close();
		}
        public void register(int x) throws IOException{
        	
    	  input = new Scanner(System.in);
    	  System.out.println("Registration Page");
    	  System.out.println("Be sure that the username is unique");
    	  System.out.printf("Register by email or username: ");
    	  nameOremail=input.nextLine();
    	  System.out.printf("Password: ");
    	  password=input.nextLine();
    	  System.out.printf("Confirm Password: ");
    	  conf=input.nextLine();
    	  int length=password.length();
    	  //File myObj=new File("Accounts.txt");
    	  if(length<6){
    		  System.out.println("Too short password,password must be more than 6 characters");
    		  System.out.printf("Password too short,Re-enter Password: ");
              password=input.next();
    		  }
    	  else{
    		  if(password.equals(conf))
    		  {
    			  if(x==1) {
                  for(int i = 0; i < userDatabase.size(); i++) {
                	  if(userDatabase.get(i).getUsername().equals(nameOremail)) {
                          System.out.println("Username is already exists and used, please type another one");
                	      register(1);
                	  }
                  }
                  userDatabase.add(new UserEntity(nameOremail, password));
                  usingBufferedWritter(nameOremail + "|" + password, "UserAccounts.txt");
                  System.out.println("Register is done");
                  //////////
                  int count=0;
        			BufferedReader br;
        			br = new BufferedReader(new FileReader("NumberOfAddedUsersAccounts.txt"));
                	String line1;
                	line1 = br.readLine();
                	br.close();
                    count = Integer.valueOf(line1);
        			count++;
        			line1 = Integer.toString(count);
        			File file = new File ("NumberOfAddedUsersAccounts.txt");
        			FileWriter w = new FileWriter(file);
        			w.write(line1);
        			w.close();
                  //////////
    		  }
    			  else if(x==2)
    			  {
    				  for(int i = 0; i < StoreODatabase.size(); i++) {
                    	  if(StoreODatabase.get(i).getUsername().equals(nameOremail)) {
                              System.out.println("Username is already exists and used, please type another one");
                    	      register(2);
                    	  }
                      }
                      StoreODatabase.add(new UserEntity(nameOremail, password));
                      usingBufferedWritter(nameOremail + "|" + password, "StoreOwnerAccounts.txt");
                      System.out.println("Register is done");
                      /////////
                      int count=0;
            			BufferedReader br;
            			br = new BufferedReader(new FileReader("NumberOfAddedStoreOwnerAccounts.txt"));
                    	String line1;
                    	line1 = br.readLine();
                    	br.close();
                        count = Integer.valueOf(line1);
            			count++;
            			line1 = Integer.toString(count);
            			File file = new File ("NumberOfAddedStoreOwnerAccounts.txt");
            			FileWriter w = new FileWriter(file);
            			w.write(line1);
            			w.close();
                      
                      /////////
    			  }
    			  else if (x==3)
    			  {
    				  for(int i = 0; i < AdminDatabase.size(); i++) {
                    	  if(AdminDatabase.get(i).getUsername().equals(nameOremail)) {
                              System.out.println("Username is already exists and used, please type another one");
                    	      register(3);
                    	  }
                      }
                      AdminDatabase.add(new UserEntity(nameOremail, password));
                      usingBufferedWritter(nameOremail + "|" + password, "AdminAccounts.txt");
                      System.out.println("Register is done");
    			  }
    		  }
    		  else 
    			  System.out.println("Password not matched, Re-Enter password");
    		  }
       }
        public ArrayList<UserEntity> readFromFile(ArrayList<UserEntity> user,String FileName) throws Exception{
        	BufferedReader reader = new BufferedReader(new FileReader(new File(FileName)));
        	String line;
        	while((line = reader.readLine()) != null) {
        		String[] arr = line.split("\\|");
        		user.add(new UserEntity(arr[0], arr[1]));
        	}
			return user;
        }
      public void login(int y) throws Exception {
    	  input = new Scanner(System.in);
           System.out.println("Enter the username or email: ");
           nameOremail=input.nextLine();
           System.out.printf("Password: ");
     	   password=input.next();
     	  if (y==1)
    	   {
    	  for(int i = 0 ; i < userDatabase.size(); ++i) {
    		  if(userDatabase.get(i).getUsername().equals(nameOremail) && userDatabase.get(i).getPassword().equals(password)) {
    			  System.out.println("You are logged in");
    			  return;
    		  }  
    	  }
    	  System.out.println("Email or Password is wrong");
    	  login(1);
     }
    	   else if (y==2)
   	   {
   	  for(int i = 0 ; i < StoreODatabase.size(); ++i) {
   		  if(StoreODatabase.get(i).getUsername().equals(nameOremail) && StoreODatabase.get(i).getPassword().equals(password)) {
   			  System.out.println("You are logged in");
   			  return;
   		  }  
   	  }
   	  System.out.println("Email or Password is wrong");
   	  login(2);
   	   }
    	  else if (y==3)
  	   {
  	  for(int i = 0 ; i < AdminDatabase.size(); ++i) {
  		  if(AdminDatabase.get(i).getUsername().equals(nameOremail) && AdminDatabase.get(i).getPassword().equals(password)) {
  			  System.out.println("You are logged in");
  			  return;
  		  }  
  	  }
  	  System.out.println("Email or Password is wrong");
  	  login(3);
  	   }
}
}