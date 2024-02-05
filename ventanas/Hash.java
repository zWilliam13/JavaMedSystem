/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import clases.Proveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Peña Aviles
 */
public class Hash {

    Proveedor dato;
    int estado;//0 vacio,1 eliminado,2 ocupado

    static int funcion(int n, int m) {
        return ((n + 1) % m);
    }

    static void insertaHash(Hash[] h, Proveedor n, int m) {
        boolean i = false;
        int j = funcion(n.getCodigo(), m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].estado = 2;
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            JOptionPane.showMessageDialog(null, "Proveedor registrado");
        } else {
            JOptionPane.showMessageDialog(null, "Tabla llena");
        }
    }

    static int buscaHash(Hash[] h, int n, int m) {
        int j = funcion(n, m);
        while (j < m) {
            if (h[j].estado == 0) {
                return -1;
            } else if (h[j].dato.getCodigo() == n) {
                if (h[j].estado == 1) {
                    return -1;
                } else {
                    return j;
                }
            }
            j++;
        }
        return -1;
    }

    static int eliminaHash(Hash[] h, int n, int m) {
        int i = buscaHash(h, n, m);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            return 1;
        }
    }
}
