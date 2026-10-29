/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.exerciseagenta.view;

import co.edu.sena.exerciseagenta.controller.IShedController;
import co.edu.sena.exerciseagenta.controller.ShedController;
import co.edu.sena.exerciseagenta.model.Shed;
import co.edu.sena.exerciseagenta.utils.MessageUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 22 / 10 / 26
 * @author Juan José Lozano Holguín
 * objetivo: Gestionar visualmente los galpones y sus estados mediante una interfaz gráfica.
 */
public class JFrameShed extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrameShed.class.getName());
    private final IShedController shedController = new ShedController();

    public JFrameShed() {
        initComponents();
        fillTable();
    }

    public void fillTable() {
        DefaultTableModel model = new DefaultTableModel();
        jTable_Sheds.setModel(model);
        model.addColumn("Numero");
        model.addColumn("Estado");
        String[] rows = new String[2];
        for (Shed s : ShedController.shedList) {
            rows[0] = String.valueOf(s.getNumber());
            rows[1] = s.getState();
            model.addRow(rows);
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_Tittle = new javax.swing.JLabel();
        jLabel_Number = new javax.swing.JLabel();
        jLabel_Status = new javax.swing.JLabel();
        jTextField_Number = new javax.swing.JTextField();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jButton_Insert = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Clean = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Sheds = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GENERRALIDADES DEL GALPÓN");

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1_Tittle.setText("GALPÓN");

        jLabel_Number.setText("Número de Galpón:");

        jLabel_Status.setText("Estado del Galpón:");

        jTextField_Number.addActionListener(this::jTextField_NumberActionPerformed);

        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN:", "DISPONIBLE", "OCUPADO" }));
        jComboBox_Status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_StatusMouseClicked(evt);
            }
        });

        jButton_Insert.setText("INSERTAR");
        jButton_Insert.addActionListener(this::jButton_InsertActionPerformed);

        jButton_Update.setText("MODIFICAR");
        jButton_Update.addActionListener(this::jButton_UpdateActionPerformed);

        jButton_Delete.setText("ELIMINAR");
        jButton_Delete.addActionListener(this::jButton_DeleteActionPerformed);

        jButton_Clean.setText("LIMPIAR");
        jButton_Clean.addActionListener(this::jButton_CleanActionPerformed);

        jTable_Sheds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable_Sheds);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Number)
                            .addComponent(jLabel_Status))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Number)
                            .addComponent(jComboBox_Status, 0, 279, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Insert)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_Update)
                        .addGap(31, 31, 31)
                        .addComponent(jButton_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Clean)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1_Tittle)
                                .addGap(203, 203, 203))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_Tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Number)
                    .addComponent(jTextField_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Status)
                    .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Insert)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Delete)
                    .addComponent(jButton_Clean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_StatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_StatusMouseClicked
      int rowSelected = jTable_Sheds.getSelectedRow();
        if (rowSelected != -1) {
            jButton_Update.setEnabled(true);
            jButton_Delete.setEnabled(true);
            jButton_Insert.setEnabled(false);

            int numberSelected = Integer.parseInt(jTable_Sheds.getValueAt(rowSelected, 0).toString());
            try {
                //CONSULTAR POR ID
                Shed shed = shedController.find(numberSelected);
                jTextField_Number.setText(String.valueOf(shed.getNumber()));
                jComboBox_Status.setSelectedItem(shed.getState());
            } catch (Exception ex) {
                MessageUtils.getInstance().showError(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox_StatusMouseClicked
    
    public void clear() {
        jTextField_Number.setText("");
        jComboBox_Status.setSelectedIndex(0);
        jTable_Sheds.clearSelection();
        jButton_Insert.setEnabled(true);
        jButton_Update.setEnabled(false);
        jButton_Delete.setEnabled(false);
    }
    
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        int option = MessageUtils.getInstance().showConfirm("Está seguro de eliminar el registro?");
        if (option == JOptionPane.YES_OPTION) {
            try {
                shedController.delete(Integer.parseInt(jTextField_Number.getText()));
                MessageUtils.getInstance().showInfo("Registro eliminado exitosamente");
                clear();
                fillTable();
            } catch (Exception ex) {
                MessageUtils.getInstance().showError(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CleanActionPerformed
        clear();
    }//GEN-LAST:event_jButton_CleanActionPerformed

    private void jButton_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertActionPerformed
        try {
            Shed shed = new Shed();
            shed.setNumber(Integer.parseInt(jTextField_Number.getText()));
            shed.setState(jComboBox_Status.getSelectedItem().toString());

            shedController.insert(shed);
            MessageUtils.getInstance().showInfo("El registro fue creado exitosamente");
            clear();
        } catch (NumberFormatException ex) {
            MessageUtils.getInstance().showError("El número del galpón debe contener solo números");
        } catch (Exception ex) {
            MessageUtils.getInstance().showError(ex.getMessage());
        }
    }//GEN-LAST:event_jButton_InsertActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        try {
            Shed shed = new Shed();
            shed.setNumber(Integer.parseInt(jTextField_Number.getText()));
            shed.setState(jComboBox_Status.getSelectedItem().toString());

            shedController.update(shed);
            MessageUtils.getInstance().showInfo("El registro fue modificado exitosamente");
            clear();
        } catch (NumberFormatException ex) {
            MessageUtils.getInstance().showError("El número del galpón debe contener solo números");
        } catch (Exception ex) {
            MessageUtils.getInstance().showError(ex.getMessage());
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jTextField_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NumberActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrameShed().setVisible(true));
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clean;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Insert;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private javax.swing.JLabel jLabel1_Tittle;
    private javax.swing.JLabel jLabel_Number;
    private javax.swing.JLabel jLabel_Status;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Sheds;
    private javax.swing.JTextField jTextField_Number;
    // End of variables declaration//GEN-END:variables

   

}