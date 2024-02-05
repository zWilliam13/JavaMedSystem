/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases.Medicamento3;
import clases.Medicamento3;
import static java.lang.Math.E;

/**
 *
 * @author HOME
 */
public class Arbol2<E extends Comparable<E>> {

    private String nombre;
    private StringBuilder sb;
    nodoArbol<E> raiz;
    int tam = 0;
    Medicamento3 m;

    public Arbol2() {
        raiz = null;
        tam = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public boolean inserta(E e) {
        nodoArbol<E> actual = raiz;
        nodoArbol<E> padre = raiz;
        if (actual == null) {
            raiz = new nodoArbol<>(e);
        } else {
            padre = actual = raiz;
            while (actual != null) {
                if (e.compareTo(actual.elemento) < 0) {
                    padre = actual;
                    actual = actual.izq;
                } else if (e.compareTo(actual.elemento) > 0) {
                    padre = actual;
                    actual = actual.der;
                } else {
                    return false;
                }

            }
            if (e.compareTo(padre.elemento) < 0) {
                padre.izq = new nodoArbol<>(e);
            } else {
                padre.der = new nodoArbol<>(e);
            }
        }
        tam++;
        return true;
    }

    public String postorden() {
        sb = new StringBuilder();
        postorden(raiz, sb);
        sb.insert(0, "PostOrden: ");
        return sb.toString();
    }

    protected void postorden(nodoArbol<E> nodo, StringBuilder sb) {
        if (nodo == null) {
            return;
        }
        postorden(nodo.izq, sb);
        postorden(nodo.der, sb);
        sb.append(nodo.elemento.toString()).append(" ");
    }

    public String preorden() {
        sb = new StringBuilder();
        preorden(raiz, sb);
        sb.insert(0, "PreOrden: ");
        return sb.toString();
    }

    protected void preorden(nodoArbol<E> nodo, StringBuilder sb) {
        if (nodo == null) {
            return;
        }
        sb.append(nodo.elemento.toString()).append(" ");
        preorden(nodo.izq, sb);
        preorden(nodo.der, sb);
    }

    public String inorden() {
        sb = new StringBuilder();
        inorden(raiz, sb);
        sb.insert(0, "InOrden: ");
        return sb.toString();
    }

    protected void inorden(nodoArbol<E> nodo, StringBuilder sb) {
        if (nodo == null) {
            return;
        }
        inorden(nodo.izq, sb);
        sb.append(nodo.elemento.toString()).append(" ");
        inorden(nodo.der, sb);
    }

//    public boolean buscaPorNombre(String nombre) {
    //  return buscaPorNombre(raiz, nombre);
//}

    /*
    public boolean buscaPorNombre(nodoArbol<E> raiz, String nombre) {
    if (raiz == null) {
        return false;
    }

    int comparacion = nombre.compareTo(m.getNombre());
    if (comparacion < 0) {
        return buscaPorNombre(raiz.izq, nombre);
    } else if (comparacion > 0) {
        return buscaPorNombre(raiz.der, nombre);
    } else {
        return true;
    }
}
    
     */
 /*
    public boolean buscaPorNombre(String nombre) {
        nodoArbol<E> actual = raiz;
        while (actual != null) {
            if (actual.elemento instanceof Medicamento3) {
                Medicamento3 medicamento = (Medicamento3) actual.elemento;
                if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                    return true;
                } else if (nombre.compareToIgnoreCase(medicamento.getNombre()) < 0) {
                    actual = actual.izq;
                } else {
                    actual = actual.der;
                }
            } else {
                actual = actual.der;
            }
        }
        return false;
    }
     */
    public String buscaPorNombre(String nombre) {
        sb = new StringBuilder();
        buscaPorNombre(raiz, nombre);
        if (sb.length() > 0) {
            sb.insert(0, "Resultados de búsqueda por nombre \"" + nombre + "\":\n");
        } else {
            sb.append("No se encontraron resultados para el nombre \"" + nombre + "\".");
            System.out.println("");
        }
        return sb.toString();
    }

    public void buscaPorNombre(nodoArbol<E> nodo, String nombre) {
        if (nodo == null) {
            return;
        }
        buscaPorNombre(nodo.izq, nombre);
        if (nodo.elemento instanceof Medicamento3) {
            Medicamento3 medicamento = (Medicamento3) nodo.elemento;
            if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                sb.append(medicamento.toString()).append("\n");
            }
        }
        buscaPorNombre(nodo.der, nombre);
    }

}
