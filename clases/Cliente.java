/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ing. Peña Aviles
 */
public class Cliente {

    private String nombre;
    private int edad;
    private int codigoAtencion;
    private String prioridad;
    private int numPrio;

    public Cliente(String nombre, int edad, int codigoAtencion,String prioridad) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigoAtencion = codigoAtencion;
        this.prioridad=prioridad;
    }

    public int getCodigoAtencion() {
        return codigoAtencion;
    }

    public void setCodigoAtencion(int codigoAtencion) {
        this.codigoAtencion = codigoAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getNumPrio() {
        return numPrio;
    }

    public void setNumPrio(int numPrio) {
        this.numPrio = numPrio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int numeroPrioridad(){
        int resultado=0;
        if (prioridad=="Alta") {
            resultado=100+getNumPrio();
        }else if(prioridad=="Intermedia"){
            resultado=20+getNumPrio();
        }else{
            resultado=getNumPrio();
        }
        return resultado;
    }

}
