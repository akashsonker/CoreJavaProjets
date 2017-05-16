package com.msr.code;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		MyIterator obj = new MyIterator();
		ArrayList<Integer> listOfNos = new ArrayList<Integer>();
		/*
		 * storing some objects into array list
		 */

		for (int i = 1; i <= 10; i++) {
			listOfNos.add(i);
		}
		
		Iterator<?> myIterator = obj.getIterator(listOfNos);
		IObjectTestImpl myTest=new IObjectTestImpl();
		
		FilteringIterator filteringIterator=new FilteringIterator(myIterator,myTest);
		filteringIterator.iterate(listOfNos);
	}
}
