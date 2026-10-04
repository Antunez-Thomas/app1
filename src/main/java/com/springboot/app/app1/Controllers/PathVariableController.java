package com.springboot.app.app1.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @GetMapping("/page1/{message}")
    public ParameterDTO page1(@PathVariable String message){
        ParameterDTO param1 = new ParameterDTO();
        param1.setInfo(message);
        return param1;
    }
}
