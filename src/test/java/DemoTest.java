

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	
	public void demo() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println("Hi there i am using whatsapp");
		
	}
}