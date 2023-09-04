package com.dumpdata.exceltomysql.dumpdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dumpdata.exceltomysql.dumpdata.entity.Product;
import com.dumpdata.exceltomysql.dumpdata.helper.Helper;
import com.dumpdata.exceltomysql.dumpdata.service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping("/product/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){

        if(Helper.checkExcelFormate(file)){
         
            this.productService.save(file);

            return ResponseEntity.status(HttpStatus.ACCEPTED).body("File Uploaded Succesfully");

        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file only !!");
    }

    @GetMapping("/product/getall")
    public List<Product> getAllProduct(){

        return this.productService.getAllProduct();
    }
}
