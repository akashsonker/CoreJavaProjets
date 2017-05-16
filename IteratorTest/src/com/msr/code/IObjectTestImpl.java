package com.msr.code;

public class IObjectTestImpl implements IObjectTest {

	@Override
	public boolean test(Object o) {
		/*
		 * Write your test logic here...
		 * change condition i%2==0 to i!=0
		 * and run main class you will see odd numbers
		 */
		Integer i = (Integer) o;
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
