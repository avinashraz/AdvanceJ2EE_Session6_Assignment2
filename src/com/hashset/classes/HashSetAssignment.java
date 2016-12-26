package com.hashset.classes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameOne = new String ("Avinash");
		String nameTwo = new String ("Manoj");
		String nameThree = new String ("Ashok");
		String nameFour = new String ("Selva");
		
		HashSet<String>names = new HashSet<String>();
		names.add(nameOne);
		names.add(nameTwo);
		names.add(nameThree);
		names.add(nameFour);
		
		System.out.println(names);
		Iterator itr =names.iterator();
		while (itr.hasNext()){
			String str = (String)itr.next();
			System.out.println(str);
			
		}
		

	}

}
