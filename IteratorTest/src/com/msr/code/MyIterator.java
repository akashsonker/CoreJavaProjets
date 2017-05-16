package com.msr.code;

import java.util.Collection;
import java.util.Iterator;

public class MyIterator {
	public Iterator<?> getIterator(Collection<?> c) {
		return c.iterator();
	}
}
