package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pagefactory.LoginPageRepo;

public class RegistrationPage extends BaseClass {

	@Before
	public void before() {
		System.out.println("Before EveryTest");
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test3() {
		LoginPageRepo repo = new LoginPageRepo();
		typedata(repo.getUsername(), "Kanagaraj");
		typedata(repo.getPassword(), "Kanchana");
		System.out.println("TestCase3 success");
	}

	@Test
	public void test4() {
		LoginPageRepo repo = new LoginPageRepo();
		typedata(repo.getUsername(), "BosuBabu");
		typedata(repo.getPassword(), "Inthumathi");
		System.out.println("TestCase4 success");
	}

	@Test
	public void test5() {
		LoginPageRepo repo = new LoginPageRepo();
		typedata(repo.getUsername(), "Suresh");
		typedata(repo.getPassword(), "Kalaivani");
		System.out.println("TestCase5 success");
	}

	@After
	public void after() {
		System.out.println("After EveryTest");
	}

}
