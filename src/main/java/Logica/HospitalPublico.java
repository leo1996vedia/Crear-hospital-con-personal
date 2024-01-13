/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class HospitalPublico extends Hospital {
        private int subvencionGubernamental;

    public HospitalPublico() {
    }

    public HospitalPublico(int subvencionGubernamental, String nombre, String direccion,int numCalle, String ciudad) {
        super(nombre, direccion,numCalle ,ciudad);
        this.subvencionGubernamental = subvencionGubernamental;
    }

    public HospitalPublico(int subvencionGubernamental, String nombre, String direccion, int numCalle, String ciudad, MiLista<MedicoHospital> medicos, MiLista<Limpieza> limpiezas, MiLista<Administracion> administracion, MiLista<Recepcionista> recepcionista, MiLista<PacienteAmbulatorio> pacientes) {
        super(nombre, direccion, numCalle, ciudad, medicos, limpiezas, administracion, recepcionista, pacientes);
        this.subvencionGubernamental = subvencionGubernamental;
    }



  

 

    public int getSubvencionGubernamental() {
        return subvencionGubernamental;
    }

    public void setSubvencionGubernamental(int subvencionGubernamental) {
        this.subvencionGubernamental = subvencionGubernamental;
    }
}
