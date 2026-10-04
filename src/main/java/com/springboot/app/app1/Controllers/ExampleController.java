package com.springboot.app.app1.Controllers;

import com.springboot.app.app1.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class ExampleController {

    @GetMapping("/details_info")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan", "Manco", null, "AI Agentic",
                35,1231123, 1);
        model.addAttribute("empleado", empleado1);

        return "details_info";
    }

    @ModelAttribute("Employees")
    public List<Empleados> ListEmployees(){
        return Arrays.asList(
                new Empleados("Mari","ola","grlapa", "dev", 35, 342342, 1)
        );
    }
}
