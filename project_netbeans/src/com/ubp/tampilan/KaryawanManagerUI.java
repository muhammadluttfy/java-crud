/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubp.tampilan;

import com.ubp.manager.KaryawanManager;
import com.ubp.model.KaryawanModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dizzay
 */
public class KaryawanManagerUI extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanManagerUI
     */
    // inisialisasi table model
    DefaultTableModel tableModel;
    KaryawanManager karyawanManager;
    boolean sedangDiEdit = false;
    public KaryawanManagerUI() {
        initComponents();
        karyawanManager = new KaryawanManager();
        tampilDataTable();
    }
    
    private void tampilDataTable(){
        String[] kolom = {"ID","Nama","NIK","Gaji","Alamat"};
        tableModel = new DefaultTableModel(null, kolom);
        for(KaryawanModel model : karyawanManager.tampilSemua()){
            String[] row = new String[kolom.length];
            row[0] = String.valueOf(model.getId());
            row[1] = model.getNama();
            row[2] = model.getNik();
            row[3] = model.getGaji();
            row[4] = model.getAlamat();
            tableModel.addRow(row);
        }
        tbl_main.setModel(tableModel);
        tbl_main.clearSelection();
    }
    
    private void refresh(){
        tampilDataTable();
        clearData();
        sedangDiEdit = false;
    }
    
    private void clearData(){
        tf_nama.setText("");
        tf_nik.setText("");
        tf_gaji.setText("");
        tf_alamat.setText("");
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
        tf_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nik = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_gaji = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_alamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_main = new javax.swing.JTable();
        bt_simpan = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        bt_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Karyawan Manager");

        jLabel2.setText("Nama");

        jLabel3.setText("NIK");

        jLabel4.setText("Gaji");

        jLabel5.setText("Alamat");

        tbl_main.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_main);

        bt_simpan.setText("Simpan");
        bt_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_simpanMouseClicked(evt);
            }
        });

        bt_delete.setText("Delete");
        bt_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deleteMouseClicked(evt);
            }
        });

        bt_refresh.setText("Refresh");
        bt_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(tf_nik)
                    .addComponent(jLabel4)
                    .addComponent(tf_gaji)
                    .addComponent(jLabel5)
                    .addComponent(tf_alamat)
                    .addComponent(tf_nama)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bt_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_simpan)
                            .addComponent(bt_delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_refresh)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_simpanMouseClicked
        // TODO add your handling code here:
        String nama = tf_nama.getText();
        String nik = tf_nik.getText();
        String gaji = tf_gaji.getText();
        String alamat = tf_alamat.getText();
        
        if(!nama.isEmpty() && !nik.isEmpty() && !gaji.isEmpty() && !alamat.isEmpty()){
            if(sedangDiEdit){
                String id = (String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0);
                karyawanManager.update(nama, nik, gaji, alamat, Integer.valueOf(id));
            }else{
                karyawanManager.insert(nama, nik, gaji, alamat);
            }
            refresh();
        }else {
            JOptionPane.showMessageDialog(null,"Tidak boleh ada yang kosong !");
        }
    }//GEN-LAST:event_bt_simpanMouseClicked

    private void bt_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deleteMouseClicked

        // TODO add your handling code here:
        if(sedangDiEdit){
            String id = (String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0);
            karyawanManager.delete(id);
            refresh();
        }
    }//GEN-LAST:event_bt_deleteMouseClicked

    private void bt_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_refreshMouseClicked
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_bt_refreshMouseClicked

    private void tbl_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mainMouseClicked
        // TODO add your handling code here:
        sedangDiEdit = true;
        String id = (String) tbl_main.getValueAt(tbl_main.getSelectedRow(), 0);
        KaryawanModel model = karyawanManager.byId(Integer.valueOf(id));
        tf_nama.setText(model.getNama());
        tf_nik.setText(model.getNik());
        tf_gaji.setText(model.getGaji());
        tf_alamat.setText(model.getAlamat());
    }//GEN-LAST:event_tbl_mainMouseClicked

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
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanManagerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_main;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_gaji;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_nik;
    // End of variables declaration//GEN-END:variables
}