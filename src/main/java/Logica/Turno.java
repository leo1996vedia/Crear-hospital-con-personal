/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDate;
import java.time.LocalTime;


public class Turno {
    private LocalDate fechaLocal;
    private LocalTime horaLocal;
    private MedicoHospital asignarMedico;

    public Turno() {
    }
    
    
    

    public Turno(LocalDate fechaLocal, LocalTime horaLocal, MedicoHospital asignarMedico) {
        this.fechaLocal = fechaLocal;
        this.horaLocal = horaLocal;
        this.asignarMedico = asignarMedico;
    }

    public LocalDate getFechaLocal() {
        return fechaLocal;
    }

    public void setFechaLocal(LocalDate fechaLocal) {
        this.fechaLocal = fechaLocal;
    }

    public LocalTime getHoraLocal() {
        return horaLocal;
    }

    public void setHoraLocal(LocalTime horaLocal) {
        this.horaLocal = horaLocal;
    }

    public MedicoHospital getAsignarMedico() {
        return asignarMedico;
    }

    public void setAsignarMedico(MedicoHospital asignarMedico) {
        this.asignarMedico = asignarMedico;
    }

}