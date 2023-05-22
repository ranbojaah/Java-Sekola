/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import entity.barang;
import interfc.baranginterfc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.koneksi.koneksi.Koneksi;

/**
 *
 * @author Asus
 */
public class barangimplement implements baranginterfc{
   // insert database 
    public barang insert(barang o) throws SQLException{
        PreparedStatement st = Koneksi.getConnection().prepareStatement("insert into barang values(?,?,?,?)");
        st.setString(1, o.getkodeBarang());
        st.setString(2, o.getNamaBarang());
        st.setString(3, o.getJumlah() +  " ");
        st.setString(4, o.getHarga() + " ");
        st.executeUpdate();
        return o;
    }
    // update ke db
    public void update (barang o) throws SQLException{
        PreparedStatement  st = Koneksi.getConnection().prepareStatement("update barang set nama_barang=?, stok_barang=?,harga_barang=? where kode_barang=?");
        st.setString(1, o.getNamaBarang());
        st.setString(2, o.getJumlah());
        st.setString(3, o.getHarga());
        st.setString(4, o.getkodeBarang());
        st.executeUpdate();
    }
    // delete berdasarkan kode barang
    public void delete(String kode_barang) throws SQLException{
        PreparedStatement st = Koneksi.getConnection().prepareStatement("delete from barang where kode_barang=?");
        st.setString(1, kode_barang);
        st.executeUpdate();
    }
    public List<barang> getAll() throws SQLException{
        Statement st = Koneksi.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from barang");
        List<barang>list = new ArrayList<barang>();
        while (rs.next()){
        barang brg=new barang();
             brg.setkodeBarang(rs.getString("kode_barang"));
             brg.setNamaBarang(rs.getString("nama_barang"));
             brg.setJumlah(rs.getString("stok_barang"));
             brg.setHarga(rs.getString("harga_barang"));
             list.add(brg);
        }
        return list;
    }
}
