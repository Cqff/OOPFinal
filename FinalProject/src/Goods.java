import java.util.ArrayList;

public class Goods {
	
	 private int ID;
	 private String name;
	 private double price;
	 private String author;
	
	public Goods(int ID,String name, double price, String author) {
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
}
