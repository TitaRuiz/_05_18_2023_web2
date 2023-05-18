package com.hedima.web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
    private int idAlumno;
    private String nombre;
    private double nota;
    private int creditos;


}
