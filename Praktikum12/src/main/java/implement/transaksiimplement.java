/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import penjualan.koneksi.koneksi.Koneksi;

/**
 *
 * @author Asus
 */
public class transaksiimplement {
    
    public int urutanDb(){
        Connection con = (Connection) Koneksi.getConnection();
        int jml = 0;
        try{
            String sql = "SELECT count(*) AS urutan FROM penjualan";
            Statement rs = (Statement) con.createStatement();
            ResultSet count = rs.executeQuery(sql);
            while (count.next()){
                jml = count.getInt("urutan");
            }
            rs.close();
            count.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ++jml;
    }
    
    public ArrayList<String> viewKdBrg() throws SQLException{
        ArrayList<String> viewNamaBrg = new ArrayList();
        try{
            Statement kt = Koneksi.getConnection().createStatement();
            ResultSet rsKb = kt .executeQuery("SELECT kode_barang,nama_barang FROM barang");
            while (rsKb.next()){
                viewNamaBrg.add(rsKb.getString("kode_barang")+"-"+ (rsKb.getString("nama_barang")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return viewNamaBrg;
    }
    
    public ArrayList<String> viewIdPlg() throws SQLException{
        ArrayList<String> viewNamaPlg = new ArrayList();
        try{
            Statement kt = Koneksi.getConnection().createStatement();
            ResultSet rsKb = kt.executeQuery("SELECT id_pelanggan, nama FROM pelanggan");
            while (rsKb.next()){
                viewNamaPlg.add(rsKb.getString("id_pelanggan")+" - "+ (rsKb.getString("nama")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return viewNamaPlg;
    }
}
