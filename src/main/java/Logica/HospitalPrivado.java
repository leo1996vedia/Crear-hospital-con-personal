
package Logica;



public class HospitalPrivado extends Hospital {
    private MiLista<String> empresasPatrocinadoras;

    public HospitalPrivado() {
    }

    public HospitalPrivado(MiLista<String> empresasPatrocinadoras, String nombre, String direccion,int numCalle, String ciudad) {
        super(nombre, direccion,numCalle, ciudad);
        this.empresasPatrocinadoras = empresasPatrocinadoras;
    }

    public HospitalPrivado(MiLista<String> empresasPatrocinadoras, String nombre, String direccion, int numCalle, String ciudad, MiLista<MedicoHospital> medicos, MiLista<Limpieza> limpiezas, MiLista<Administracion> administracion, MiLista<Recepcionista> recepcionista, MiLista<PacienteAmbulatorio> pacientes) {
        super(nombre, direccion, numCalle, ciudad, medicos, limpiezas, administracion, recepcionista, pacientes);
        this.empresasPatrocinadoras = empresasPatrocinadoras;
    }

  



    public MiLista<String> getEmpresasPatrocinadoras() {
        return empresasPatrocinadoras;
    }

    public void setEmpresasPatrocinadoras(MiLista<String> empresasPatrocinadoras) {
        this.empresasPatrocinadoras = empresasPatrocinadoras;
    }
    
}