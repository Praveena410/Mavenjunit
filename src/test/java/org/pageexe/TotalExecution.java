package org.pageexe;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginPageExecution.class, RegistrationPage.class })

public class TotalExecution {

	public static void main(String[] args) {

		Result run = JUnitCore.runClasses(LoginPageExecution.class, RegistrationPage.class);
		System.out.println(run.getFailures());
		System.out.println(run.getRunCount());
		System.out.println(run.getIgnoreCount());

	}

}
