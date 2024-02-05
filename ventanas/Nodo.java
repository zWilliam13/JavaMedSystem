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
public class Nodo {

    protected Factura elemento;
    protected Nodo izq;
    protected Nodo der;

    public Nodo(Factura elemento) {
        this.elemento = elemento;
    }
}
