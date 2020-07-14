package JavaPrac;

import java.util.HashMap;

public class Menu 
{
	HashMap<Integer, HashMapPr> menu = new HashMap<Integer,HashMapPr>();
    public void addItem(HashMapPr i)
    {
    	menu.put(i.price,i);
  
    }
    public HashMapPr getItem(int price)
    {
    	return menu.get(price);
    }
    public boolean checkAvaliability(int price)
    {
    	HashMapPr m=menu.get(price);
		return m.available;
    	
    }
    public int itemCount()
    {
    	return menu.size();
    }

    
}
