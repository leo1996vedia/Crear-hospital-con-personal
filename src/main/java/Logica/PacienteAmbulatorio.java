/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


public class PacienteAmbulatorio extends Paciente {

    private Turno turno;

    public PacienteAmbulatorio() {
    }

   
    
    
    public PacienteAmbulatorio(Turno turno, String nombre, String edad) {
        super(nombre, edad);
        this.turno = turno;
    }

 
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void reservarTurno(Turno nuevoTurno) {
        if (turno == null) {
            turno = nuevoTurno;
            System.out.println("Se ha reservado el turno");
        } else {
            System.out.println("Ya tienes un turno reservado.");
        }
    }

    public void cancelarTurno() {
        if (turno != null) {
            turno = null;
            System.out.println("Se ha cancelado turno.");
        } else {
            System.out.println("No tienes un turno");
        }
    }
}
    

    
