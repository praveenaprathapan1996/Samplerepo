package foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int a[]= {3,2,4,5,6};
//for each loop- for (datatype variablename:arrayname)
for(int p:a)
{
	System.out.println(p);
}
List <String> l=new ArrayList <String>();
l.add("apple");
l.add("mango");
l.add("banana");
for(String p:l)
{
	System.out.println(p);
}
Set <String > m=new HashSet <String >();
{
	m.add("blue");
	m.add("yellow");
	m.add("rose");
	for( String n:m)
		{
		System.out.println(n);
		}
		}
	}

}
