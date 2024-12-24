package com.example.animatedstring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StringController {

    // Handle GET request for the form
    @GetMapping("/")
    public String showForm() {
        return "index"; // Render the index.html template
    }

    // Handle POST request to display the entered string
    @PostMapping("/display")
    public String displayString(@RequestParam("userInput") String userInput, Model model) {
        model.addAttribute("userInput", userInput); // Add user input to the model
        return "display"; // Render the display.html template
    }
}
