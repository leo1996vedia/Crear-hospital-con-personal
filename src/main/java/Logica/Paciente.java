/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Paciente {
    private String nombre;
    private String edad;

    public Paciente() {
    }

    
    
    public Paciente(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
           }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    
    
}
