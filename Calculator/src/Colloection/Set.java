package Colloection;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public void Hash() {
		HashSet Hs =new HashSet();
	 System.out.println(Hs.size());	//0
	 System.out.println(Hs.isEmpty());//true
	 
	 Hs.add(20);
	 Hs.add('s');
	 Hs.add("aaa");
	 Hs.add(null);
	 Hs.add(20); //duplicate value not allowed
	 Hs.add(null); // only one null value is adeed
	 System.out.println(Hs);  //[aaa, null, s, 20]
	 System.out.println(Hs.size());	//4
	 System.out.println(Hs.isEmpty());//false
	 Hs.remove(20);
	 System.out.println(Hs);//[aaa, null, s]
	 Iterator Itr =Hs.iterator();
	
	
	 
	 
	 
	}
  
}
