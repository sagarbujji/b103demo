package scripts;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 
{
	
	@BeforeMethod
	public void m1(Method m)
	{
		String mn = m.getName();
		System.out.println("The next method is:"+mn);
	}
	
	@Test
	public void testLogin()
	{
		System.out.println("test login....");
	}
	
	@Test
	public void testlogout()
	{
		System.out.println("test logout");
	}
}
