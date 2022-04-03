package com.java.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.app.repository.SpringJavaDAO;
import com.java.model.Customer;

@RestController
@RequestMapping("/springbootds")
public class SpringJavaController {

    @Autowired
    public SpringJavaDAO dao;

    @RequestMapping("/getcustInfo")
    public List<Customer> customerInformation() {
        List<Customer> customers = dao.isData(); 
        return customers;
    }
}
