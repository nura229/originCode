import java.util.Scanner;

public class User extends systemUser {

	public User() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("resource")
	public void userbuyproduct() throws Exception{
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("name of products is:");
	    String Pname = userInput3.nextLine();
	    System.out.println("amount of products is:" );
	    String bamount = userInput3.nextLine();
	    System.out.println("name of brand is:");
	    String bname = userInput3.nextLine();
	    System.out.println("Shipping address is:" );
	    String shippingaddress = userInput3.nextLine();
	     new BuyedProduct().buyproduct(Pname, bamount, bname,shippingaddress);
	}
	
}