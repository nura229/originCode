import java.util.Scanner;

public class User extends systemUser {

	public User() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("resource")
	public void userbuyproduct() throws Exception{
		   Scanner userInput3 = new Scanner(System.in);
		   System.out.println("Account name is:");
		   String Uname = userInput3.nextLine();
		   System.out.println("name of products is:");
		   String Pname = userInput3.nextLine();
		   System.out.println("amount of products is:" );
		   String bamount = userInput3.nextLine();
		   System.out.println("name of brand is:");
		   String bname = userInput3.nextLine();
		   System.out.println("price of product is:");
		   String pprice = userInput3.nextLine();
		   System.out.println("Shipping address is:" );
		   String shippingaddress = userInput3.nextLine();
		   new BuyedProduct().buyproduct(Uname,Pname, bamount, bname, pprice,shippingaddress);
		}


		}

	
