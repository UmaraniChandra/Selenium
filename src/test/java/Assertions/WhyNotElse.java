package Assertions;


import org.testng.annotations.Test;

public class WhyNotElse {
	@Test
	
	public void demo() {
		String s1="hello";
		String s2="Hello";
		
		
		//Assert.assertEquals(s1, s2);
		if(s1.equals(s2))
			System.out.println(s1);
		else
			System.out.println(s2);
		

	}

}
