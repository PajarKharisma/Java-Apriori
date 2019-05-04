package Analisis;

import Sql.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.general.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;
 

public class FrameInputPenjualan extends javax.swing.JFrame {

    Koneksi koneksi = new Koneksi();
    int valueNoNota = 0;
    String noNota, kodeItem, namaItem;
    int hargaJual, banyak, total;
    DefaultTableModel mdl = new DefaultTableModel();

    public FrameInputPenjualan() throws SQLException {
        initComponents();
        koneksi.konek();
        getLastValue();
        getValueOfComboBox();
        tampil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenjualan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblNoNota = new javax.swing.JLabel();
        btnLihatSemua = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        cbNamaBarang = new javax.swing.JComboBox();
        txtKodeItem = new javax.swing.JTextField();
        txtHargaJual = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAnalisis = new javax.swing.JButton();
        btnInputData = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("INPUT DATA PENJUALAN");

        tblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tblPenjualan);

        jLabel2.setText("NO NOTA");

        lblNoNota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNoNota.setText("     ");

        btnLihatSemua.setText("Lihat Semua");
        btnLihatSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatSemuaActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSelesai.setText("Selesai");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });

        cbNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamaBarangActionPerformed(evt);
            }
        });

        txtKodeItem.setEnabled(false);

        txtHargaJual.setEnabled(false);

        jLabel3.setText("NAMA BARANG");

        jLabel4.setText("HARGA JUAL");

        jLabel5.setText("KODE BARANG");

        jLabel6.setText("BANYAK");

        btnAnalisis.setText("ANALISIS");
        btnAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisActionPerformed(evt);
            }
        });

        btnInputData.setText("INPUT DATA BARANG");
        btnInputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputDataActionPerformed(evt);
            }
        });

        jButton1.setText("Grafik");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNoNota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbNamaBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtKodeItem)
                                            .addComponent(txtHargaJual)
                                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addComponent(btnLihatSemua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblNoNota))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKodeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLihatSemua)
                    .addComponent(btnTambah)
                    .addComponent(btnSelesai)
                    .addComponent(jButton1))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        setBounds(0, 0, 731, 515);
    }// </editor-fold>//GEN-END:initComponents

    int rowCount = 0;
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        int stokTemp = 0;
        int stokFinal;

        noNota = "" + valueNoNota;
        kodeItem = txtKodeItem.getText();
        namaItem = "" + cbNamaBarang.getSelectedItem();
        hargaJual = Integer.parseInt(txtHargaJual.getText());
        banyak = Integer.parseInt(txtJumlah.getText());
        total = hargaJual * banyak;
        try {
            ResultSet set = koneksi.stat.executeQuery("SELECT * FROM barang WHERE KODE_ITEM='" + kodeItem + "'");
            while (set.next()) {
                stokTemp = set.getInt("STOK");
            }
            stokFinal = stokTemp - banyak;
            if (stokFinal < 0) {
                JOptionPane.showMessageDialog(null, "MAAF STOK TIDAK MENCUKUPI !!!");
            } else {
                koneksi.stat.executeUpdate("UPDATE barang SET STOK=" + stokFinal + " WHERE KODE_ITEM='" + kodeItem + "'");
                koneksi.stat.executeUpdate("INSERT INTO `penjualan_det` values("
                        + "'" + noNota + "','" + kodeItem + "','" + namaItem + "'," + hargaJual + "," + banyak + "," + total + ")");
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIINPUT !!!");
                mdl.addRow(new Object[]{
                    noNota, kodeItem, namaItem, "" + hargaJual, "" + banyak, "" + total
                });
                rowCount++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        resetText();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void cbNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamaBarangActionPerformed
        if (cbNamaBarang.getSelectedItem().equals("Susu")) {
            txtKodeItem.setText("110101521454485");
            txtHargaJual.setText("" + 7000);
        }
        if (cbNamaBarang.getSelectedItem().equals("Teh")) {
            txtKodeItem.setText("110101521454480");
            txtHargaJual.setText("" + 800);
        }
        if (cbNamaBarang.getSelectedItem().equals("Gula")) {
            txtKodeItem.setText("110101521456589");
            txtHargaJual.setText("" + 6000);
        }
        if (cbNamaBarang.getSelectedItem().equals("Roti")) {
            txtKodeItem.setText("110101521456574");
            txtHargaJual.setText("" + 1000);
        }
        if (cbNamaBarang.getSelectedItem().equals("Kopi")) {
            txtKodeItem.setText("110101521456666");
            txtHargaJual.setText("" + 2000);
        }
    }//GEN-LAST:event_cbNamaBarangActionPerformed

    private void btnLihatSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatSemuaActionPerformed
        try {
            deleteTable();
            tampilSemua();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnLihatSemuaActionPerformed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        deleteTable();
        try {
            getLastValue();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "#ERROR : " + e.getMessage());
        }
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void btnInputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputDataActionPerformed
        try {
            new FrameInputBarang().show();
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "#ERROR : " + e.getMessage());
        }
    }//GEN-LAST:event_btnInputDataActionPerformed

    private void btnAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisActionPerformed
        try {
            new FramePriori().show();
        } catch (SQLException ex) {
            Logger.getLogger(FrameInputPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnAnalisisActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int jmlh = 0;
        String nota = null;
        DefaultPieDataset dpd = new DefaultPieDataset();
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        try {
        ResultSet set = koneksi.stat.executeQuery("SELECT * FROM `v_sort`");
        while (set.next()) {
            jmlh = set.getInt("jumlah");
            nota = set.getString("NO_NOTA");
            //dpd.setValue(nota, jmlh);
            dcd.setValue(jmlh, nota, "Agustus");
        }
     
      
     /*JFreeChart freeChart = ChartFactory.createPieChart("Grafik Penjualan",dpd,true,true, false); //String title,PieDatasheet datasheet,boolean legends,boolean tooltips,boolean url 
     ChartFrame cf = new ChartFrame("Data Grafik Penjualan",freeChart);
     cf.setSize(500,400);
     cf.setVisible(true);
     cf.setLocationRelativeTo(null);*/
     
     
     JFreeChart freeChart = ChartFactory.createBarChart("Penjualan","NO NOTA","BANYAK BELI", dcd, PlotOrientation.VERTICAL,true, true,true); //String arg0,String arg1,String arg2,Category Datasheet,Plot Orientation,boolean arg4,boolean arg5,boolean arg6
     ChartFrame cf = new ChartFrame("Data Penjualan",freeChart);
         
        cf.setSize(500,400);
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
     } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tampil() {
        mdl.addColumn("NO NOTA");
        mdl.addColumn("KODE ITEM");
        mdl.addColumn("NAMA ITEM");
        mdl.addColumn("HARGA JUAL");
        mdl.addColumn("QTY");
        mdl.addColumn("TOTAL");
        tblPenjualan.setModel(mdl);
    }
    

    private void getLastValue() throws SQLException {
        ResultSet set = koneksi.stat.executeQuery("SELECT `NO_NOTA` FROM `penjualan_det` ORDER BY `NO_NOTA` DESC LIMIT 1");
        while (set.next()) {
            valueNoNota = set.getInt("NO_NOTA") + 1;
        }
        lblNoNota.setText("" + valueNoNota);
    }

    private void getValueOfComboBox() throws SQLException {
        ResultSet set = koneksi.stat.executeQuery("SELECT DISTINCT `NAMA_ITEM` FROM `penjualan_det`");
        while (set.next()) {
            cbNamaBarang.addItem(set.getString("NAMA_ITEM"));
        }
    }

    private void resetText() {
        txtKodeItem.setText(null);
        txtHargaJual.setText(null);
        txtJumlah.setText(null);
    }

    private void tampilSemua() throws SQLException {
        ResultSet set = koneksi.stat.executeQuery("SELECT * FROM `penjualan_det`");
        while (set.next()) {
            mdl.addRow(new Object[]{
                set.getString("NO_NOTA"),
                set.getString("KODE_ITEM"),
                set.getString("NAMA_ITEM"),
                set.getInt("HARGA_JUAL"),
                set.getInt("BNY"),
                set.getInt("total")
            });
            tblPenjualan.setModel(mdl);
        }
    }
    

    private void tampilPenjualan() throws SQLException {
        ResultSet set = koneksi.stat.executeQuery("SELECT * FROM `penjualan_det` ORDER BY `NO_NOTA` DESC LIMIT 1");
        while (set.next()) {
            mdl.addRow(new Object[]{
                set.getString("NO_NOTA"),
                set.getString("KODE_ITEM"),
                set.getString("NAMA_ITEM"),
                set.getInt("HARGA_JUAL"),
                set.getInt("BNY"),
                set.getInt("total")
            });
            tblPenjualan.setModel(mdl);
        }
    }

    private void deleteTable() {
        for (int i = 0; i < rowCount; i++) {
            mdl.removeRow(0);
            tblPenjualan.setModel(mdl);
          //  tblPenjualan1.setModel(mdl);
        }
        rowCount = 0;
    }

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
            java.util.logging.Logger.getLogger(FrameInputPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInputPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInputPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInputPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrameInputPenjualan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrameInputPenjualan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisis;
    private javax.swing.JButton btnInputData;
    private javax.swing.JButton btnLihatSemua;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cbNamaBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNoNota;
    private javax.swing.JTable tblPenjualan;
    private javax.swing.JTextField txtHargaJual;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKodeItem;
    // End of variables declaration//GEN-END:variables
}
