package lesson014;

import java.util.UUID;


public class Book {
	private String id;
	private	String bookName;
	private String authorName;
	private String publisher;
	private double price;
	private EStatus eStatus;
	private Category category;
	
	
	
	public Book() {
		this.id = UUID.randomUUID().toString();
		this.eStatus = EStatus.ACTIVE;
	}



	public Book(String bookName, String authorName, String publisher, double price, Category category) {
		this();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.price = price;
		this.category = category;
	}
	
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public EStatus geteStatus() {
		return eStatus;
	}
	public void seteStatus(EStatus eStatus) {
		this.eStatus = eStatus;
	}
	
	
	
	
	
	
	
	
}
