package demo;

import org.testng.annotations.Test;

public class RunTimeParameterTest {
	@Test
	public void recieveParameter() {
		System.out.println(System.getProperty("Browser"));
		System.out.println(System.getProperty("url"));
	}
}
