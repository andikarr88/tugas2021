package qaautomation.tugas2021.utility;

import java.io.File;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataUtility {
	
	public static String dataFilePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator
			+ "TestData.xlsx";
	//untuk tidak bisa
	//public static String dataFilePath = "D:\\QUALITY ASSURANCE\Project\AUTOMATION\eclipse-workspace\august2021\resources\TestData.xlsx";
	//public static String dataFilePath = "C:\\TestData.xlsx";
	public static String getDataFromExcel(String sheetName, String ID) {
		String result = "";
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(dataFilePath);
			String strQuery = "Select * from " + sheetName + " where ID='" + ID + "'";
			Recordset recordset = connection.executeQuery(strQuery);

			while (recordset.next()) {
				result = recordset.getField("Value");
			}

			recordset.close();
			connection.close();
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
		
	}
}
