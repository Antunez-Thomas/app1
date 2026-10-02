package com.springboot.app.app1.Controllers;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
    @GetMapping("/details_info")

    public String info(Model model) {
        model.addAttribute("Title", "Servercito");
        model.addAttribute("Server", "Cito.sdk");
        model.addAttribute("Ip", "192.168.1.1");
        return "details_info";
    }
}
