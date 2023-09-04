package com.dumpdata.exceltomysql.dumpdata.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.dumpdata.exceltomysql.dumpdata.entity.Product;
import com.dumpdata.exceltomysql.dumpdata.helper.Helper;
import com.dumpdata.exceltomysql.dumpdata.repo.ProductRepo;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    
    @Transactional
    public void save(MultipartFile file){

        try {

        List<Product> products = Helper.convertExcelToListOfProduct(file.getInputStream());
        this.productRepo.saveAll(products);

        } catch (IOException e) {
          
            e.printStackTrace();
        }
    }

    public List<Product> getAllProduct(){
         return this.productRepo.findAll();
    }
}
