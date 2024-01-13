/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class EnfermeroHospital {

        private String nombre;
        private String sexo;
        private String fechaNacimiento;
        private String dni;
        private String nacionalidad;
        private String institucion;
        private String titulo;
        
          public EnfermeroHospital() {
       
    }

        public EnfermeroHospital(String nombre, String sexo, String fechaNacimiento, String dni, String nacionalidad,
                         String institucion, String titulo) {
            this.nombre = nombre;
            this.sexo = sexo;
            this.fechaNacimiento = fechaNacimiento;
            this.dni = dni;
            this.nacionalidad = nacionalidad;
            this.institucion = institucion;
            this.titulo = titulo;
        }

  

        // Getters and Setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }



        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    }