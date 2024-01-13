/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


public class Recepcionista extends Personal {
    private String areaAtencion;

    public Recepcionista() {
    }

    
    public Recepcionista(String areaAtencion, String nombre, String sexo, String dni, String nacionalidad) {
        super(nombre, sexo, dni, nacionalidad);
        this.areaAtencion = areaAtencion;
    }

    public String getAreaAtencion() {
        return areaAtencion;
    }

    public void setAreaAtencion(String areaAtencion) {
        this.areaAtencion = areaAtencion;
    }

 
    
    
}
