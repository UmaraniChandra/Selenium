package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass {
	@Test(retryAnalyzer=retryAnalyzer.RetryImplementation.class)
	
	public void demo() {
		System.out.println("demo");
		Assert.fail();
	}

}
