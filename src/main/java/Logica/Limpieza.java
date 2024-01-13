/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Limpieza extends Personal {
     private String turno;

    public Limpieza(String turno, String nombre, String sexo, String dni, String nacionalidad) {
        super(nombre, sexo, dni, nacionalidad);
        this.turno = turno;
    }

    public Limpieza() {
    
    }
     

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
       
}
