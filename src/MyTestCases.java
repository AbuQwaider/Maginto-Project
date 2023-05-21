import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	@BeforeTest
	public void MyBeforeTest() {
		
	System.out.println("abdalraheem");	
		
	}
	@Test()
	public void MyFirstTest()
	{
		
		System.out.println("abdalraheem1");	

		
	}
	@AfterTest
	public void MyAfterTest()
	{
		System.out.println("abdalraheem2");	

		
	}

}
