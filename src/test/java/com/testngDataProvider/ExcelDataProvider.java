package com.testngDataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	  @DataProvider(name = "GoogleDataprovider")
       public Object[][] googleDataprovider() throws IOException {
         Object[][] arrayObject = expectedTitles("Microsoft");
         return arrayObject;
     }
	 
	
	
	
	 private  String[][] expectedTitles(String titleName) throws IOException {
     String[][] testData = null;
     String[] data = null;
     String line = null;

    BufferedReader br = new BufferedReader(new FileReader("C://SeleniumDrivers/DataFile1.csv"));

    while ((line = br.readLine()) != null){
        data = line.split(",");
       testData= new String[1][data.length];
       System.out.println(testData);

       // if(data[0].equalsIgnoreCase(titleName))
       // {
            for(int i =0; i<data.length; i++)

            {

            testData[0][i] = data[i];

            }

        break;
       // }
    }
    return testData;        
}
	 

}
