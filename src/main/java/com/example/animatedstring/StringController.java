package com.example.animatedstring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StringController {
    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/display")
    public String displayString(@RequestParam("userInput") String userInput, Model model) {
        model.addAttribute("userInput", userInput);
        return "display";
    }
}
