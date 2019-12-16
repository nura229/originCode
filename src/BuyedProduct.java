import java.util.ArrayList;
import sprint3.numberOfBoughtProducts;

public class BuyedProduct {
protected String name;
protected String amount;
protected String bname;
protected String shippingaddress;

   ArrayList<BuyedProductEntity> BuyedProductDatabase = new ArrayList<BuyedProductEntity>();
   
public BuyedProduct(String Pname,String bamount,String bname,String address) throws Exception {
   this.name=Pname;
   this.amount=bamount;
   this.bname=bname;
   this.shippingaddress=address;
   
      BuyedProductDatabase=FileUsage.buyed_productReadFromFile(BuyedProductDatabase);
}
public BuyedProduct() throws Exception {
	
    BuyedProductDatabase=FileUsage.buyed_productReadFromFile(BuyedProductDatabase);
}

public void buyproduct( String pname, String bamount,String bname,String shippingaddress) throws Exception {
	boolean FoundinSystem2=false;
	boolean FoundinSystem3=false;
	Integer num1=0;
	Integer num2=0;

	for(int i=0;i <new ProductOfStoreowner().ProductOfStoreownerDatabase.size();i++) {
	    num1 = Integer.valueOf(bamount);
		num2 = Integer.valueOf(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getProductQuantity());
		if(num1 <= num2 ) {
			 FoundinSystem2=true;
		}
	}
	for(int i=0;i <new ProductOfStoreowner().ProductOfStoreownerDatabase.size();i++) {
		if(pname.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getName()) &&	
				bname.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getBrandName())) {
			 FoundinSystem3=true;
		}
	}
	if(FoundinSystem2==false) {
		System.out.println("The amount is not available");
	}
	if(FoundinSystem3==false) {
		System.out.println("The product or band is not available");
	}
	if( FoundinSystem2==true && FoundinSystem3==true) {
		 FileUsage.usingBufferedWritter(pname + "|" + bamount + "|" +bname + "|" + shippingaddress,"BuyedProduct.txt");
		 new numberOfBoughtProducts().numberof_addedProducts();
		 System.out.println("Product is added to card");

   }
}
}