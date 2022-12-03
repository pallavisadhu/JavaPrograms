package GitJava.JavaAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloUpper {
	
	public String helloUpper(String str) {
		return "HELLO" + " " + str;
	}
	
	
	
	@Test
	public void testCase1() {
		Assert.assertEquals(helloUpper("ahceclwlxo"),"HELLO ahceclwlxo");
	}

}
