package com.msr.code;

import java.util.Collection;
import java.util.Iterator;

public class FilteringIterator implements Iterator<Object> {
	/*
	 * we are using two iterators here 
	 * one is for checking test condition is true or false.
	 * based on result we iterate second iterator
	 * second iterator is to iterate FilteringIterator when test pass or fail. 
	 */
	private Iterator<?> myIterator;
	private Iterator<?> iterator;
	private IObjectTestImpl myTest;
	

	public FilteringIterator(Iterator<?> myIterator, IObjectTestImpl myTest) {
		super();
		this.myIterator = myIterator;
		this.myTest = myTest;
	}

	@Override
	public boolean hasNext() {

		return false;
	}

	@Override
	public Object next() {
		Object obj = null;
		obj = this.iterator.next();
		System.out.println(obj);
		return obj;
	}

	public Object skip() {
		return this.iterator.next();
	}

	public void iterate(Collection<?> c) {
		iterator = c.iterator();
		while (myIterator.hasNext()) {
			Integer i = (Integer) myIterator.next();
			boolean status = this.myTest.test(i);
			
			//if status true then iterate else skip
			
			if (status == true) {
				this.next();
			} else {
				this.skip();
			}
		}
	}
}
