/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Ordenamiento;
import clases.Medicamento;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Peña Aviles
 */
public class ViewBusqueda extends javax.swing.JFrame {

    /**
     * Creates new form ViewBusqueda
     */
    Busqueda bus = new Busqueda();
    Ordenamiento ord = new Ordenamiento();
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
    Medicamento medicamento4 = new Medicamento("BRONCOPULMIN ", 7.10,
            "pastilla dura", "Medigenix",
            "pastilla", 5, "pastilla ", 1042);
    Medicamento medicamento5 = new Medicamento("MEJORAL", 10.50, "tabletas antimigraña", "Innovatec Labs", "tabletas", 20, "Tabletas", 1040);
    Medicamento medicamento6 = new Medicamento("PLAQUINOL", 130, "tableta antimalaria", "Pharminnova", "tabletas", 7, "tabletas", 1039);
    Medicamento[] miArreglo = new Medicamento[6];

    public ViewBusqueda() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        miArreglo[0] = medicamento1;
        miArreglo[1] = medicamento2;
        miArreglo[2] = medicamento3;
        miArreglo[3] = medicamento4;
        miArreglo[4] = medicamento5;
        miArreglo[5] = medicamento6;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreMedicamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        busCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buscar medicamento por nombre");

        jLabel2.setText("Buscar medicamento por codigo");

        nombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreMedicamentoActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        busCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busCodigoActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ordenar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Mostrar todos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(busCodigo))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(busCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMedicamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nombreMedicamento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado el nombre del medicamento");
        } else {
            txtResultado.setText("");
            for (Integer elemento : bus.busquedaSecuencial(miArreglo, nombreMedicamento.getText().toUpperCase())) {
                txtResultado.append("Nombre de medicamento : " + miArreglo[elemento].getNombre()
                        + "\nPrecio Medicamento : " + miArreglo[elemento].getPrecio()
                        + "\nStock disponible : " + miArreglo[elemento].getStock()
                        + "\nDescripcion :" + miArreglo[elemento].getDescripcion()
                        + "\nNombre fabricante :" + miArreglo[elemento].getNombreFabricante()
                        + "\nPresentacion :" + miArreglo[elemento].getPresentacion()
                        + "\nTipo de medicamento :" + miArreglo[elemento].getTipoMedicamento()
                        + "\nCodigo de medicamento :" + miArreglo[elemento].getCodigo() + "\n\n");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (busCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado el codigo del medicamento");
        } else {
            
            int codigo = Integer.parseInt(busCodigo.getText());
            ord.ordenarBurbuja(miArreglo);
            txtResultado.setText("");
            txtResultado.append("Codigo del medicamento :"
                    + miArreglo[bus.busquedaBinaria(miArreglo, codigo)]
                            .getCodigo() + "\nNombre de medicamento : "
                    + miArreglo[bus.busquedaBinaria(miArreglo, codigo)]
                            .getNombre()
                    + "\nPrecio medicamento :" + miArreglo[bus.busquedaBinaria(miArreglo, codigo)]
                            .getPrecio() + "\nStock disponible :"
                    + miArreglo[bus.busquedaBinaria(miArreglo, codigo)].getStock());
            miArreglo[0] = medicamento1;
            miArreglo[1] = medicamento2;
            miArreglo[2] = medicamento3;
            miArreglo[3] = medicamento4;
            miArreglo[4] = medicamento5;
            miArreglo[5] = medicamento6;
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void busCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busCodigoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
//        ord.ordenarBurbuja(miArreglo);
        for (int i = 0; i < miArreglo.length; i++) {
            txtResultado.append("Codigo de medicamento :" + miArreglo[i].getCodigo()
                    + "\nNombre de medicamento :" + miArreglo[i].getNombre()
                    + "\nPrecio :" + miArreglo[i].getPrecio() + "\nStock Disponible :" + miArreglo[i].getStock()
                    + "\nDescripcion :" + miArreglo[i].getDescripcion() + "\n\n");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
        ord.OrdenarInsercion(miArreglo);
        for (int i = 0; i < miArreglo.length; i++) {
            txtResultado.append("Codigo :" + miArreglo[i].getCodigo() + "\nNombre de medicamento :" + miArreglo[i].getNombre()
                    + "\nPrecio :" + miArreglo[i].getPrecio() + "\nStock Disponible :" + miArreglo[i].getStock()
                    + "\nDescripcion :" + miArreglo[i].getDescripcion() + "\n\n");
        }
        miArreglo[0] = medicamento1;
        miArreglo[1] = medicamento2;
        miArreglo[2] = medicamento3;
        miArreglo[3] = medicamento4;
        miArreglo[4] = medicamento5;
        miArreglo[5] = medicamento6;
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreMedicamento;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables

}