package ventanas;

import clases.Medicamento;
import java.util.ArrayList;

public class Busqueda {

    public ArrayList<Integer> busquedaSecuencial(Medicamento[] arreglo, String valorBuscado) {
        ArrayList<Integer> miLista = new ArrayList<Integer>();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].getNombre().contains(valorBuscado)) {
                miLista.add(i);
            }
        }
        return miLista;
    }

    public int busquedaBinaria(Medicamento[] arr, int valorBuscado) {
        int izq = 0;
        int der = arr.length - 1;

        while (izq <= der) {
            int medio = (izq + der) / 2;
            if (arr[medio].getCodigo() == valorBuscado) {
                return medio;
            } else if (arr[medio].getCodigo() < valorBuscado) {
                izq = medio + 1;
            } else {
                der = medio - 1;
            }
        }
        return -1;
    }
}
