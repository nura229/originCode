import java.util.Scanner;

public class StoreOwner extends systemUser implements StoreOwnerAddStores,StoreOwnerAddProducts,StoreOwnerBuyProducts,StoreOwnerAddColloborators {
	systemUser s = new systemUser();
	public StoreOwner() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
@SuppressWarnings({ "resource", "unused" })
public void wantaddstore() throws Exception {
	//Adminstrator admin=new Adminstrator();
	Scanner userInput2 = new Scanner(System.in);
	System.out.println("Name of store is:");
	String sname = userInput2.nextLine();
	System.out.println("Type of store is:");
	String stype = userInput2.nextLine();
	System.out.println("location of store is:");
	String slocation = userInput2.nextLine();
	System.out.println("Wait for the admin to accept this may take time");
	}

	public void addnewstore() throws Exception {
	Scanner userInput2 = new Scanner(System.in);
	System.out.println("Name of store is:");
	String sname = userInput2.nextLine();
	System.out.println("Type of store is:");
	String stype = userInput2.nextLine();
	System.out.println("location of store is:");
	String slocation = userInput2.nextLine();
	new Store().addstoreinfo(sname, stype, slocation);
	}

	public void addproducttostoreowner() throws Exception {
	Scanner userInput3 = new Scanner(System.in);
	System.out.println("name of Storeowner is:");
	String StoreOwnerName = userInput3.nextLine();
	System.out.println("name of products is:");
	String Pname = userInput3.nextLine();
	System.out.println("category of products is:");
	String Pcategory = userInput3.nextLine();
	System.out.println("price of products is:");
	String Pprice = userInput3.nextLine();
	System.out.println("name of brand is:");
	String Brandname = userInput3.nextLine();
	System.out.println("category of brand is:");
	String Brandcategory = userInput3.nextLine();
	System.out.println("Quantity of products is:");
	String Pproductquantity = userInput3.nextLine();
	new ProductOfStoreowner().addstoreproductinfo(StoreOwnerName,Pname, Pcategory, Pprice, Brandname, Brandcategory,
	Pproductquantity);
	}

	public void storeownerbuyproduct() throws Exception {
	Scanner userInput3 = new Scanner(System.in);
	System.out.println("Account name is:");
	String Uname = userInput3.nextLine();
	System.out.println("name of products is:");
	String Pname = userInput3.nextLine();
	System.out.println("amount of products is:");
	String bamount = userInput3.nextLine();
	System.out.println("name of brand is:");
	String bname = userInput3.nextLine();
	System.out.println("price of product is:");
	String pprice = userInput3.nextLine();
	System.out.println("Shipping address is:");
	String shippingaddress = userInput3.nextLine();
	new BuyedProduct().buyproduct(Uname,Pname, bamount, bname,pprice,shippingaddress);

	}
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


















