package com.example.online_shop;


import com.example.online_shop.enytity.Category;
import com.example.online_shop.repository.CategoryRepository;
import com.example.online_shop.utils.AppConstanta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class OnlineShopApplication implements CommandLineRunner {
public static List<Integer> longs=new ArrayList<>();
@Autowired
    CategoryRepository categoryRepository;
    public static void main(String[] args) {

        SpringApplication.run(OnlineShopApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello worldl");

        categoryRepository.save(new Category(AppConstanta.fruit, true));

        categoryRepository.save(new Category(AppConstanta.technics, true));
    }
}
