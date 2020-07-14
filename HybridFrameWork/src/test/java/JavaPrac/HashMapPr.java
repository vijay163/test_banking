package JavaPrac;

import java.util.HashMap;

public class HashMapPr
{
	int price;
	String name;
	String brand;
	int quantity;
    boolean available;
	public HashMapPr() {}
	public HashMapPr(int price, String name, String brand, int quantity,boolean available)
	{
		super();
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.available=available;
	}
	public String toString()
	{
		return name;
	}
	public void setAvailability(boolean available)
	{
		this.available=available;
	}	
	

}
