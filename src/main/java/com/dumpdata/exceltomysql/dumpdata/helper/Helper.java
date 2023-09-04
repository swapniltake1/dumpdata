package com.dumpdata.exceltomysql.dumpdata.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import com.dumpdata.exceltomysql.dumpdata.entity.Product;

public class Helper {
    
    // check file = excel
    public static boolean checkExcelFormate(MultipartFile file){
        String contentType = file.getContentType();

        if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")){
            return true;
        }
        else{
            return false;
        }

    }

    // convert excel to list
    public static java.util.List<Product> convertExcelToListOfProduct(InputStream is){
        java.util.List<Product> list = new ArrayList<>();

        try {
            
            // Reading using apache 

         XSSFWorkbook workbook = new XSSFWorkbook(is);

          XSSFSheet sheet = workbook.getSheet("Sheet1");
           
          int rowNumber=0;

         Iterator<Row> iterator = sheet.iterator();

         while(iterator.hasNext()){

          Row row= iterator.next();

          if(rowNumber==0){
            rowNumber++;
            continue;
          }

          Iterator<Cell> cells = row.iterator();

          int cid=0;

          Product p = new Product();

          while(cells.hasNext()){

            Cell cell = cells.next();

            switch(cid){
               case 0:
               p.setProd_id((int) cell.getNumericCellValue());
               break;

               case 1:
               p.setProd_Name(cell.getStringCellValue());
               break;

               case 2:
               p.setProd_Desc(cell.getStringCellValue());
               break;

               case 3:
               p.setProd_Price(cell.getNumericCellValue());
               break;

               default:
               break;
            }
            cid++;
          }

          list.add(p);

         }





        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


}
