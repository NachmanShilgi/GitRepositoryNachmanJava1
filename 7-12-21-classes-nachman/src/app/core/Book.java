package app.core;

public class Book {
	private String isdn;
	private String title;
	private String outhor;
	private int price;

	public Book() {

	}
	public Book(String isdn,String title,String outhor,int price) {
		
		this.isdn = isdn;
		this.title = title;
		this.outhor = outhor;
		this.price = price;
	}
	public String getIsdn() {
		return isdn;
	}
	public void setIsdn(String isdn) {
		this.isdn = isdn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOuthor() {
		return outhor;
	}
	public void setOuthor(String outhor) {
		this.outhor = outhor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
