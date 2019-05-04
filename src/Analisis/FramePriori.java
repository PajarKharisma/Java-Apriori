package Analisis;

import java.text.NumberFormat;
import java.util.Vector;
import Sql.Koneksi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class FramePriori extends javax.swing.JFrame {

    Vector<data> dt = new Vector<data>();
    NumberFormat atur = NumberFormat.getInstance();
    SQL sql = new SQL();
    Koneksi koneksi = new Koneksi();
    DefaultTableModel mdl = new DefaultTableModel();

    public FramePriori() throws SQLException {
        initComponents();
        jTextField1.setText(String.valueOf(sql.bnyTransaksi()));
        isidata();
        atur.setMaximumFractionDigits(2);
        tampil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button11 = new javax.swing.JButton();
        btnNavigasiInputPenjualan = new javax.swing.JButton();
        btnNavigasiInputBarang = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(5, 5, 100, 5));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(5, 5, 100, 5));

        jTextField1.setText("200");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ANALISIS APRIORI");

        jLabel2.setText("MINIMUM SUPPORT");

        jLabel3.setText("MINIMUM CONFIDENCE");

        jLabel4.setText("COUNT");

        button11.setText("ANALISIS");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        btnNavigasiInputPenjualan.setText("Input Penjualan");
        btnNavigasiInputPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavigasiInputPenjualanActionPerformed(evt);
            }
        });

        btnNavigasiInputBarang.setText("Input Barang");
        btnNavigasiInputBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavigasiInputBarangActionPerformed(evt);
            }
        });

        btnImport.setText("IMPORT");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(resultTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(btnNavigasiInputPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNavigasiInputBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(39, 39, 39))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNavigasiInputPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNavigasiInputBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tampil() {
        mdl = new DefaultTableModel();
        mdl.addColumn("Barang 1");
        mdl.addColumn("Barang 2");
        mdl.addColumn("Akan Dibeli");
        mdl.addColumn("Supp");
        mdl.addColumn("Conf");
        resultTable.setModel(mdl);
    }

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        System.out.println("dt size : " + dt.size());
        try {
            c2();
            c3();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_button11ActionPerformed

    private void btnNavigasiInputPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavigasiInputPenjualanActionPerformed
        try {
            new FrameInputPenjualan().show();
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnNavigasiInputPenjualanActionPerformed

    private void btnNavigasiInputBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavigasiInputBarangActionPerformed
        try {
            new FrameInputBarang().show();
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnNavigasiInputBarangActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_apriori", "root", "");
            con.setAutoCommit(false);
            PreparedStatement pstm = null;
             JFileChooser chooser = new JFileChooser() ;
            int returnvalue=chooser.showOpenDialog(null);
            File filenya ;
            filenya = chooser.getSelectedFile();
            FileInputStream input = new FileInputStream(filenya);
            POIFSFileSystem fs = new POIFSFileSystem(input);
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;
            /*
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_apriori", "root", "");
            con.setAutoCommit(false);
            PreparedStatement pstm = null;
            FileInputStream input = new FileInputStream("tess.xls");
            POIFSFileSystem fs = new POIFSFileSystem(input);
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;
            */
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = sheet.getRow(i);
                String waktu = row.getCell(0).getStringCellValue();
                String kd = row.getCell(1).getStringCellValue();
                String namaBarang = row.getCell(2).getStringCellValue();
                int qty = (int) row.getCell(3).getNumericCellValue();
                //String qty = row.getCell(3).getStringCellValue();
                String ssql = "insert into tbl_temp_excel values('" + waktu + "', '" + kd + "', '" + namaBarang + "', " + qty + ")";
                pstm = (PreparedStatement) con.prepareStatement(ssql);
                pstm.execute();
                System.out.println("Import rows " + i);
            }
            con.commit();
            pstm.close();
            con.close();
            input.close();
            System.out.println("Success import excel to mysql table");
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FramePriori.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            importToSecondTable();
        } catch (SQLException ex) {
            Logger.getLogger(FramePriori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        jTextArea1.setText(null);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_apriori", "root", "");
            con.setAutoCommit(false);
            PreparedStatement pstm = null;
            PreparedStatement ppstm = null;
            String ssql = "DELETE FROM tbl_analisis";
            pstm = (PreparedStatement) con.prepareStatement(ssql);
            String sssql = "DELETE FROM tbl_hasil";
            ppstm = (PreparedStatement) con.prepareStatement(sssql);
            pstm.executeUpdate();
            ppstm.executeUpdate();
            con.commit();
            pstm.close();
            ppstm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FramePriori.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FramePriori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void importToSecondTable() throws SQLException {
        koneksi.konek();
        try {
            ResultSet set = koneksi.stat.executeQuery("SELECT * FROM tbl_temp_excel");
            while (set.next()) {
                int qty = set.getInt("BNY");
                String waktu = set.getString("NO_NOTA");
                String kd = set.getString("KODE_ITEM");
                String namaBarang = set.getString("NAMA_ITEM");
                for (int i = 0; i < qty; i++) {
                    koneksi.konek();
                    String ssql = "INSERT INTO penjualan_det values('" + waktu + "', '" + kd + "', '" + namaBarang + "','1')";
                    koneksi.stat.executeUpdate(ssql);
                }
            }
            JOptionPane.showMessageDialog(null, "Data berhasil diimport");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        jTextField1.setText(String.valueOf(sql.bnyTransaksi()));
        isidata();
        atur.setMaximumFractionDigits(2);
    }

    private void isidata() throws SQLException {
        dt.removeAllElements();
        try {
            int i = 0;
            int temp = Integer.parseInt(jTextField1.getText()) * Integer.parseInt(jSpinner1.getValue().toString()) / 100;
            System.out.println("Nilai temp : " + temp);
            koneksi.konek();
            ResultSet set = koneksi.stat.executeQuery("SELECT no_nota, count(kode_item), nama_item FROM penjualan_det GROUP BY no_nota HAVING count( kode_item ) >0");
            while (set.next()) {
                i++;
                //System.out.println("Nilai count : " + set.getInt("count(no_nota)"));
                if (set.getInt("count(kode_item)") >= temp) {
                    data data = new data();
                    data.setKode_item(set.getString("no_nota"));
                    data.setNama_item(set.getString("nama_item"));
                    data.setNilai(set.getInt("count(kode_item)"));
                    dt.add(data);
                    System.out.println("im here" + i);
                }
            }
            set.close();
            koneksi.stat.close();
            koneksi.con.close();
        } catch (Exception z) {
        }
    }

    private void c2() throws SQLException {
        koneksi.konek();
        jTextArea1.setText("");
        int n = 0;
        float bnyAB, bnyA, bnyB = 0;
        float supp, conf = 0;

        for (int a = 0; a < dt.size(); a++) {
            System.out.println("dt.size c2 : " + a);
            n++;
            for (int b = 0 + n; b < dt.size(); b++) {
                bnyAB = sql.c2(dt.get(a).getKode_item(), dt.get(b).getKode_item());
                bnyA = dt.get(a).getNilai();
                bnyB = dt.get(b).getNilai();
                supp = bnyAB / Integer.parseInt(jTextField1.getText()) * 100;
                if (supp >= Float.parseFloat(jSpinner1.getValue().toString())) {
                    conf = (bnyAB / bnyA) * 100;
                    if (conf >= Float.parseFloat(jSpinner2.getValue().toString())) {
                        jTextArea1.setText(jTextArea1.getText() + " Jika membeli \" " + dt.get(a).getNama_item() + " \" maka akan membeli \" " + dt.get(b).getNama_item() + " \" dengan Supp  " + atur.format(supp) + "% dan Conf " + atur.format(conf) + "% \n");
                        String ssql = "INSERT INTO tbl_hasil VALUES('" + dt.get(a).getNama_item() + "; " + dt.get(b).getNama_item() + "', '" + atur.format(supp) + "', '" + atur.format(conf) + "')";
                        koneksi.stat.executeUpdate(ssql);
                        mdl.addRow(new Object[]{
                            dt.get(a).getNama_item(),
                            "-",
                            dt.get(b).getNama_item(),
                            atur.format(supp) + " %",
                            atur.format(conf) + " %"
                        });
                        resultTable.setModel(mdl);
                    }

                    conf = (bnyAB / bnyB) * 100;
                    if (conf >= Float.parseFloat(jSpinner2.getValue().toString())) {
                        jTextArea1.setText(jTextArea1.getText() + "Jika membeli \" " + dt.get(b).getNama_item() + " \" maka akan membeli \" " + dt.get(a).getNama_item() + " \" dengan Supp " + atur.format(supp) + "% dan Conf " + atur.format(conf) + "% \n");
                        String ssql = "INSERT INTO tbl_hasil VALUES('" + dt.get(b).getNama_item() + "," + dt.get(a).getNama_item() + "', '" + atur.format(supp) + "', '" + atur.format(conf) + "')";
                        koneksi.stat.executeUpdate(ssql);
                        mdl.addRow(new Object[]{
                            dt.get(b).getNama_item(),
                            "-",
                            dt.get(a).getNama_item(),
                            atur.format(supp) + " %",
                            atur.format(conf) + " %"
                        });
                        resultTable.setModel(mdl);
                    }
                }
            }
        }
    }

    private void c3() throws SQLException {
        koneksi.konek();
        int n = 0, m = 0, o = 0;
        String item1, item2, item3 = "";
        float bnyABC, bnyAB = 0;
        float supp, conf = 0;
        for (int a = 0; a < dt.size(); a++) {
            System.out.println("dt.size c3 : " + a);
            n++;
            for (int b = 0 + n; b < dt.size(); b++) {
                for (int c = 0 + b + 1; c < dt.size(); c++) {
                    bnyABC = sql.c3(dt.get(a).getKode_item(), dt.get(b).getKode_item(), dt.get(c).getKode_item());
                    supp = bnyABC / Integer.parseInt(jTextField1.getText()) * 100;

                    if (supp >= Float.parseFloat(jSpinner1.getValue().toString())) {
                        bnyAB = sql.c2(dt.get(a).getKode_item(), dt.get(b).getKode_item());
                        conf = (bnyABC / bnyAB) * 100;
                        if (conf >= Float.parseFloat(jSpinner2.getValue().toString())) {
                            jTextArea1.setText(jTextArea1.getText() + " Jika membeli \" " + dt.get(a).getNama_item() + " \" dan \" " + dt.get(b).getNama_item() + " \" maka akan membeli \" " + dt.get(c).getNama_item() + " \" dengan Supp " + atur.format(supp) + "% dan Conf " + atur.format(conf) + "% \n");
                            String ssql = "INSERT INTO tbl_hasil VALUES('" + dt.get(a).getNama_item() + "," + dt.get(b).getNama_item() + "," + dt.get(c).getNama_item() + "', '" + atur.format(supp) + "', '" + atur.format(conf) + "')";
                            koneksi.stat.executeUpdate(ssql);
                            mdl.addRow(new Object[]{
                                dt.get(a).getNama_item(),
                                dt.get(b).getNama_item(),
                                dt.get(c).getNama_item(),
                                atur.format(supp) + " %",
                                atur.format(conf) + " %"
                            });
                            resultTable.setModel(mdl);
                        }

                        bnyAB = sql.c2(dt.get(a).getKode_item(), dt.get(c).getKode_item());
                        conf = (bnyABC / bnyAB) * 100;
                        if (conf >= Float.parseFloat(jSpinner2.getValue().toString())) {
                            jTextArea1.setText(jTextArea1.getText() + " Jika membeli \" " + dt.get(a).getNama_item() + " \" dan \" " + dt.get(c).getNama_item() + " \" maka akan membeli \" " + dt.get(b).getNama_item() + " \" dengan Supp " + atur.format(supp) + "% dan Conf " + atur.format(conf) + "% \n");
                            String ssql = "INSERT INTO tbl_hasil VALUES('" + dt.get(a).getNama_item() + "," + dt.get(c).getNama_item() + "," + dt.get(b).getNama_item() + "', '" + atur.format(supp) + "', '" + atur.format(conf) + "')";
                            koneksi.stat.executeUpdate(ssql);
                            mdl.addRow(new Object[]{
                                dt.get(a).getNama_item(),
                                dt.get(c).getNama_item(),
                                dt.get(b).getNama_item(),
                                atur.format(supp) + " %",
                                atur.format(conf) + " %"
                            });
                            resultTable.setModel(mdl);
                        }

                        bnyAB = sql.c2(dt.get(b).getKode_item(), dt.get(c).getKode_item());
                        conf = (bnyABC / bnyAB) * 100;
                        if (conf >= Float.parseFloat(jSpinner2.getValue().toString())) {
                            jTextArea1.setText(jTextArea1.getText() + " Jika membeli \" " + dt.get(b).getNama_item() + " \" dan \" " + dt.get(c).getNama_item() + " \" Maka akan membeli \" " + dt.get(a).getNama_item() + " \" dengan Supp " + atur.format(supp) + "% dan Conf " + atur.format(conf) + "% \n");
                            String ssql = "INSERT INTO tbl_hasil VALUES('" + dt.get(b).getNama_item() + "," + dt.get(c).getNama_item() + "," + dt.get(a).getNama_item() + "', '" + atur.format(supp) + "', '" + atur.format(conf) + "')";
                            koneksi.stat.executeUpdate(ssql);
                            mdl.addRow(new Object[]{
                                dt.get(b).getNama_item(),
                                dt.get(c).getNama_item(),
                                dt.get(a).getNama_item(),
                                atur.format(supp) + " %",
                                atur.format(conf) + " %"
                            });
                            resultTable.setModel(mdl);
                        }
                    }
                }
            }
        }
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
            java.util.logging.Logger.getLogger(FramePriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FramePriori().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FramePriori.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnNavigasiInputBarang;
    private javax.swing.JButton btnNavigasiInputPenjualan;
    private javax.swing.JButton button11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
