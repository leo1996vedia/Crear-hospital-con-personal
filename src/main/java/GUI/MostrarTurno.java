/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Logica.Hospital;
import Logica.MiLista;
import Logica.PacienteAmbulatorio;
import Logica.Principal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class MostrarTurno extends javax.swing.JPanel {

 private MiLista<Hospital> listaHospitales;
 
    public MostrarTurno() {
        
         initComponents();
          Principal principal = new Principal();
         listaHospitales = principal.obtenerListaHospitales();
         
         mostrarTabla();
         
         
       
    }
public Hospital ultimoHospital(){
    int obtenerUltimo = listaHospitales.getTamaño()-1;
    
    Hospital ultimo = listaHospitales.obtener(obtenerUltimo);

    return ultimo;
}
 

private void mostrarTabla (){
   DefaultTableModel modeloTablaTurnos = (DefaultTableModel) tablaMostrarTurnos.getModel();
            modeloTablaTurnos.setRowCount(0);
            for (int i = 0; i < ultimoHospital().getPacientes().getTamaño(); i++) {
         PacienteAmbulatorio paciente = ultimoHospital().getPacientes().obtener(i);
        modeloTablaTurnos.addRow(new Object[]{paciente.getNombre(), paciente.getEdad(), paciente.getTurno().getHoraLocal(), paciente.getTurno().getFechaLocal(),paciente.getTurno().getAsignarMedico().getNombre(),paciente.getTurno().getAsignarMedico().getEspecialidad()});
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrarTurnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaMostrarTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre paciente", "Edad", "Hora", "Fecha", "Nombre Medico", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(tablaMostrarTurnos);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel1.setText("Mostrar turno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(351, 351, 351))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMostrarTurnos;
    // End of variables declaration//GEN-END:variables
}
