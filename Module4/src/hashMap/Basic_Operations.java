package hashMap;

import java.util.HashMap;
import java.util.Set;

public class Basic_Operations {
public static void main(String[] args) {
	
	HashMap<String , Integer> m =new HashMap<>();
	
	
	System.out.println("empty "+m.isEmpty());
	System.out.println(m.containsValue(1));
	
	// insertion
	m.put("abc", 2);
	m.put("def", 3);
	m.put("abc", 2);
	System.out.println(m.containsValue(2));
	System.out.println("empty "+m.isEmpty());
	//size
	System.out.println(m.size());
	
	// contains
	if(m.containsKey("abc"))
		System.out.println(m.get("abc"));
	
	// get value
	System.out.println(m.get("def"));
	int a=m.get("abc");
	
	//int a1=m.get("sk");
	// null pointer exception due to null m.get value ,
	//key not exist and value also so Integer are class so default value object variable is null
	
	
	// to avoid this always do  this ways always .
	if(m.containsKey("abc")) {// to check whether it present or not.
	int a2=m.get("abc");
	}
	
	if(m.containsKey("sk")) {
	int a3=m.get("sk");
	}
	
	// remove
	m.remove("abc");
	m.remove("abhj");
	
	
	// iterate 
	
	Set<String> keys=m.keySet();// set interface implement by someOne extend or implement by hashmap
	//special type of loop
	for(String s: keys)
		System.out.print(s+" ");
}
}
