public class Collaborator extends systemUser {
   public Collaborator() throws Exception {
		super();
	}
   public void useAsStoreOwner() throws Exception
   {
	   StoreOwner s=new StoreOwner();
	   s.addproducttostoreowner();
   }
   
   

}

