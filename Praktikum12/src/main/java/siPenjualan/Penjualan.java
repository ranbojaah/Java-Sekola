/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siPenjualan;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import penjualan.view.barangView;
import penjualan.view.pelangganView;
import penjualan.view.transaksiView;

/**
 *
 * @author Asus
 */
public class Penjualan extends javax.swing.JFrame {

    /**
     * Creates new form Penjualan
     */
    public Penjualan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuBarang = new javax.swing.JMenuItem();
        menuPelanggan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuPenjualan = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("HOME");
        menuBar.add(jMenu1);

        jMenu2.setMnemonic('m');
        jMenu2.setText("MASTER");

        menuBarang.setText("BARANG");
        menuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarangActionPerformed(evt);
            }
        });
        jMenu2.add(menuBarang);

        menuPelanggan.setText("PELANGGAN");
        menuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPelangganActionPerformed(evt);
            }
        });
        jMenu2.add(menuPelanggan);

        menuBar.add(jMenu2);

        jMenu3.setMnemonic('t');
        jMenu3.setText("TRANSAKSI");

        jMenuItem3.setText("PEMBELIAN");
        jMenu3.add(jMenuItem3);

        menuPenjualan.setText("PENJUALAN");
        menuPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPenjualanActionPerformed(evt);
            }
        });
        jMenu3.add(menuPenjualan);

        menuBar.add(jMenu3);

        jMenu4.setText("LAPORAN");
        menuBar.add(jMenu4);

        jMenu5.setText("HELP");
        menuBar.add(jMenu5);

        jMenu6.setText("LOGOUT");
        menuBar.add(jMenu6);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPelangganActionPerformed
        pelangganView pv = new pelangganView();
        pv.setLocationRelativeTo(null);
        pv.setVisible(true);
    }//GEN-LAST:event_menuPelangganActionPerformed

    private void menuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarangActionPerformed
        barangView bv = new barangView();
        bv.setLocationRelativeTo(null);
        bv.setVisible(true);
    }//GEN-LAST:event_menuBarangActionPerformed

    private void menuPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPenjualanActionPerformed
        transaksiView trans = null;
        try{
            trans = new transaksiView();
        } catch(SQLException ex){
            Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE,null, ex);
        }
        trans.setLocationRelativeTo(null);
        trans.setVisible(true);
    }//GEN-LAST:event_menuPenjualanActionPerformed

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
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuBarang;
    private javax.swing.JMenuItem menuPelanggan;
    private javax.swing.JMenuItem menuPenjualan;
    // End of variables declaration//GEN-END:variables
}
