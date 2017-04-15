package Domain;

import GUI.JPPrincipal;

public class Sesion {

    private String nombre;
    private int numeroPuesto;
    private String nombrePuesto;
    private boolean sesionIniciada;
    private int privilege;
    private JPPrincipal jpPrincipal;

    public Sesion(JPPrincipal jpPrincipal) {
        this.nombre = "";
        this.numeroPuesto = 0;
        this.nombrePuesto = "";
        this.sesionIniciada = false;
        this.privilege = 0;
        this.jpPrincipal = jpPrincipal;
    }//END DEFAULT CONSTRUCTPOR

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isSesionIniciada() {
        return sesionIniciada;
    }
    public void setSesionIniciada(boolean sesionIniciada) {
        this.sesionIniciada = sesionIniciada;
    }
    public int getPrivilege() {
        return privilege;
    }
    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }
    public int getPuesto() {
        return numeroPuesto;
    }
    public void setPuesto(int puesto) {
        this.numeroPuesto = puesto;
    }
    public String getNombrePuesto() {
        return nombrePuesto;
    }
    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }
}//END CLASS SESION
