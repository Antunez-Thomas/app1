package com.springboot.app.app1.Controllers;

import com.springboot.app.app1.models.Empleados;
import com.springboot.app.app1.models.dto.ClassDTO;
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
    public ClassDTO details_info2() {
        //Empleados empleado1 = new Empleados("Juan", "Manco", "Colon y gralpa", "AI Agentic", 35,1231123, 1);
        ClassDTO user1 = new ClassDTO();
        user1.setTitle("Dev");
        user1.setUser("Thz");

        return user1;
    }
}
