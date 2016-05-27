package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.packt.webstore.domain.Product;
import com.packt.webstore.service.ProductService;

@Controller
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @RequestMapping( value = "/rest/product/{id}", method = RequestMethod.GET )
    public @ResponseBody Product findById( @PathVariable("id")String productId ) {
        Product product = productService.getProductById( productId );
        return product;

    }
}
