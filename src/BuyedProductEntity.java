
public class BuyedProductEntity {
	private String name;
	private String amount;
	private String bname;
	private String shippingaddress;
	
	public BuyedProductEntity(String name, String amount,String bname, String shippingaddress) {
		this.name = name;
		this.amount = amount;
		this.bname = bname;
		this.shippingaddress = shippingaddress;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getamount() {
		return amount;
	}
	public void setamount(String amount) {
		this.amount = amount;
	}
	 public String getBrandName() {
			return bname;
		}
		public void setBrandName(String bname) {
			this.bname = bname;
		}
	public String getshippingaddress() {
		return shippingaddress;
	}
	public void setCategory(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	
	
}
