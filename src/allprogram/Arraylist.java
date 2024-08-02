package allprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator.OfDouble;
import java.util.Stack;
import java.util.TreeMap;

import javax.naming.AuthenticationException;

public class Arraylist {

	public static void main(String[] args) {
		
		LinkedList<String> list =new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.addFirst("r");
		list.add(4,"F");
		list.add("a");
		
		System.out.println(list);
		//===================================================================================================
	  List<Integer>arryList =new ArrayList<>();
	   for (int i=1;i<=5;i++) {
		   arryList.add(i);
		   
		   
	   }
	   System.out.println(arryList);
	   arryList.remove(3);
	   System.out.println(arryList);
	   //=============================================================================
	   
	   HashMap<String, Integer> map=new HashMap<>();
	   
	  map.put("balaji", 1);
	  map.put("raju", 0);
	  map.put("mahima", 2);
	  map.put("anisha", 3);
	  
	  System.out.print(map);
	  System.out.println(map.size());
	  if ( map.containsKey("balaji")) {
		  Integer balaji = map.get("balaji");
		  
		  System.out.println("========" + balaji);}
	  
	{
		
	}
	//=========================================================================
	   TreeMap<Integer, String> treeMap= new TreeMap<>();
	   
	   treeMap.put(3,"A");
	   treeMap.put(1,"B");
	   treeMap.put(4,"C");
	   treeMap.put(2,"D");
	   System.out.println(treeMap);
	   //========================================================================
	   Stack<String> stack =new Stack<>();
	   stack.push("raju");
	   stack.push("balji");
	   stack.push("america");
	   stack.push("india");
	   System.out.println(stack);
	}
 
}
