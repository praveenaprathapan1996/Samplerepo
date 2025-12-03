package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
	//add()	
a.add("Yellow");
a.add("blue");
a.add("red");
a.add("blue");
a.add("red");
a.add("green");
System.out.println(a);
//get()
String s=a.get(3);
System.out.println(s);
//set()
a.set(2, "Orange");
System.out.println(a);
//indexOf()
System.out.println(a.indexOf("blue"));
//lastIndexOf()
System.out.println(a.lastIndexOf("red"));
//remove()
a.remove("blue");
System.out.println(a);
a.remove(3);
System.out.println(a);
//contains()
System.out.println(a.contains("sky blue"));
//isEmpty()
System.out.println(a.isEmpty());
//size()
System.out.println(a.size());
	
	
	
	
	
	}

}
