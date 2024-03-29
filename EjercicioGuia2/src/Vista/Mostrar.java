/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.table.DefaultTableModel;
import ejercicioguia2.Enteros;
import ejercicioguia2.Caracteres;

/**
 *
 * @author frank
 */
public class Mostrar extends javax.swing.JFrame {

    

    public Mostrar() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnteros = new javax.swing.JTable();
        labelEnteros = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCaracteres = new javax.swing.JTable();
        labelCaracteres = new javax.swing.JLabel();
        llenarEnteros = new javax.swing.JButton();
        llenarCaracteres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableEnteros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableEnteros);

        labelEnteros.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        labelEnteros.setText("Numeros enteros (Arreglo) ");

        tablaCaracteres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaCaracteres);

        labelCaracteres.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        labelCaracteres.setText("Cadenas de caracteres (Matriz)");

        llenarEnteros.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        llenarEnteros.setText("Llenar Arreglo");
        llenarEnteros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarEnterosActionPerformed(evt);
            }
        });

        llenarCaracteres.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        llenarCaracteres.setText("Llenar Matriz");
        llenarCaracteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarCaracteresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(llenarEnteros)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCaracteres)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelEnteros)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(llenarCaracteres)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelEnteros)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llenarEnteros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(labelCaracteres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llenarCaracteres)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarCaracteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarCaracteresActionPerformed
        Caracteres caracteres = new Caracteres();
        DefaultTableModel modeloMatriz = new DefaultTableModel();
        
        caracteres.llenarMatriz();
        modeloMatriz.setRowCount(caracteres.getFil());
        modeloMatriz.setColumnCount(caracteres.getCol());
        tablaCaracteres.setModel(modeloMatriz);

        for (int i = 0; i < caracteres.getFil(); i++) {
            for (int j = 0; j < caracteres.getCol(); j++) {
                tablaCaracteres.setValueAt(caracteres.getMatriz()[i][j], i, j);
            }
        }


    }//GEN-LAST:event_llenarCaracteresActionPerformed

    private void llenarEnterosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarEnterosActionPerformed
        Enteros enteros = new Enteros();
        DefaultTableModel modeloArray = new DefaultTableModel();
        
        enteros.llenarArreglo();
        modeloArray.setColumnCount(enteros.getCantidadEnteros());
        
        tableEnteros.setModel(modeloArray);

        Object[] ent = new Object[enteros.getEnteros().length];

        for (int i = 0; i < enteros.getEnteros().length; i++) {
            ent[i] = enteros.getEnteros()[i];

        }

        modeloArray.addRow(ent);


    }//GEN-LAST:event_llenarEnterosActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCaracteres;
    private javax.swing.JLabel labelEnteros;
    private javax.swing.JButton llenarCaracteres;
    private javax.swing.JButton llenarEnteros;
    private javax.swing.JTable tablaCaracteres;
    private javax.swing.JTable tableEnteros;
    // End of variables declaration//GEN-END:variables
}
