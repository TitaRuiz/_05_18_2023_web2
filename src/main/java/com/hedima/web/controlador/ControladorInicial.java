package com.hedima.web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumnos")
public class ControladorAlumno {
    
    public String mostrarInicio() {
        return "index";
    }

}
