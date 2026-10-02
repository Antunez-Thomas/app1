package com.springboot.app.app1.Controllers;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Map;

@Controller
public class ExampleController {

    @GetMapping("/details_info")
    public String info(Map<String, Object> model) {
        model.put("Title", "Servercito");
        model.put("Server", "Cito.sdk");
        model.put("Ip", "192.168.1.1");
        return "details_info";
    }
}
