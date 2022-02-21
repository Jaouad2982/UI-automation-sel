package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTut {
	
	//we can use  methods in testng.xml to include or exclude the methods that we dont need or need 
	//<class name="....."><methods> <include ...../> <methods/><class/>
	//
	//
	//
	
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
	
	@Test(dependsOnMethods= {"......"})
	public void dependsOn() {
		System.out.println("depends on a specific method");
	}
	
	@Test(enabled=false)
	public void enableAMethod() {
		System.out.println("USe enable true to enable or enable to false to disable a method");
	}
	
	@Test(timeOut=40)
	public void timeOutATest() {
		System.out.println("Wait time out a specific tast/ test");
	}
	
	@Test(dataProvider= "getData")
	public void TestData(String name,String secondPara) {
		System.out.println(name + " " + secondPara);
	}
	@AfterTest
	public void MobileAftertest() {
		System.out.println("After test");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}
	

	@DataProvider
	public Object getData() {
		Object [] [] obj = new Object [2][2];
		obj[0][0] ="Ja";
		obj [0][1] = "la";
		return obj;
		
		
	}

}
