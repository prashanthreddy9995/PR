// src/main/java/com/example/demo/controller/HomeController.java
package com.example.PR;

import com.example.PR.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        List<Product> products = Arrays.asList(
                new Product(1L, "Wireless Headphones", "Bluetooth headphones with noise cancellation", 59.99, "https://via.placeholder.com/300x200"),
                new Product(2L, "Smartwatch", "Track your fitness and notifications", 89.99, "https://via.placeholder.com/300x200"),
                new Product(3L, "Gaming Mouse", "Ergonomic design with RGB lights", 29.99, "https://via.placeholder.com/300x200")
        );
        model.addAttribute("products", products);
        return "home";
    }
}
