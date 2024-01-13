/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
 
public class MedicoHospital {
    private String nombre;
    private String sexo;
    private String fechaNacimiento;
    private String dni;
    private String nacionalidad;
    private String matricula;
    private String especialidad;
    private MiLista <EnfermeroHospital>enfermeros;
    
    
    public MedicoHospital(String nombre, String sexo, String fechaNacimiento, String dni, String nacionalidad,
                          String matricula, String especialidad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public MedicoHospital(String nombre, String sexo, String fechaNacimiento, String dni, String nacionalidad, String matricula, String especialidad, MiLista<EnfermeroHospital> enfermeros) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.enfermeros = enfermeros;
    }

    public MedicoHospital() {
    }
    

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public MiLista<EnfermeroHospital> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(MiLista<EnfermeroHospital> enfermeros) {
        this.enfermeros = enfermeros;
    }

 
    
}