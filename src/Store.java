import java.io.IOException;
import java.util.ArrayList;
public class Store {
	
 
 public String storelocation;
 public String storetype;
 public String storename;
 
 ArrayList<StoreEntity> StoreDatabase=new ArrayList<StoreEntity>();
 public Store(String storename ,String storetype, String storelocation) throws Exception {
	 this.storename=storename;
	 this.storetype=storetype;
	 this.storelocation=storelocation;
	 
	 StoreDatabase=FileUsage.storeReadFromFile(StoreDatabase);
 }
 public Store() throws Exception{
	 StoreDatabase=FileUsage.storeReadFromFile(StoreDatabase);
 }

 public void addstoreinfo( String storename, String storetype,String storelocation) throws IOException {
	   for(int i = 0; i < StoreDatabase.size(); ++i) {
		   if(StoreDatabase.get(i).getname().equals(storename)) {
			   System.out.print("this product is found");
			   return;
		   }
	   }
	   
	  FileUsage.usingBufferedWritter(storename + "|" + storetype + "|" + storelocation ,"Store.txt");
	   System.out.println("Store is added");
}
}

