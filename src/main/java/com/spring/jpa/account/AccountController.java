package com.spring.jpa.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {


    @GetMapping("/sign-up")
    public String signUpForm(Model model) {

        model.addAttribute("signUpForm", new SignUpForm());
        return "account/sign-up";
    }
}
