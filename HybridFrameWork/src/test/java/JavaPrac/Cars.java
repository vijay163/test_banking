package JavaPrac;

public class Cars 
{
	public static void main(String[] args) 
	{
	  Menu m = new Menu();	
	  m.addItem(new HashMapPr(50000,"benze","benze",1,true));
	  m.addItem(new HashMapPr(100000,"s3","adi",1,true));
	  m.addItem(new HashMapPr(590000,"vim","volvo",1,false));
	  m.addItem(new HashMapPr(549000,"mi","Matruthi",1,true));
	  System.out.println(m.itemCount());
	  System.out.println(m.getItem(590000));
	  System.out.println(m.checkAvaliability(5490005));
	
	
	}
	

}
