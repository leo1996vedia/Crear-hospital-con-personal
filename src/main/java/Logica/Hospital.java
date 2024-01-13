/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Hospital {
     private String nombre;
    private String direccion;
    private int numCalle;
    private String ciudad;
    
private MiLista<MedicoHospital> medicos;
private MiLista<Limpieza> limpiezas;
private MiLista <Administracion> administracion;
private MiLista<Recepcionista> recepcionista;

private MiLista<PacienteAmbulatorio> pacientes;




    public Hospital() {
    }

    public Hospital(String nombre, String direccion,int numCalle ,String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.numCalle = numCalle;
    }

    public Hospital(String nombre, String direccion, int numCalle, String ciudad, MiLista<MedicoHospital> medicos, MiLista<Limpieza> limpiezas, MiLista<Administracion> administracion, MiLista<Recepcionista> recepcionista, MiLista<PacienteAmbulatorio> pacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numCalle = numCalle;
        this.ciudad = ciudad;
        this.medicos = medicos;
        this.limpiezas = limpiezas;
        this.administracion = administracion;
        this.recepcionista = recepcionista;
        this.pacientes = pacientes;
    }

    public MiLista<Limpieza> getLimpiezas() {
        return limpiezas;
    }

    public void setLimpiezas(MiLista<Limpieza> limpiezas) {
        this.limpiezas = limpiezas;
    }

    public MiLista<Administracion> getAdministracion() {
        return administracion;
    }

    public void setAdministracion(MiLista<Administracion> administracion) {
        this.administracion = administracion;
    }

    public MiLista<Recepcionista> getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(MiLista<Recepcionista> recepcionista) {
        this.recepcionista = recepcionista;
    }

  
    
    



    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public MiLista<MedicoHospital> getMedicos() {
        return medicos;
    }

    public void setMedicos(MiLista<MedicoHospital> medicos) {
        this.medicos = medicos;
    }

    public MiLista<PacienteAmbulatorio> getPacientes() {
        return pacientes;
    }

    public void setPacientes(MiLista<PacienteAmbulatorio> pacientes) {
        this.pacientes = pacientes;
    }

    
    
}