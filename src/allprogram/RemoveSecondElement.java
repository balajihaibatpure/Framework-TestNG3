 package allprogram;


	import java.util.HashMap;

	public class RemoveSecondElement {
	    public static void main(String[] args) {
	        // Create a HashMap
	        HashMap<Integer, String> map = new HashMap<>();
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Orange");

	        // Print the HashMap before removal
	        System.out.println("HashMap before removal: " + map);

	        // Remove the second element
	        map.remove(2);

	        // Print the HashMap after removal
	        System.out.println("HashMap after removal: " + map);
	    }
	}


