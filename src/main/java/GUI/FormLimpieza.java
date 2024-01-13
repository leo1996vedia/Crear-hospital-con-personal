/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Logica.Hospital;
import Logica.Limpieza;
import Logica.MiLista;
import Logica.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormLimpieza extends javax.swing.JPanel {
private MiLista<Hospital> listaHospitales;
private MiLista<Limpieza> listaLimpieza = new MiLista<>();
 
    public FormLimpieza() {
        initComponents();
        Principal  interfaz = new Principal(); 
        listaHospitales = interfaz.obtenerListaHospitales();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputSexoLimpieza = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputDniLimpieza = new javax.swing.JTextField();
        inputNacLimpieza = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputDepLimpieza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputNombreLimpieza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        agregarAlHospital = new javax.swing.JButton();
        botonPrincipal1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        inputSexoLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSexoLimpiezaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel1.setText("Carga personal limpieza");

        inputDniLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDniLimpiezaActionPerformed(evt);
            }
        });

        inputNacLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNacLimpiezaActionPerformed(evt);
            }
        });

        jLabel8.setText("Nacionalidad:");

        inputDepLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDepLimpiezaActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo:");

        inputNombreLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreLimpiezaActionPerformed(evt);
            }
        });

        jLabel4.setText("Turno:");

        jLabel5.setText("DNI:");

        jLabel9.setText("Nombre completo:");

        agregarAlHospital.setBackground(new java.awt.Color(132, 255, 102));
        agregarAlHospital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarAlHospital.setForeground(new java.awt.Color(255, 255, 255));
        agregarAlHospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        agregarAlHospital.setText("Agregar al hospital");
        agregarAlHospital.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        agregarAlHospital.setBorderPainted(false);
        agregarAlHospital.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarAlHospital.setDoubleBuffered(true);
        agregarAlHospital.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agregarAlHospital.setIconTextGap(8);
        agregarAlHospital.setPreferredSize(new java.awt.Dimension(10, 10));
        agregarAlHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAlHospitalActionPerformed(evt);
            }
        });

        botonPrincipal1.setBackground(new java.awt.Color(132, 255, 102));
        botonPrincipal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        botonPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        botonPrincipal1.setText("Agregar");
        botonPrincipal1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonPrincipal1.setBorderPainted(false);
        botonPrincipal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPrincipal1.setDoubleBuffered(true);
        botonPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonPrincipal1.setIconTextGap(8);
        botonPrincipal1.setPreferredSize(new java.awt.Dimension(10, 10));
        botonPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputDepLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(inputNacLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(inputDniLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(inputSexoLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(inputNombreLimpieza)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarAlHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputNombreLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSexoLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDniLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNacLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDepLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(agregarAlHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputSexoLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSexoLimpiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSexoLimpiezaActionPerformed

    private void inputDniLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDniLimpiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDniLimpiezaActionPerformed

    private void inputNacLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNacLimpiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNacLimpiezaActionPerformed

    private void inputDepLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDepLimpiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDepLimpiezaActionPerformed

    private void inputNombreLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreLimpiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreLimpiezaActionPerformed

    private void agregarAlHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAlHospitalActionPerformed
        int obtenerUltimo = listaHospitales.getTamaño()-1;
        
        listaHospitales.obtener(obtenerUltimo).setLimpiezas(listaLimpieza);
        listaLimpieza= new MiLista();

    }//GEN-LAST:event_agregarAlHospitalActionPerformed

    private void botonPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal1ActionPerformed
        String nombre= inputNombreLimpieza.getText();
        String sexo = inputSexoLimpieza.getText();
        String dni = inputDniLimpieza.getText();
        String nac = inputNacLimpieza.getText();
        String turno =inputDepLimpieza.getText();

        Limpieza limpieza= new Limpieza();
        limpieza.setTurno(turno);
        limpieza.setNombre(nombre);
        limpieza.setSexo(sexo);
        limpieza.setDni(dni);
        limpieza.setNacionalidad(nac);
        
        
        listaLimpieza.agregar(limpieza);
        JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
        
        inputNombreLimpieza.setText("");
        inputSexoLimpieza.setText("");
        inputDniLimpieza.setText("");
        inputNacLimpieza.setText("");
        inputDepLimpieza.setText("");
        

    }//GEN-LAST:event_botonPrincipal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAlHospital;
    private javax.swing.JButton botonPrincipal1;
    private javax.swing.JTextField inputDepLimpieza;
    private javax.swing.JTextField inputDniLimpieza;
    private javax.swing.JTextField inputNacLimpieza;
    private javax.swing.JTextField inputNombreLimpieza;
    private javax.swing.JTextField inputSexoLimpieza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
