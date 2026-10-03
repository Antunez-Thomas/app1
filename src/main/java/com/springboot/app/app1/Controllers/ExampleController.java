package com.springboot.app.app1.Controllers;

import com.springboot.app.app1.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ExampleController {

    @GetMapping("/details_info")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan", "Manco", "Colon y gralpa", "AI Agentic",
                35,1231123, 1);
        model.addAttribute("empleado", empleado1);

        return "details_info";
    }
}
