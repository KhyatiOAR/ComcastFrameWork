package utility_pom;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BaseClass {
	

	
		@BeforeSuite(groups = {"smokeTest","regressionTest"})
		public void configBS() {
			System.out.println("Connect Db , Report Config");
		}
		@BeforeClass(groups = {"smokeTest","regressionTest"})
		public void configBC() {
			System.out.println("Launch Browser");
		}
		
		
		
		@BeforeMethod(groups = {"smokeTest","regressionTest"})
		public void configBM() {
			System.out.println("Login");
		}
		
		
		@AfterMethod(groups = {"smokeTest","regressionTest"})
		public void configAM() {
			System.out.println("Logout");
		}
		@AfterClass(groups = {"smokeTest","regressionTest"})
		public void configAC() {
			System.out.println("Close Browser");
		}
		@AfterSuite(groups = {"smokeTest","regressionTest"})
		public void configAS() {
			System.out.println("Close db, and report backup");
		}

	}


