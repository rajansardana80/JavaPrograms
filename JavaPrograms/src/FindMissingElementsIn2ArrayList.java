import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindMissingElementsIn2ArrayList {
	public static void main(String[] args)
	{
	ArrayList<Integer> a = new ArrayList<Integer>(5);
	ArrayList<Integer> b = new ArrayList<Integer>(5);
	ArrayList<Integer> c = new ArrayList<Integer>(5);
	ArrayList<Integer> d = new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(10);
	a.add(4);

	
	b.add(2);
	b.add(3);
	b.add(4);
	b.add(5);
	
	c.add(7);
	c.add(8);
	c.add(3);
	c.add(4);
	
	d.add(7);
	d.add(8);
	d.add(3);
	d.add(4);
	
	Collections.copy(c,a);

	a.removeAll(b);
	b.removeAll(c);
	
	
	System.out.println("Missing elemet in b:"+a);
	System.out.println("Missing elemet in a:"+b);
	}
}
