package com.example.online_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.util.Objects;

@RestController
@RequestMapping("/api/product")
public class Product_Controller {

//    @Autowired
//    ProductService productService;
//
//    @PostMapping("/addProduct")
//    public HttpEntity<?> addProduct(@RequestBody ProductDTO productDTO, @RequestParam("img") MultipartFile multipartFile) {
//        String filename = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
//        String contentType = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getContentType()));
//        Long size = Long.valueOf(StringUtils.cleanPath(String.valueOf(multipartFile.getSize())));
//        productDTO.setPhoto((Part) multipartFile);
//        ResponseEntity<?> responseEntity = productService.create(productDTO);
//        return productService.create(productDTO);
//    }

//    @PutMapping("/deleteMapping")
//    public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id) {
//        productService.delete(id);
//        return "redirect:/allProducts";
//    }
//
//
//    public HttpEntity<?> updateProduct(@RequestBody ProductDTO productDTO) {
//        productService.update(productDTO);
//        return ResponseEntity.ok();
//    }
//
//    public HttpEntity<?> getAllProducts() {
//        productService.getAll();
//        return ResponseEntity.ok()
//    }
//
//    public HttpEntity<?> getProduct(@PathVariable("id") Long id) {
//        productService.getProduct(id);
//        return ResponseEntity.ok()
//    }


}
