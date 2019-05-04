package Analisis;

import Sql.Koneksi;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SQL {

    Koneksi koneksi = new Koneksi();

    public int bnyTransaksi() {
        int jml = 0;
        try {
            koneksi.konek();
            ResultSet set=koneksi.stat.executeQuery("select * from v_jumlah");
            //ResultSet set = koneksi.stat.executeQuery("SELECT NO_NOTA AS jumlah FROM penjualan_det GROUP BY NO_NOTA HAVING (NO_NOTA>1)");
            while (set.next()) {
                jml++;
            }

            set.close();
            koneksi.stat.close();
            koneksi.con.close();
        } catch (Exception z) {
            JOptionPane.showMessageDialog(null, z.getMessage());
        }
        return jml;
    }

    public int c2(String a, String b) {
        int jml = 0;
        try {
            koneksi.konek();
            ResultSet set = koneksi.stat.executeQuery("select COUNT(DISTINCT kode_item)as ddd from penjualan_det "
                    + "where "
                    + "kode_item in ( select kode_item from penjualan_det where no_nota='" + a + "') "
                    + "and "
                    + "kode_item in ( select kode_item from penjualan_det where no_nota='" + b + "')");
            while (set.next()) {
                jml = set.getInt("ddd");
            }
            set.close();
            koneksi.stat.close();
            koneksi.con.close();
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        return jml;
    }

    public int c3(String a, String b, String c) {
        int jml = 0;
        try {
            koneksi.konek();
            ResultSet set = koneksi.stat.executeQuery("select count(DISTINCT kode_item) from penjualan_det "
                    + "where "
                    + "kode_item in ( select kode_item from penjualan_det where no_nota='" + a + "') "
                    + "and "
                    + "kode_item in ( select kode_item from penjualan_det where no_nota='" + b + "') "
                    + "and "
                    + "kode_item in ( select kode_item from penjualan_det where no_nota='" + c + "')");
            while (set.next()) {
                jml = set.getInt("count(DISTINCT kode_item)");
            }
            set.close();
            koneksi.stat.close();
            koneksi.con.close();
        } catch (Exception z) {
            JOptionPane.showMessageDialog(null, z.getMessage());
        }
        return jml;
    }
}