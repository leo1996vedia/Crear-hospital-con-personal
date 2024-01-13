/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Logica.HospitalPrivado;
import Logica.MiLista;
import Logica.Principal;

import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class FormHospPrivado extends javax.swing.JPanel {
private MiLista<String> listaPatrocinadores = new MiLista<>();
 
    public FormHospPrivado() {
        initComponents();
    }
 public void setListaPatrocinadores(MiLista  listaPatrocinadores) {
        this.listaPatrocinadores = listaPatrocinadores;
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputNumCalle = new javax.swing.JTextField();
        imputNumCalle1 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputDireccion = new javax.swing.JTextField();
        inputCiudad = new javax.swing.JTextField();
        inputPatrocinador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        agregar = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel4.setText("Ciudad:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel7.setText("Agregar Patrocinador:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel5.setText("Direccion:");

        imputNumCalle1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        imputNumCalle1.setText("N° Calle:");

        inputDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDireccionActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        agregar.setBackground(new java.awt.Color(132, 255, 102));
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        agregar.setBorder(null);
        agregar.setBorderPainted(false);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.setDoubleBuffered(true);
        agregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        agregar.setIconTextGap(8);
        agregar.setPreferredSize(new java.awt.Dimension(10, 10));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        crear.setBackground(new java.awt.Color(132, 255, 102));
        crear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crear.setForeground(new java.awt.Color(255, 255, 255));
        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        crear.setText("Crear");
        crear.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        crear.setBorderPainted(false);
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.setDoubleBuffered(true);
        crear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        crear.setIconTextGap(8);
        crear.setPreferredSize(new java.awt.Dimension(10, 10));
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel6.setText("Hospital Privado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(inputCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(imputNumCalle1)
                        .addGap(23, 23, 23)
                        .addComponent(inputNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel7)
                        .addGap(23, 23, 23)
                        .addComponent(inputPatrocinador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(inputCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imputNumCalle1)
                    .addComponent(inputNumCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(inputPatrocinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDireccionActionPerformed

    }//GEN-LAST:event_inputDireccionActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
if (listaPatrocinadores.getTamaño() < 3) {
    String valor = inputPatrocinador.getText();
    listaPatrocinadores.agregar(valor);
    inputPatrocinador.setText("");
} else {
    JOptionPane.showMessageDialog(null, "No puedes agregar más patrocinadores.", "", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_agregarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
          
        String nombre = inputNombre.getText();
          String direccion = inputDireccion.getText();
          int numCalle= Integer.parseInt(inputNumCalle.getText());
           String ciudad = inputCiudad.getText();
           listaPatrocinadores.imprimirLista();
                
           
           HospitalPrivado hospitalPrivado= new HospitalPrivado();
                               
                
        hospitalPrivado.setNombre(nombre);
         hospitalPrivado.setCiudad(ciudad);
         hospitalPrivado.setDireccion(direccion);
         hospitalPrivado.setNumCalle(numCalle);
         hospitalPrivado.setEmpresasPatrocinadoras(listaPatrocinadores);
                        
                
         Principal interfaz = new Principal();
         interfaz.agregarHospitalPrivado(hospitalPrivado);
         JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
         
 
    listaPatrocinadores = new MiLista();
    
            System.out.println("guardado");
        inputNombre.setText("");
        inputDireccion.setText("");
        inputNumCalle.setText("");
        inputCiudad.setText("");
        inputPatrocinador.setText("");
        

        
           
        
    }//GEN-LAST:event_crearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton crear;
    private javax.swing.JLabel imputNumCalle1;
    private javax.swing.JTextField inputCiudad;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputNumCalle;
    private javax.swing.JTextField inputPatrocinador;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
