/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;


import Logica.Hospital;
import Logica.MedicoHospital;
import Logica.MiLista;
import Logica.PacienteAmbulatorio;
import Logica.Principal;
import Logica.Turno;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class TurnoForm extends javax.swing.JPanel {
    private MiLista <Hospital> listaHospitales;
    private MiLista<PacienteAmbulatorio> listaPacientes = new MiLista<>();
    private MedicoHospital medicoSeleccionado;
 
    
    private LocalDate fechaSeleccionada ;
    
    public TurnoForm() {
        initComponents();

        
        Principal principal = new Principal();
        listaHospitales = principal.obtenerListaHospitales();
        
          obteniendoEspecialidad();
        especialidadSeleccionada() ;
        mostrarHorario();
        
        //Actualizo evento al hacer click
         inputEspecialidad.addListSelectionListener(e -> {   
            if (!e.getValueIsAdjusting()) {
                especialidadSeleccionada();
            }
        });
         

}

    //Obtener el ultimoHospital en la lista

public Hospital ultimoHospital(){
    int obtenerUltimo = listaHospitales.getTamaño()-1;
    
    Hospital ultimo = listaHospitales.obtener(obtenerUltimo);

    return ultimo;
}

//obtengo especialidad y filtro para que no haya duplicado

public void obteniendoEspecialidad() {
    Hospital ultimoHospital = ultimoHospital();
    MiLista<MedicoHospital> listaMedicos = ultimoHospital.getMedicos();

    Set<String> especialidadesSet = new HashSet<>();  //Se evita duplicados

    for (int i = 0; i < listaMedicos.getTamaño(); i++) {
        MedicoHospital medico = listaMedicos.obtener(i);
        especialidadesSet.add(medico.getEspecialidad());  
    }

    DefaultListModel<String> especialidadesModel = new DefaultListModel<>();
    especialidadesSet.forEach(especialidadesModel::addElement); 

    inputEspecialidad.setModel(especialidadesModel);
}


//obtengo lista de medico por especialidad(Filtro)
public void actualizarListaMedicos(String especialidadSeleccionada) {
    Hospital ultimoHospital = ultimoHospital();
    MiLista<MedicoHospital> listaMedicos = ultimoHospital.getMedicos();

    MiLista<MedicoHospital> medicos = new MiLista<>(); 
    for (int i = 0; i < listaMedicos.getTamaño(); i++) {
        MedicoHospital medico = listaMedicos.obtener(i);
        if (medico.getEspecialidad().equals(especialidadSeleccionada)) {
            medicos.agregar(medico);
        }
    }

    DefaultListModel<String> nombresMedicosModel = new DefaultListModel<>();
    inputNombreMedico.setModel(nombresMedicosModel);
    for (int i = 0; i < medicos.getTamaño(); i++) { 
        MedicoHospital medico = medicos.obtener(i);
        nombresMedicosModel.addElement(medico.getNombre());
    }

    inputNombreMedico.setModel(nombresMedicosModel);
}


public MedicoHospital compararNombreYespecialidad(String nombreSeleccionado, String especialidadSeleccionada) {
    Hospital ultimoHospital = ultimoHospital();
    MiLista<MedicoHospital> listaMedicos = ultimoHospital.getMedicos();

    for (int i = 0; i < listaMedicos.getTamaño(); i++) {
        MedicoHospital medico = listaMedicos.obtener(i);
        if (medico.getNombre().equals(nombreSeleccionado) && medico.getEspecialidad().equals(especialidadSeleccionada)) {
            
            return medico; 
            
        }
    }

    return null;  
}


private void especialidadSeleccionada() {
   
    String especialidadSeleccionada = inputEspecialidad.getSelectedValue();   
    actualizarListaMedicos(especialidadSeleccionada);
}




//Lista de horarios
public MiLista<LocalTime> obtenerHorarios() {
    MiLista<LocalTime> horarios = new MiLista<>();
    
    LocalTime turnoManana = LocalTime.of(7, 0); 
    LocalTime turnoTarde = LocalTime.of(12, 0); 
    
    while (turnoManana.isBefore(turnoTarde)) {
        horarios.agregar(turnoManana);
        turnoManana = turnoManana.plusMinutes(45);
    }
    
    LocalTime turnoTardeInicio = LocalTime.of(16, 0); 
    LocalTime turnoTardeFin = LocalTime.of(20, 0); 
    
    while (turnoTardeInicio.isBefore(turnoTardeFin)) {
        horarios.agregar(turnoTardeInicio);
        turnoTardeInicio = turnoTardeInicio.plusMinutes(45);
    }
    
    return horarios;
}



//Muestro hora
   public void mostrarHorario() {
    DefaultListModel<String> model = new DefaultListModel<>();
    MiLista<LocalTime> horarios = obtenerHorarios();
    
    for (int i = 0; i < horarios.getTamaño(); i++) {
        LocalTime horario = horarios.obtener(i);
        model.addElement(horario.toString());
    }
    
    verHora.setModel(model);
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        verHora = new javax.swing.JList<>();
        inputNombrePaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputNombreMedico = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputEspecialidad = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        botonPrincipal2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        inputFecha = new com.toedter.calendar.JCalendar();
        jLabel8 = new javax.swing.JLabel();
        inputEdad = new javax.swing.JTextField();
        CargarTurnoALista = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("nombre completo :");

        verHora.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(verHora);

        inputNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombrePacienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione fecha:");

        jLabel3.setText("Medico:");

        jLabel7.setText("Seleccione hora:");

        inputNombreMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        inputNombreMedico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputNombreMedicoPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(inputNombreMedico);

        jLabel5.setText("Especialidad:");

        inputEspecialidad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        inputEspecialidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputEspecialidadPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(inputEspecialidad);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Crear turno");

        botonPrincipal2.setBackground(new java.awt.Color(132, 255, 102));
        botonPrincipal2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPrincipal2.setForeground(new java.awt.Color(255, 255, 255));
        botonPrincipal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        botonPrincipal2.setText("Agregar");
        botonPrincipal2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonPrincipal2.setBorderPainted(false);
        botonPrincipal2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPrincipal2.setDoubleBuffered(true);
        botonPrincipal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonPrincipal2.setIconTextGap(8);
        botonPrincipal2.setPreferredSize(new java.awt.Dimension(10, 10));
        botonPrincipal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipal2ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        inputFecha.setMinimumSize(new java.awt.Dimension(40, 50));
        inputFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputFechaPropertyChange(evt);
            }
        });

        jLabel8.setText("Edad:");

        inputEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEdadActionPerformed(evt);
            }
        });

        CargarTurnoALista.setBackground(new java.awt.Color(132, 255, 102));
        CargarTurnoALista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CargarTurnoALista.setForeground(new java.awt.Color(255, 255, 255));
        CargarTurnoALista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-crear-24.png"))); // NOI18N
        CargarTurnoALista.setText("Cargar a lista");
        CargarTurnoALista.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        CargarTurnoALista.setBorderPainted(false);
        CargarTurnoALista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarTurnoALista.setDoubleBuffered(true);
        CargarTurnoALista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CargarTurnoALista.setIconTextGap(8);
        CargarTurnoALista.setPreferredSize(new java.awt.Dimension(10, 10));
        CargarTurnoALista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarTurnoAListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(17, 17, 17)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(3, 3, 3)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CargarTurnoALista, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(19, 19, 19))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)))))
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel7))
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(83, 83, 83))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)))
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(botonPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CargarTurnoALista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombrePacienteActionPerformed
      
    }//GEN-LAST:event_inputNombrePacienteActionPerformed

    private void botonPrincipal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal2ActionPerformed
     String nombrePaciente = inputNombrePaciente.getText();
    String edad = inputEdad.getText();
    LocalTime horario = LocalTime.parse(verHora.getSelectedValue());

    // Creo el turno
    Turno turno = new Turno();
    turno.setHoraLocal(horario);
    turno.setFechaLocal(fechaSeleccionada);
   
    //CaptandoMedico
      String nombreSeleccionado = inputNombreMedico.getSelectedValue();
    String especialidadSeleccionada = inputEspecialidad.getSelectedValue();

      medicoSeleccionado = compararNombreYespecialidad(nombreSeleccionado, especialidadSeleccionada);
    
       turno.setAsignarMedico(medicoSeleccionado);
 
      
 
    PacienteAmbulatorio paciente = new PacienteAmbulatorio();
    paciente.setTurno(turno);
    paciente.setNombre(nombrePaciente);
    paciente.setEdad(edad);
    
  listaPacientes.agregar(paciente);
    
    inputNombrePaciente.setText("");
    inputEdad.setText("");
    
    

