/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Logica.Hospital;
import Logica.MiLista;
import Logica.Principal;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class PrincipalInterfaz extends javax.swing.JFrame {
  private MiLista<Hospital> listaHospitales;
  
  
    public PrincipalInterfaz() {
        initComponents();
        
                         Principal interfaz = new Principal(); 
        listaHospitales = interfaz.obtenerListaHospitales();
    }
    
  

    
    
    private void ShowJPanel(JPanel panel){
    panel.setSize(1200, 555);
    panel.setLocation(0,0);
    
   contenedor.removeAll();
   contenedor.add(panel,BorderLayout.CENTER);
   contenedor.revalidate();
   contenedor.repaint();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        nombreHositalSeleccionado = new javax.swing.JLabel();
        botonBuscar3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inputBuscador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tituloLabel1 = new javax.swing.JLabel();
        backMenu = new javax.swing.JPanel();
        botonCrearPrivado = new javax.swing.JButton();
        botonListar = new javax.swing.JButton();
        botonCrearPublico = new javax.swing.JButton();
        botonCrearPublico1 = new javax.swing.JButton();
        ListarTurnos = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        contenedorInferior = new javax.swing.JPanel();
        botonSalud = new javax.swing.JButton();
        botonLimpieza = new javax.swing.JButton();
        botonRecepcionista = new javax.swing.JButton();
        botonAdministracion3 = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 900));

        background.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(132, 255, 102));

        nombreHositalSeleccionado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nombreHositalSeleccionado.setForeground(new java.awt.Color(255, 255, 255));

        botonBuscar3.setText("Buscar");
        botonBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar hospital:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bienvenido");

        tituloLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLabel1.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel1.setText("Administracion de Hospital");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(623, 623, 623)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(inputBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botonBuscar3))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(nombreHositalSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(tituloLabel1)
                    .addContainerGap(1169, Short.MAX_VALUE)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(inputBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonBuscar3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(nombreHositalSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(tituloLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        backMenu.setBackground(new java.awt.Color(102, 255, 102));

        botonCrearPrivado.setBackground(new java.awt.Color(132, 255, 102));
        botonCrearPrivado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCrearPrivado.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearPrivado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        botonCrearPrivado.setText("Crear hospital privado");
        botonCrearPrivado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonCrearPrivado.setBorderPainted(false);
        botonCrearPrivado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearPrivado.setDoubleBuffered(true);
        botonCrearPrivado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCrearPrivado.setIconTextGap(8);
        botonCrearPrivado.setPreferredSize(new java.awt.Dimension(10, 10));
        botonCrearPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPrivadoActionPerformed(evt);
            }
        });

        botonListar.setBackground(new java.awt.Color(132, 255, 102));
        botonListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonListar.setForeground(new java.awt.Color(255, 255, 255));
        botonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lista-24.png"))); // NOI18N
        botonListar.setText("Listar");
        botonListar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonListar.setBorderPainted(false);
        botonListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonListar.setDoubleBuffered(true);
        botonListar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonListar.setIconTextGap(8);
        botonListar.setPreferredSize(new java.awt.Dimension(10, 10));
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });

        botonCrearPublico.setBackground(new java.awt.Color(132, 255, 102));
        botonCrearPublico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCrearPublico.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearPublico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        botonCrearPublico.setText("Crear hospital publico");
        botonCrearPublico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonCrearPublico.setBorderPainted(false);
        botonCrearPublico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearPublico.setDoubleBuffered(true);
        botonCrearPublico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCrearPublico.setIconTextGap(8);
        botonCrearPublico.setPreferredSize(new java.awt.Dimension(10, 10));
        botonCrearPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPublicoActionPerformed(evt);
            }
        });

        botonCrearPublico1.setBackground(new java.awt.Color(132, 255, 102));
        botonCrearPublico1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCrearPublico1.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearPublico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        botonCrearPublico1.setText("Crear turno");
        botonCrearPublico1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonCrearPublico1.setBorderPainted(false);
        botonCrearPublico1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearPublico1.setDoubleBuffered(true);
        botonCrearPublico1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCrearPublico1.setIconTextGap(8);
        botonCrearPublico1.setPreferredSize(new java.awt.Dimension(10, 10));
        botonCrearPublico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPublico1ActionPerformed(evt);
            }
        });

        ListarTurnos.setBackground(new java.awt.Color(132, 255, 102));
        ListarTurnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListarTurnos.setForeground(new java.awt.Color(255, 255, 255));
        ListarTurnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lista-24.png"))); // NOI18N
        ListarTurnos.setText("Listar turnos");
        ListarTurnos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        ListarTurnos.setBorderPainted(false);
        ListarTurnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListarTurnos.setDoubleBuffered(true);
        ListarTurnos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ListarTurnos.setIconTextGap(8);
        ListarTurnos.setPreferredSize(new java.awt.Dimension(10, 10));
        ListarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTurnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backMenuLayout = new javax.swing.GroupLayout(backMenu);
        backMenu.setLayout(backMenuLayout);
        backMenuLayout.setHorizontalGroup(
            backMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCrearPrivado, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(botonCrearPublico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(botonCrearPublico1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ListarTurnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backMenuLayout.setVerticalGroup(
            backMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backMenuLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(botonCrearPublico, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCrearPrivado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCrearPublico1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListarTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        contenedorInferior.setBackground(new java.awt.Color(255, 255, 255));
        contenedorInferior.setMinimumSize(new java.awt.Dimension(1200, 553));

        botonSalud.setBackground(new java.awt.Color(132, 255, 102));
        botonSalud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonSalud.setForeground(new java.awt.Color(255, 255, 255));
        botonSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-persona-24.png"))); // NOI18N
        botonSalud.setText("Personal de la salud");
        botonSalud.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonSalud.setBorderPainted(false);
        botonSalud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalud.setDoubleBuffered(true);
        botonSalud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonSalud.setIconTextGap(8);
        botonSalud.setPreferredSize(new java.awt.Dimension(10, 10));
        botonSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaludActionPerformed(evt);
            }
        });

        botonLimpieza.setBackground(new java.awt.Color(132, 255, 102));
        botonLimpieza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonLimpieza.setForeground(new java.awt.Color(255, 255, 255));
        botonLimpieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-persona-24.png"))); // NOI18N
        botonLimpieza.setText("Limpieza");
        botonLimpieza.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonLimpieza.setBorderPainted(false);
        botonLimpieza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLimpieza.setDoubleBuffered(true);
        botonLimpieza.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonLimpieza.setIconTextGap(8);
        botonLimpieza.setPreferredSize(new java.awt.Dimension(10, 10));
        botonLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiezaActionPerformed(evt);
            }
        });

        botonRecepcionista.setBackground(new java.awt.Color(132, 255, 102));
        botonRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRecepcionista.setForeground(new java.awt.Color(255, 255, 255));
        botonRecepcionista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-persona-24.png"))); // NOI18N
        botonRecepcionista.setText("Recepcionista");
        botonRecepcionista.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonRecepcionista.setBorderPainted(false);
        botonRecepcionista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRecepcionista.setDoubleBuffered(true);
        botonRecepcionista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonRecepcionista.setIconTextGap(8);
        botonRecepcionista.setPreferredSize(new java.awt.Dimension(10, 10));
        botonRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecepcionistaActionPerformed(evt);
            }
        });

        botonAdministracion3.setBackground(new java.awt.Color(132, 255, 102));
        botonAdministracion3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonAdministracion3.setForeground(new java.awt.Color(255, 255, 255));
        botonAdministracion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-persona-24.png"))); // NOI18N
        botonAdministracion3.setText("Administracion");
        botonAdministracion3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonAdministracion3.setBorderPainted(false);
        botonAdministracion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAdministracion3.setDoubleBuffered(true);
        botonAdministracion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonAdministracion3.setIconTextGap(8);
        botonAdministracion3.setPreferredSize(new java.awt.Dimension(10, 10));
        botonAdministracion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministracion3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel1.setText("Agregar personal al hospital creado :");

        javax.swing.GroupLayout contenedorInferiorLayout = new javax.swing.GroupLayout(contenedorInferior);
        contenedorInferior.setLayout(contenedorInferiorLayout);
        contenedorInferiorLayout.setHorizontalGroup(
            contenedorInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInferiorLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAdministracion3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(botonLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(478, 478, 478))
        );
        contenedorInferiorLayout.setVerticalGroup(
            contenedorInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorInferiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(contenedorInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAdministracion3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorInferiorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(backMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contenedorInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1660, Short.MAX_VALUE)))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(contenedorInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPrivadoActionPerformed
        ShowJPanel(new FormHospPrivado());
    }//GEN-LAST:event_botonCrearPrivadoActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        // Iterar sobre la lista de hospitales
        ShowJPanel(new ListaDeHospitales());
    }//GEN-LAST:event_botonListarActionPerformed

    private void botonCrearPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPublicoActionPerformed
        ShowJPanel(new FormHospPublic());
    }//GEN-LAST:event_botonCrearPublicoActionPerformed

    private void botonSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaludActionPerformed

        ShowJPanel(new FormMedicoEnferm());
    }//GEN-LAST:event_botonSaludActionPerformed

    private void botonLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiezaActionPerformed

        ShowJPanel(new FormLimpieza());
    }//GEN-LAST:event_botonLimpiezaActionPerformed

    private void botonRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecepcionistaActionPerformed

        ShowJPanel(new FormRecepcionista());
    }//GEN-LAST:event_botonRecepcionistaActionPerformed

    private void botonAdministracion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministracion3ActionPerformed
        ShowJPanel(new FormAdmin());
    }//GEN-LAST:event_botonAdministracion3ActionPerformed

    private void botonCrearPublico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPublico1ActionPerformed
    ShowJPanel(new TurnoForm());
    }//GEN-LAST:event_botonCrearPublico1ActionPerformed

    private void ListarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTurnosActionPerformed
 ShowJPanel(new MostrarTurno());
    }//GEN-LAST:event_ListarTurnosActionPerformed

    private void botonBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscar3ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarTurnos;
    private javax.swing.JPanel backMenu;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonAdministracion3;
    private javax.swing.JButton botonBuscar3;
    private javax.swing.JButton botonCrearPrivado;
    private javax.swing.JButton botonCrearPublico;
    private javax.swing.JButton botonCrearPublico1;
    private javax.swing.JButton botonLimpieza;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton botonRecepcionista;
    private javax.swing.JButton botonSalud;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel contenedorInferior;
    private javax.swing.JPanel header;
    private javax.swing.JTextField inputBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel nombreHositalSeleccionado;
    private javax.swing.JLabel tituloLabel1;
    // End of variables declaration//GEN-END:variables
}
