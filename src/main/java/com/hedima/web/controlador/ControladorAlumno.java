package com.hedima.web.controlador;

import com.hedima.web.modelo.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alumnos")
public class ControladorAlumno {

    List<Alumno> alumnos = new ArrayList<>();
    @GetMapping("/formulario")
    public String mostrarFormulario(Model modelo){
        modelo.addAttribute("alumno", new Alumno());
        return "falumnos";
    }
    @PostMapping("/nuevo")
    public String guardarAlumno(Alumno a){
        System.out.println(a.toString());
        alumnos.add(a);
        return "redirect:/";
    }
    @PostMapping("/modificar")
    public String modificarAlumno(Alumno alumno){
        System.out.println("Entra");
        System.out.println(alumno.toString());
        Alumno alumnoModificar = null;
        for (Alumno a: alumnos) {
            if(a.getIdAlumno()== alumno.getIdAlumno()){
                alumnoModificar = a;
                break;
            }
        }
        int indice = alumnos.indexOf(alumnoModificar);
        alumnos.set(indice,alumno);
        return "redirect:/";
    }
    @GetMapping("/mostrar")
    public String mostrarTodos(Model modelo){
        modelo.addAttribute("alumnos", alumnos);
        return "mostrartodos";
    }
    @GetMapping("/editar/{id}")
    public String editarAlumno(Model modelo, @PathVariable("id") int id){
        Alumno alumnoModificar = null;
        for (Alumno a: alumnos) {
            if(a.getIdAlumno()== id){
                alumnoModificar = a;
                break;
            }
        }
        modelo.addAttribute("alumno", alumnoModificar);
        return "fmodificar";
    }




}
