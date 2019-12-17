public class Collaborator  {
	StoreOwnerAddProducts ad=new StoreOwner();
	systemUser s=new systemUser();
   public Collaborator() throws Exception {
		super();
	}
   public void useAsStoreOwner() throws Exception
   {
	   
	   ad.addproducttostoreowner();
   }
   public void 	CollaboratoerLogin() throws Exception
   {
	   
	   s.login(4);
   }
   
   
   

}

