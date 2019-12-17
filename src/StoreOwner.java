import java.util.Scanner;

public class StoreOwner extends systemUser implements StoreOwnerAddColloborators ,StoreOwnerAddProducts,StoreOwnerAddStores,StoreOwnerBuyProducts {
	systemUser s = new systemUser();

	public StoreOwner() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "resource", "unused" })
	public void wantaddstore() throws Exception {

		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Name of store is:");
		String sname = userInput2.nextLine();
		System.out.println("Type of store is:" );
		String stype = userInput2.nextLine();
		System.out.println("location of store is:" ); 
		String slocation = userInput2.nextLine();
		System.out.println("Wait for the admin to accept this may take time");
	}

	@SuppressWarnings({ "resource" })
	public void addnewstore() throws Exception {
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Name of store is:");
		String sname = userInput2.nextLine();
		System.out.println("Your account name is:");
		String saccount = userInput2.nextLine();
		System.out.println("Type of store is:");
		String stype = userInput2.nextLine();
		System.out.println("location of store is:");
		String slocation = userInput2.nextLine();
		new Store().addstoreinfo(sname, saccount, stype, slocation);
	}

	@SuppressWarnings({ "resource" })
	public void addproducttostoreowner() throws Exception {
		Scanner userInput3 = new Scanner(System.in);

		System.out.println("Name of Store owner is:");
		String storeOwnerName = userInput3.nextLine();
		System.out.println("Name of products is:");
		String Pname = userInput3.nextLine();
		System.out.println("Category of products is:");
		String Pcategory = userInput3.nextLine();
		System.out.println("Price of products is:");
		String Pprice = userInput3.nextLine();
		System.out.println("Name of brand is:");
		String Brandname = userInput3.nextLine();
		System.out.println("Category of brand is:");
		String Brandcategory = userInput3.nextLine();
		System.out.println("Quantity of products is:");
		String Pproductquantity = userInput3.nextLine();
		new ProductOfStoreowner().addstoreproductinfo(storeOwnerName, Pname, Pcategory, Pprice, Brandname,
				Brandcategory, Pproductquantity);
	}

	public void wantToAddCollaborator() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Username? ");
		System.out.println("StoreOwner username: ");
		String storeOwnerName = input.nextLine();
		System.out.println("Enter the information of your Collaborator ");
		System.out.println("UserName: ");
		String collaboratorName = input.nextLine();
		System.out.println("Password: ");
		String password = input.nextLine();
		System.out.println("Your Collaborator account is added succesfully!");
		FileUsage.usingBufferedWritter(storeOwnerName + "|" + collaboratorName, "storeOwnerCollaborator.txt");
		FileUsage.usingBufferedWritter(storeOwnerName + "|" + collaboratorName + "|" + password, "Collaborator.txt");
	}

	public void storeownerbuyproduct() throws Exception {
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("Your username is:");
		String Uname = userInput3.nextLine();
		System.out.println("Store owner account's name is:");
		String Sname = userInput3.nextLine();
		System.out.println("name of product is:");
		String Pname = userInput3.nextLine();
		System.out.println("amount of products is:");
		String bamount = userInput3.nextLine();
		System.out.println("name of brand is:");
		String bname = userInput3.nextLine();
		System.out.println("price of product is:");
		String pprice = userInput3.nextLine();
		System.out.println("Shipping address is:");
		String shippingaddress = userInput3.nextLine();
		new BuyedProduct().buyproduct(Uname, Sname, Pname, bamount, bname, pprice, shippingaddress);

	}

}
