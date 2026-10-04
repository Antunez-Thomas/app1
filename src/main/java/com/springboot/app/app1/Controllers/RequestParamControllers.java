package com.springboot.app.app1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parameter")
public class RequestParamControllers {
    @GetMapping("/details")
    public ParameterDTO details(@RequestParam String info){
        ParameterDTO parameter1 = new ParameterDTO();
        parameter1.setInfo(info);
        return parameter1;
    }
}
