import java.util.ArrayList;

public class Goods {
	
	 private int ID;
	 private String name;
	 private double price;
	 private String author;
	 private String bookType;
	 private String bookCat;
	
	public Goods(int ID, String name, double price, String author) {
		 this.ID = ID;
		 this.name = name;
		 this.price = price;
		 this.author = author;
	}
	
	
	public int getID() {
		return ID;
	}
	
	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setId(int ID) {
		this.ID = ID;
		
	}

	public void setTitle(String name) {
		this.name = name;
		
	}

	public void setPrice(double price) {
		this.price = price;
		
	}

	public void setAuthor(String author) {
		this.author = author;
		
	}
	
	public String toString() {
        return  ID + "   "+ name +"   "+ price + "  " + author;
    }
}
