package com.ArrayList;

import java.util.ArrayList;

public class Ar_06_ArrayListForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String>cars=new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("VW");
		
		for(int i=0; i<cars.size();i++)
		System.out.println(cars.get(i));
	}

}
