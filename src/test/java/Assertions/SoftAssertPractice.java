package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	@Test
	
	public void demo() {
		SoftAssert soft=new SoftAssert();
		
		String s1="hello";
		String s2="Hello";
		
		soft.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		
	    soft.assertAll();
		
	}

}
