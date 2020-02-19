package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[3]; 
			obj[0] = temp.getMember_login(); 
			obj[1] = temp.getSubject(); 
			obj[2] = temp.getBody(); 
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "subject")
	public Object[][] getExcelData(){
		String fileName ="E:\\Jira\\TestData.xlsx";
		String sheetname="Subject";
		return new ApachePOIExcelRead().getExcelContent(fileName,sheetname); 
	}
	
	@DataProvider(name = "messages")
	public Object[][] getExcelData1(){
		String fileName ="E:\\Jira\\TestData.xlsx";
		String sheetname="Messages";
		return new ApachePOIExcelRead().getExcelContent(fileName,sheetname); 
	}
	
	@DataProvider(name = "valid_register")
	public Object[][] getExcelData2(){
		String fileName ="E:\\Jira\\TestData.xlsx";
		String sheetname="Valid_Register";
		return new ApachePOIExcelRead().getExcelContent(fileName,sheetname); 
	}
	@DataProvider(name = "register")
	public Object[][] getExcelData3(){
		String fileName ="E:\\Jira\\TestData.xlsx";
		String sheetname="Register";
		return new ApachePOIExcelRead().getExcelContent(fileName,sheetname); 
	}
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}
