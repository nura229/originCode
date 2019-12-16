import java.util.Scanner;

public class StoreOwner extends systemUser {
	systemUser s = new systemUser();
	public StoreOwner() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
@SuppressWarnings({ "resource", "unused" })
public void wantaddstore()throws Exception {

	    Scanner userInput2 = new Scanner(System.in);
		System.out.println("Name of store is:");
	  /*  String sname = userInput2.nextLine();
	    System.out.println("Type of store is:" );
	    String stype = userInput2.nextLine();
	    System.out.println("location of store is:" );
	    String slocation = userInput2.nextLine();*/
	    System.out.println("Wait for the admin to accept this may take time"); 
}
@SuppressWarnings({ "resource" })
public void addnewstore()throws Exception {
    Scanner userInput2 = new Scanner(System.in);
	System.out.println("Name of store is:");
    String sname = userInput2.nextLine();
    System.out.println("Type of store is:" );
    String stype = userInput2.nextLine();
    System.out.println("location of store is:" );
    String slocation = userInput2.nextLine();
    new Store().addstoreinfo(sname,stype,slocation);
}
@SuppressWarnings({ "resource" })
public void addproducttostoreowner() throws Exception{
	Scanner userInput3 = new Scanner(System.in);
	
	System.out.println("Name of Store owner is:");
    String storeOwnerName = userInput3.nextLine();
	System.out.println("Name of products is:");
    String Pname = userInput3.nextLine();
    System.out.println("Category of products is:" );
    String Pcategory = userInput3.nextLine();
    System.out.println("Price of products is:" );
    String Pprice = userInput3.nextLine();
    System.out.println("Name of brand is:");
    String Brandname = userInput3.nextLine();
    System.out.println("Category of brand is:" );
    String Brandcategory = userInput3.nextLine();
    System.out.println("Quantity of products is:" );
    String Pproductquantity = userInput3.nextLine();
     new ProductOfStoreowner().addstoreproductinfo(storeOwnerName,Pname,Pcategory, Pprice,Brandname,Brandcategory,Pproductquantity);
}

@SuppressWarnings("resource")
public void wantToAddCollaborator() throws Exception {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the information of your Collaborator ");
	System.out.println("UserName: ");
	String collaboratorName=input.nextLine();
	System.out.println("Password: ");
	String password=input.nextLine();
	System.out.println("Your Collaborator account is added succesfully!");
	FileUsage.usingBufferedWritter(collaboratorName + "|" + password , "Collaborator.txt");
}

}


















