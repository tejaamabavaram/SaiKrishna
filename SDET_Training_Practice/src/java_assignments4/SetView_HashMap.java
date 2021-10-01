
package java_assignments4;

import java.util.Enumeration;
import java.util.Hashtable;

public class SetView_HashMap {

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Fruit", "Apple");
		ht.put("Vegetable", "Onions");
		ht.put("Flower", "Rose");
		Enumeration<String> e = ht.keys();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
