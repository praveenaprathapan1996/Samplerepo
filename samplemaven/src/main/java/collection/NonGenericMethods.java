package collection;


import java.util.ArrayList;
import java.util.List;

public class NonGenericMethods {

	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add("praveena");
		l.add(32);
		l.add(45.5);
		l.add(32);
		l.add("Chempoor");
		System.out.println(l);
		//get()
		System.out.println(l.get(2));
		//set()
		l.set(3, "10B");
		System.out.println(l);
		//indexOf()
		System.out.println(l.indexOf(32));
		//lastIndexOf()
		System.out.println(l.lastIndexOf(32));
		//remove()
		l.remove(4);
		System.out.println(l);
		//contains()
		System.out.println(l.contains("praveena"));
		//is Empty()
		System.out.println(l.isEmpty());
		//size()
		System.out.println(l.size());
	}

}
