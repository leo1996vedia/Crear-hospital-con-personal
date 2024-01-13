/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import GUI.PrincipalInterfaz;
import com.formdev.flatlaf.FlatLightLaf;


public class Principal {
    private static MiLista<Hospital> listaHospitales = new MiLista<>();

    public void agregarHospitalPublico(HospitalPublico hospitalPublico) {
        listaHospitales.agregar(hospitalPublico);
    }

    public void agregarHospitalPrivado(HospitalPrivado hospitalPrivado) {
        listaHospitales.agregar(hospitalPrivado);
    }

    public MiLista<Hospital> obtenerListaHospitales() {
        return listaHospitales;
    }

    public static void main(String[] args) {
        FlatLightLaf.setup();
        PrincipalInterfaz ventana = new PrincipalInterfaz();
    ventana.setVisible(true);
    }
}
