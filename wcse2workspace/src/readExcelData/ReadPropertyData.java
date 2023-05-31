package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/TestData");
		//read the
      Properties prop=new Properties();
      prop.load(fis);
      String data=prop.getProperty("username");
     

	}

}
