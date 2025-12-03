package collection;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class NonGenericSetMethods {

	public static void main(String[] args)
	{
		Set a=new HashSet();
		a.add("rainbow");
		a.add(7);
		a.add("violet");
		a.add(0.5);
		System.out.println(a);
		Set b=new HashSet();
		b.add("indigo");
		b.add("blue");
		b.add("green");
		b.add(10);
		System.out.println(b);
		//addall()
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.contains("indigo"));
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		System.out.println(b.isEmpty());
		
		a.remove(0.5);
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(b.size());
		b.clear();
		System.out.println(b);
	}

}

