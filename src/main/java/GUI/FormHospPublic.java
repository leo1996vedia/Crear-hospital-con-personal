/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Logica.HospitalPublico;
import Logica.Principal;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class FormHospPublic extends javax.swing.JPanel {
    public FormHospPublic() {
        initComponents();
           
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        inputDireccion = new javax.swing.JTextField();
        inputCiudad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonPrincipal1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        inputSubvencion = new javax.swing.JTextField();
        inputNumCalle = new javax.swing.JTextField();
        imputNumCalle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(500, 500));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel7.setText("Ciudad:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel6.setText("Direccion:");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel8.setText("Subvencion: $");

        imputNumCalle.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        imputNumCalle.setText("N° Calle:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel9.setText("Hospital publico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(imputNumCalle)
                            .addGap(18, 18, 18)
                            .addComponent(inputNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(inputSubvencion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30)))
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(inputCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imputNumCalle)
                    .addComponent(inputNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(inputSubvencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal1ActionPerformed
      String nombre = inputNombre.getText();
          String direccion = inputDireccion.getText();
          int numCalle= Integer.parseInt(inputNumCalle.getText());
           String ciudad = inputCiudad.getText();
          int sub = Integer.parseInt(inputSubvencion.getText());
 
                
           
           HospitalPublico hospitalPublico= new HospitalPublico();
                               
                
        hospitalPublico.setNombre(nombre);
         hospitalPublico.setCiudad(ciudad);
         hospitalPublico.setDireccion(direccion);
         hospitalPublico.setNumCalle(numCalle);
         hospitalPublico.setSubvencionGubernamental(sub);
                        
                
         Principal interfaz = new Principal();
         interfaz.agregarHospitalPublico(hospitalPublico);
         JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
         
         inputNombre.setText("");
         inputDireccion.setText("");
         inputNumCalle.setText("");
         inputCiudad.setText("");
         inputSubvencion.setText("");
        
    }//GEN-LAST:event_botonPrincipal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPrincipal1;
    private javax.swing.JLabel imputNumCalle;
    private javax.swing.JTextField inputCiudad;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputNumCalle;
    private javax.swing.JTextField inputSubvencion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
