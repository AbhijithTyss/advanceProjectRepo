package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		System.out.println("launched browser");
	}

}
