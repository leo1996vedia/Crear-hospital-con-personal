/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Logica.Administracion;
import Logica.EnfermeroHospital;
import Logica.Hospital;
import Logica.HospitalPrivado;
import Logica.HospitalPublico;
import Logica.Limpieza;
import Logica.MedicoHospital;
import Logica.MiLista;
import Logica.Principal;
import Logica.Recepcionista;
import javax.swing.DefaultListModel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListaDeHospitales extends javax.swing.JPanel {
    private MiLista<Hospital> listaHospitales;
  
    public ListaDeHospitales() {
        initComponents();
         Principal interfaz = new Principal(); 
        listaHospitales = interfaz.obtenerListaHospitales();
         labelSub.setVisible(false);
        subvencion.setVisible(false);
        labelPatrocinadores.setVisible(false);
        scrollPadre.setVisible(false);
        actualizarInterfaz(0);
    }

    
  private void actualizarInterfaz(int indice) {
    Hospital hospitalActual = listaHospitales.obtener(indice);

  
    labelSub.setVisible(false);
    subvencion.setVisible(false);
    labelPatrocinadores.setVisible(false);
    scrollPadre.setVisible(false);

   
    nombreHosp.setText(hospitalActual.getNombre());
    ciudadHosp.setText(hospitalActual.getCiudad());
    direccionHosp.setText(hospitalActual.getDireccion());
    numCalleHosp.setText(String.valueOf(hospitalActual.getNumCalle()));

    
    DefaultTableModel modeloTablaMedicos = (DefaultTableModel) tablaListaMedicos.getModel();
    modeloTablaMedicos.setRowCount(0);
    
    for (int i = 0; i < hospitalActual.getMedicos().getTamaño(); i++) {
        MedicoHospital medico = hospitalActual.getMedicos().obtener(i);
        MiLista<EnfermeroHospital> enfermeros = medico.getEnfermeros();

        StringBuilder nombresEnfermeros = new StringBuilder();

        for (int j = 0; j < enfermeros.getTamaño(); j++) {
            EnfermeroHospital enfermero = enfermeros.obtener(j);
            String nombreEnfermero = enfermero.getNombre();

            nombresEnfermeros.append(nombreEnfermero);

            if (j < enfermeros.getTamaño()) {
                nombresEnfermeros.append(", ");
            }
        }

        String nombresConcatenados = nombresEnfermeros.toString();

        modeloTablaMedicos.addRow(new Object[]{medico.getNombre(), medico.getEspecialidad(), nombresConcatenados});
    }

    // Cargar Administración a tabla
   DefaultTableModel modeloTablaAdmin = (DefaultTableModel) tablaAdministracion.getModel();
            modeloTablaAdmin.setRowCount(0);
            for (int i = 0; i < hospitalActual.getAdministracion().getTamaño(); i++) {
        Administracion admin= hospitalActual.getAdministracion().obtener(i);
        modeloTablaAdmin.addRow(new Object[]{admin.getNombre(), admin.getDepartamento()});
    }

    // Cargar Recepcionista a tabla
   DefaultTableModel modeloTablaRecepcion = (DefaultTableModel) tablaRecepcion.getModel();
    modeloTablaRecepcion.setRowCount(0);
    for (int i = 0; i < hospitalActual.getRecepcionista().getTamaño(); i++) {
        Recepcionista recepcionista = hospitalActual.getRecepcionista().obtener(i);
        modeloTablaRecepcion.addRow(new Object[]{recepcionista.getNombre(), recepcionista.getAreaAtencion()});
    }

    // Cargar Limpieza a tabla
    DefaultTableModel modeloTablaLimpieza = (DefaultTableModel) tablaLimpieza.getModel();
    modeloTablaLimpieza.setRowCount(0);

    for (int i = 0; i < hospitalActual.getLimpiezas().getTamaño(); i++) {
        Limpieza limpieza = hospitalActual.getLimpiezas().obtener(i);
        modeloTablaLimpieza.addRow(new Object[]{limpieza.getNombre(), limpieza.getTurno()});
    }

    //Instaciar atributsot publicos y privado
    
    if (hospitalActual instanceof HospitalPublico) {
        labelSub.setVisible(true);
        subvencion.setVisible(true);
        HospitalPublico hospitalPublico = (HospitalPublico) hospitalActual;
        labelSub.setText("Subvención:");
        subvencion.setText(String.valueOf(hospitalPublico.getSubvencionGubernamental()));
        
    } else if (hospitalActual instanceof HospitalPrivado) {
        labelPatrocinadores.setVisible(true);
        scrollPadre.setVisible(true);
        HospitalPrivado hospitalPrivado = (HospitalPrivado) hospitalActual;
        labelPatrocinadores.setText("Patrocinadores:");

        MiLista<String> patrocinadores = hospitalPrivado.getEmpresasPatrocinadoras();

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (int i = 0; i < patrocinadores.getTamaño(); i++) {
            modeloLista.addElement(patrocinadores.obtener(i));
        }
        scrollPatrocinadores.setModel(modeloLista);
    }
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        direccionHosp = new javax.swing.JLabel();
        labelPatrocinadores = new javax.swing.JLabel();
        indicador = new javax.swing.JLabel();
        subvencion = new javax.swing.JLabel();
        numCalleHosp = new javax.swing.JLabel();
        nombreHosp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scrollPadre = new javax.swing.JScrollPane();
        scrollPatrocinadores = new javax.swing.JList<>();
        ciudadHosp = new javax.swing.JLabel();
        botonAvanzar = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();
        labelSub = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListaMedicos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLimpieza = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaRecepcion = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaAdministracion = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelPatrocinadores.setText("Patrocinadores:");

        indicador.setText("0");

        jLabel2.setText("Ciudad:");

        direccion.setText("Direccion:");

        jLabel5.setText("Num calle:");

        nombreLabel.setText("Nombre:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Hospitales");

        scrollPatrocinadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPadre.setViewportView(scrollPatrocinadores);

        botonAvanzar.setBackground(new java.awt.Color(132, 255, 102));
        botonAvanzar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonAvanzar.setForeground(new java.awt.Color(255, 255, 255));
        botonAvanzar.setText("Avanzar");
        botonAvanzar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonAvanzar.setBorderPainted(false);
        botonAvanzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAvanzar.setDoubleBuffered(true);
        botonAvanzar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonAvanzar.setIconTextGap(8);
        botonAvanzar.setPreferredSize(new java.awt.Dimension(10, 10));
        botonAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzarActionPerformed(evt);
            }
        });

        botonRetroceder.setBackground(new java.awt.Color(132, 255, 102));
        botonRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        botonRetroceder.setText("Retroceder");
        botonRetroceder.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonRetroceder.setBorderPainted(false);
        botonRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRetroceder.setDoubleBuffered(true);
        botonRetroceder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonRetroceder.setIconTextGap(8);
        botonRetroceder.setPreferredSize(new java.awt.Dimension(10, 10));
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        labelSub.setText("Subvencion: $");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaListaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Especialidad", "Enfermeros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaListaMedicos);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setText("Lista de personal Administracion");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel4.setText("Lista de Medico");

        tablaLimpieza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Turno"
            }
        ));
        jScrollPane3.setViewportView(tablaLimpieza);

        tablaRecepcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Area"
            }
        ));
        jScrollPane4.setViewportView(tablaRecepcion);

        tablaAdministracion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Departamento"
            }
        ));
        jScrollPane5.setViewportView(tablaAdministracion);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel6.setText("Lista de personal Recepcion");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel7.setText("Lista de personal Limpieza");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(250, 250, 250))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(ciudadHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(direccion)
                                .addGap(17, 17, 17)
                                .addComponent(direccionHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addGap(13, 13, 13)
                                .addComponent(numCalleHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelSub)
                                .addGap(6, 6, 6)
                                .addComponent(subvencion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(botonRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(indicador)
                                .addGap(18, 18, 18)
                                .addComponent(botonAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelPatrocinadores)
                                .addGap(18, 18, 18)
                                .addComponent(scrollPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(nombreLabel)
                                .addGap(13, 13, 13)
                                .addComponent(nombreHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(nombreHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudadHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numCalleHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subvencion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPatrocinadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indicador)
                            .addComponent(botonAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAvanzarActionPerformed
    int indice = Integer.parseInt(indicador.getText());
      if (indice < listaHospitales.getTamaño() - 1) {
        indice++;
        actualizarInterfaz(indice);
    }
        indicador.setText(String.valueOf(indice));
        actualizarInterfaz(indice);
    
    }//GEN-LAST:event_botonAvanzarActionPerformed

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
int indice = Integer.parseInt(indicador.getText());
if (indice > 0) {
    indice--;
    actualizarInterfaz(indice);
}
indicador.setText(String.valueOf(indice));
actualizarInterfaz(indice);

    }//GEN-LAST:event_botonRetrocederActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAvanzar;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JLabel ciudadHosp;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccionHosp;
    private javax.swing.JLabel indicador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelPatrocinadores;
    private javax.swing.JLabel labelSub;
    private javax.swing.JLabel nombreHosp;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel numCalleHosp;
    private javax.swing.JScrollPane scrollPadre;
    private javax.swing.JList<String> scrollPatrocinadores;
    private javax.swing.JLabel subvencion;
    private javax.swing.JTable tablaAdministracion;
    private javax.swing.JTable tablaLimpieza;
    private javax.swing.JTable tablaListaMedicos;
    private javax.swing.JTable tablaRecepcion;
    // End of variables declaration//GEN-END:variables
}
