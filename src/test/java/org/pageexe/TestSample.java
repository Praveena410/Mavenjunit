package org.pageexe;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestSample {

	@Before
	public void atbefore() {
		System.out.println("Every before Program");
	}

	@Test
	public void test1() {
		System.out.println(" Test1 Project");
	}

	@Test
	public void test2() {
		System.out.println(" Test2 Project");
	}

	
	@Ignore
	@Test
	public void test3() {
		System.out.println(" Test3 Project");
	}

	@After
	public void after() {
		System.out.println("Every After Program");
	}

}
