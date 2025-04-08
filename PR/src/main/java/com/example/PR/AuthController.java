package com.example.PR;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit() {
        // Add your login logic here (check credentials, session, etc.)
        return "redirect:/home"; // or return "login" if login failed
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerSubmit() {
        // Add your registration logic here (save user, validate, etc.)
        return "redirect:/login";
    }
    @GetMapping("/home")
    public String homePage() {
        return "home"; // looks for home.html in templates
    }

}
