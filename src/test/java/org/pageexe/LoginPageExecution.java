package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.pagefactory.LoginPageRepo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.junit.After;

public class LoginPageExecution extends BaseClass {

	@Before
	public void before() {
		System.out.println("Before EveryTest");
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test1() {
		LoginPageRepo repo = new LoginPageRepo();
		typedata(repo.getUsername(), "Praveena");
		typedata(repo.getPassword(), "Ramesh");
		System.out.println("TestCase1 success");
	}

	@Test
	public void test2() {
		ExtentTest logger = extentReports.createTest("LoginPageTest");
		LoginPageRepo repo = new LoginPageRepo();
		typedata(repo.getUsername(), "Sujay");
		typedata(repo.getPassword(), "Siya");
		System.out.println("TestCase2 success");
		logger.log(Status.PASS, "TEST SUCCESS");
		
	}

	@After
	public void after() {
		System.out.println("After EveryTest");
	}

}
