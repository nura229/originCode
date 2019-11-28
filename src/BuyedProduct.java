import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BuyedProduct {
private String name;
private String amount;
private String bname;
private String shippingaddress;
   ArrayList<BuyedProductEntity> BuyedProductDatabase = new ArrayList<BuyedProductEntity>();
public BuyedProduct(String Pname,String bamount,String bname,String address) throws Exception {
   this.name=Pname;
   this.amount=bamount;
   this.bname=bname;
   this.shippingaddress=address;
   BuyedProductDatabase = readFromFile();
}
public BuyedProduct() throws Exception {
	BuyedProductDatabase = readFromFile();
}

public ArrayList<BuyedProductEntity> readFromFile() throws Exception{
	ArrayList<BuyedProductEntity> buyedproduct = new ArrayList<BuyedProductEntity>();
	BufferedReader reader = new BufferedReader(new FileReader(new File("BuyedProduct.txt")));
	String line;
	while((line = reader.readLine()) != null) {
		String[] arr = line.split("\\|");
		buyedproduct.add(new BuyedProductEntity(arr[0], arr[1], arr[2],arr[3] ));
	}
	return buyedproduct;
}

public static void usingBufferedWritter(String textToAppend) throws IOException //Dii el function ele zadet
{
    BufferedWriter writer = new BufferedWriter(new FileWriter("BuyedProduct.txt", true));  
    writer.write(textToAppend);
    writer.newLine();   //Add new line
    writer.close();
}

public void buyproduct( String pname, String bamount,String bname,String shippingaddress) throws Exception {
	boolean FoundinSystem2=false;
	boolean FoundinSystem3=false;
	Integer num1=0;
	Integer num2=0;
	Integer num3=0;
	String remain;
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
		 usingBufferedWritter(pname + "|" + bamount + "|" +bname + "|" + shippingaddress);
		 
		 System.out.println("Product is added to card");
	}
	//////
	int count=0;
	BufferedReader br;
	br = new BufferedReader(new FileReader("NumberBoughtProduct.txt"));
	String line1;
	line1 = br.readLine();
	br.close();
    count = Integer.valueOf(line1);
	count++;
	line1 = Integer.toString(count);
	File file = new File ("NumberBoughtProduct.txt");
	FileWriter w = new FileWriter(file);
	w.write(line1);
	w.close();
	
	///////
	
   }
}
	   
   


