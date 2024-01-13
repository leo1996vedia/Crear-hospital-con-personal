/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class InternacionSala extends Internacion {
    private String hola;

    public InternacionSala(String hola, String cama, String habitacion) {
        super(cama, habitacion);
        this.hola = hola;
    }

    public String getHola() {
        return hola;
    }

    public void setHola(String hola) {
        this.hola = hola;
    }
}