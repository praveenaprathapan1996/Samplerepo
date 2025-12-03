package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 Set <String> a=new HashSet <String >();
 a.add("apple");
 a.add("grapes");
 a.add("mango");
 a.add("pinapple");
 System.out.println(a);
 Set <String> b=new HashSet <String>();
 b.add("tomatto");
 b.add("potato");
 b.add("brinjal");
 b.add("onion");
 System.out.println(b);
 a.addAll(b);
 System.out.println(a);
 System.out.println(b);
 System.out.println(a.contains("apple"));
 System.out.println(a.containsAll(b));
 System.out.println(b.containsAll(a));
 System.out.println(b.isEmpty());
 System.out.println(a.isEmpty());
 System.out.println(a.iterator());
 a.remove("mango");
 System.out.println(a);
a.removeAll(b);
System.out.println(a);
System.out.println(a.size());
a.clear();
System.out.println(a);

 
	}

}
