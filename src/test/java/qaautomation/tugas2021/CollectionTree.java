package qaautomation.tugas2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTree {
	
	public static void main(String[] args) {
		String kata = "Hasil";
		
	    TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	    tm.put(111, "Aditya");
	    tm.put(333, "Bharat");
	    tm.put(222, "Dev");	 
	    tm.put(223, "Devi");
	    tm.put(224, "Deva");
	    
	    System.out.println(kata + " " + "TreeMap :" +" " + tm.toString());
	    
	    TreeSet<String> ts = new TreeSet<String>();
	    ts.add("Bangalore");
	    ts.add("Chennai");
	    ts.add("Delhi");
	    TreeSet<String> t = new TreeSet<String>();
	    t.add("Mumbai");
	    t.add("Hyderabad");
	    
	    t.addAll(ts);
	    
	    System.out.println(kata + " " + "TreeSet :" +" " +t.toString());

	}
}
