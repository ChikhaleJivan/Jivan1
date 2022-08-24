package collectiondemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

@SuppressWarnings("unused")
public class LinkedHashsetDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		//LinkedHashSet <Integer>lset=new LinkedHashSet<Integer>();
		//HashSet lset=new HashSet();
		LinkedHashSet lset=new LinkedHashSet();
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		System.out.println(lset); //[400, 100, 500, 200, 300]

	}

}
