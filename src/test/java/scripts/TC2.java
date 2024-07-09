package scripts;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TC2 extends BaseTest
{
	@Test
	public void test2()
	{
		test.info(driver.getTitle());
		Assert.fail();
	}
}

