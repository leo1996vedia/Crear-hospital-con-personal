/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Administracion extends Personal {
    
    private String departamento;

    public Administracion() {
    }
    

    public Administracion(String departamento, String nombre, String sexo, String dni, String nacionalidad) {
        super(nombre, sexo, dni, nacionalidad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
