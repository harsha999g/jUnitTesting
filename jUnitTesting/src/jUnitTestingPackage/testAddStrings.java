package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTestingFunction junitstring = new jUnitTestingFunction();
		String result=junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
