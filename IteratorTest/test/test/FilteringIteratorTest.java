package test;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.msr.code.FilteringIterator;
import com.msr.code.IObjectTestImpl;
import com.msr.code.MyIterator;

public class FilteringIteratorTest {
	/**
	 * 
	 * Here we have created one arrayList object that contain some Integer objects.
	 * 1.getting myIterator from arrayList;
	 * 2.creating myTest object from IObjectTestImpl
	 * Now we are passing above both params to @FilteringIterator() Constructor.
	 * filteringIterator will iterate only if the object setisfy test method condition.
	 * the test condition is given for even numbers in test()method of IObjectTestImpl 
	 * you can chage condition for odd numbers.
	 * So if number is even then only filteringIterator will show output 
	 * means when test pass then we get output.
	 * 
	 */
	@Test
	public void filteringIteratorShouldIterateEvenNubmers() {
		MyIterator obj = new MyIterator();
		ArrayList<Integer> listOfNos = new ArrayList<Integer>();

		// storing some objects into array list
		for (int i = 1; i <= 20; i++) {
			listOfNos.add(i);
		}

		// getting iterator and test object
		Iterator<?> myIterator = obj.getIterator(listOfNos);
		IObjectTestImpl myTest = new IObjectTestImpl();

		// passing iterator and test object to FilteringIterator();
		FilteringIterator filteringIterator = new FilteringIterator(myIterator, myTest);
		filteringIterator.iterate(listOfNos);
	}

}
