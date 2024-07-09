package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//How to read data from property file
		Properties p=new Properties();
		p.load(new FileInputStream("./config.properties"));
		String v = p.getProperty("APP_URL");
		System.out.println(v);
	}

}
