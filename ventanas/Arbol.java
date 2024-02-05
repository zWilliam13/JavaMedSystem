/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import clases.Factura;

/**
 *
 * @author Ing. Peña Aviles
 */
public class Arbol {

    Nodo raiz;

    public boolean buscar(int e) {
        Nodo actual = raiz;
        while (actual != null) {
            if (e < actual.elemento.getNumero()) {
                actual = actual.izq;
            } else if (e > actual.elemento.getNumero()) {
                actual = actual.der;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean insertar(Factura e) {
        Nodo actual = raiz;
        Nodo padre = raiz;
        if (actual == null) {
            //si la raiz es nula se crea
            raiz = new Nodo(e);
        } else {
            padre = actual = raiz;
            while (actual != null) {
                if (e.getNumero() < actual.elemento.getNumero()) {
                    padre = actual;
                    actual = actual.izq;
                } else if (e.getNumero() > actual.elemento.getNumero()) {
                    padre = actual;
                    actual = actual.der;
                } else {
                    return false;
                }
            }
            //Esto permite 
            if (e.getNumero() < padre.elemento.getNumero()) {
                padre.izq = new Nodo(e);
            } else {
                padre.der = new Nodo(e);
            }
        }
        return true;
    }
}
