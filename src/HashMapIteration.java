
import java.util.*;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(2, "Saket");
		map.put(25, "Saurav");
		map.put(12, "HashMap");
		
		System.out.println(map.size());
		
		System.out.println("While Loop:");
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext())
				{
			     Map.Entry m1 = (Map.Entry) itr.next();
			     System.out.println("Key is " + m1.getKey() + " Value is : " + m1.getValue());
			
				}
		
		System.out.println("For Loop:");
		
		for(Map.Entry m2 : map.entrySet())
		{
			 System.out.println("Key is " + m2.getKey() + " Value is : " + m2.getValue());
		}

	}
}
