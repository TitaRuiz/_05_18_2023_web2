package com.hedima.web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorInicial {
    @GetMapping("/")
    public String mostrarInicio() {
        return "index";
    }

}