String nombre=paciente.getNombre();
String fechaTurno = paciente.getTurno().getFechaLocal().toString();
String horaTurno = paciente.getTurno().getHoraLocal().toString();
String nombreMedico = paciente.getTurno().getAsignarMedico().getNombre();
String direccionHospital = ultimoHospital().getDireccion(); 
int numCalle = ultimoHospital().getNumCalle();
String ciudad= ultimoHospital().getCiudad();



String mensaje = "El paciente: " + nombre + " tiene un turno el día: " + fechaTurno + " a las: " + horaTurno + "\n";
mensaje += "Será atendido por: " + nombreMedico + "\n";
mensaje += "Presentarse 15 minutos antes en " + direccionHospital+" "+numCalle+" "+","+ciudad ;


JOptionPane.showMessageDialog(null, mensaje, "Turno del Paciente", JOptionPane.INFORMATION_MESSAGE);
       


    }//GEN-LAST:event_botonPrincipal2ActionPerformed

    private void inputFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputFechaPropertyChange
if (evt.getOldValue() != null) {
    Date selectedDate = inputFecha.getCalendar().getTime();
    LocalDate fecha = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    
    fechaSeleccionada = fecha; 
}

    }//GEN-LAST:event_inputFechaPropertyChange

    private void inputEspecialidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputEspecialidadPropertyChange

    
    }//GEN-LAST:event_inputEspecialidadPropertyChange

    private void inputEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEdadActionPerformed

    private void inputNombreMedicoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputNombreMedicoPropertyChange

    }//GEN-LAST:event_inputNombreMedicoPropertyChange

    private void CargarTurnoAListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarTurnoAListaActionPerformed
         int obtenerUltimo = listaHospitales.getTamaño() - 1;
       listaHospitales.obtener(obtenerUltimo).setPacientes(listaPacientes);
    }//GEN-LAST:event_CargarTurnoAListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarTurnoALista;
    private javax.swing.JButton botonPrincipal2;
    private javax.swing.JPanel contenedor;
    private javax.swing.JTextField inputEdad;
    private javax.swing.JList<String> inputEspecialidad;
    private com.toedter.calendar.JCalendar inputFecha;
    private javax.swing.JList<String> inputNombreMedico;
    private javax.swing.JTextField inputNombrePaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> verHora;
    // End of variables declaration//GEN-END:variables
}
