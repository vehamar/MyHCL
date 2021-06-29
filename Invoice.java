
public class Invoice {
	
	private int partNum;
	private String partDesc;
	private int quantity;
	private double price;

	public Invoice (int i, String partDesc, int quantity, double price) {
		this.partDesc = partDesc;
		this.price = price;
		this.partNum = i;
		this.quantity = quantity;
		
	};
	
	
	public double getInvoiceAmount(int quantity, double price) {
		if (price > 0) {
			return 0;
		}
		else {return quantity + price;}
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}