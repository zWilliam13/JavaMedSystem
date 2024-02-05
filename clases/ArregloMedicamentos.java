/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ing. Peña Aviles
 */
public class ArregloMedicamentos {
    
    private Medicamento[] miArreglo = new Medicamento[3];

    public ArregloMedicamentos() {
        Medicamento medicamento1 = new Medicamento("PARACETAMOL", 5.40,
                "medicamento para la gripa", "Panadol",
                "pastilla", 4, "analgesico", 1044);
        Medicamento medicamento2 = new Medicamento("CREMA REGENERADORA BEPANTHEN",
                22.30,
                "crema para la piel", "Bepanthen",
                "pomada", 2, "crema", 1041);
        Medicamento medicamento3 = new Medicamento("CREMA REGENERADORA  ZARIDON", 5.50,
                "tableta recubierta", "Novalex Pharma",
                "tableta", 10, "tableta ", 1043);
        miArreglo[0] = medicamento1;
        miArreglo[1] = medicamento2;
        miArreglo[2] = medicamento3;
      
    }

    public Medicamento[] getMiArreglo() {
        return miArreglo;
    }
    
    

}
