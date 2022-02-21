package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTut {
	
	@Parameters("firstName")
	@Test
	public void getNamefromPara(String firstName) {
		System.out.println("Print name from para " + firstName);
	}
	@Test(groups= {"Smoke"})
	public void Mobiletest() {
		System.out.println("Check");
	}
	@Test(groups= {"Smoke"})
	public void MobileCheck() {
		System.out.println("Mobile check");
	}
	
	@AfterTest
	public void MobileAftertest() {
		System.out.println("After test");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}

}
