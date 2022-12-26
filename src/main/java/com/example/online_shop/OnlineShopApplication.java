package com.example.online_shop;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class OnlineShopApplication implements CommandLineRunner {
public static List<Integer> longs=new ArrayList<>();
    public static void main(String[] args) {

        SpringApplication.run(OnlineShopApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello worldl");
    }
}
