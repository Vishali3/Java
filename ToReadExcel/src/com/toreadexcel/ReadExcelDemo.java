package com.toreadexcel;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import  com.toreadexcel.data;
public class ReadExcelDemo {
	public static void main(String[] args)throws IOException , InvalidFormatException, SQLException, ClassNotFoundException  {
/*       
        String jdbcURL = "jdbc:mysql://localhost:3306/excelreading";
        String username = "root";
        String password = "";*/
 
        String excelFilePath = "F:/November 2019/ExcelReading/Toread.xlsx";
        Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        Sheet sheet = workbook.getSheetAt(0);
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();
            ArrayList myList = new ArrayList();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                myList.add(cell);
            }
            System.out.println(myList);
            System.out.println();
           
        }
        
       /* Class.forName("com.mysql.jdbc.Driver"); 
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelreading", "root", "");
        String insertsql="";
        insertsql="Insert into toreadexcel (sno,firstName,lastName,title) VALUES (?,?,?,?)";
        PreparedStatement ps=connection.prepareStatement(insertsql);
        ps.setObject(0, myList.get(0));
        ps.setObject(1, myList.get(1));
        ps.setObject(2, myList.get(2));
        ps.setObject(3, myList.get(3));*/
/*        Class.forName("com.mysql.jdbc.Driver"); 
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelreading", "root", "");
        String insertsql="";
        insertsql="Insert into toreadexcel (sno,firstName,lastName,title) VALUES (?,?,?,?)";
        PreparedStatement ps=connection.prepareStatement(insertsql);
        ps.setString(1, myList.get(0).toString());
        ps.setInt(2, Integer.parseInt(lis.get(1)));*/
	}
}




