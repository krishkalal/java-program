
import java.util.*;

class CollectionExample
{	
	public static void main(String[] args)
	{
		ArrayList  a = new ArrayList();
		LinkedList l = new LinkedList();
		
		Date start;
		Date end;
		long df11, df12;
		long df13, df14;
		
		
		start = new Date();
		populate(a);
		end   = new Date();
		df11 = end.getTime() - start.getTime();
		
		
		start = new Date();
		populate(l);
		end   = new Date();
		df12 = end.getTime() - start.getTime();
		
		
		
		start = new Date();
		print(a);
		end   = new Date();
		df13 = end.getTime() - start.getTime();
		
		start = new Date();
		print(l);
		end   = new Date();
		df14 = end.getTime() - start.getTime();
		
		System.out.println("Time in ArrayList elements  :: " + df11);
		System.out.println("Time in Printing   ArrayList elements  :: " + df13);
		
		System.out.println("Time in  LinkedList elements :: " + df12);
		System.out.println("Time in Printing   LinkedList elements :: " + df14);
		
	}
	
	public static void populate(AbstractList a)
	{
		for(int i=0; i < 5000; i++)
		{
			a.add(Integer.toString(i+1));
		}
	}	
	
	public static void print(AbstractList a)
	{
		for(int i=0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
}