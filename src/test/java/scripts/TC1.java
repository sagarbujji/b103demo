package scripts;


import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;

public class TC1 extends BaseTest
{
	@Test
	public void test1()
	{
		String data = Utility.getExcelData(EXCEL_PATH,"TC1", 0, 0);
		test.info("Excel Data:"+data);
		test.info(driver.getTitle());
//		Assert.fail();
	}
}
