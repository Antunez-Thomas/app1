package com.springboot.app.app1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/api")
public class ExampleRestController {

    @GetMapping("details_info2")
    public Map<String, Object> details_info2() {
        Map<String, Object> answer = new HashMap<>();
        answer.put("Title", "Servercito");
        answer.put("Server", "Cito.sdk");
        answer.put("Ip", "192.168.1.1");
        return answer;
    }
}
