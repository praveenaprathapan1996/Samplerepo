package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set <String> a=new HashSet <String >();
		 a.add("apple");
		 a.add("grapes");
		 a.add("mango");
		 a.add("pinapple");
		 System.out.println(a);
		 Iterator obj=a.iterator();
		 while(obj.hasNext())
		 {
			 System.out.println(obj.next());
		 }
		 System.out.println(a);
		 obj.remove();
		 System.out.println(a);
	}

}
