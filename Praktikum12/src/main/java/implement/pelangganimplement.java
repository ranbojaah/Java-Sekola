/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import entity.pelanggan;
import interfc.pelangganinterfc;
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
public class pelangganimplement implements pelangganinterfc{
    
    public pelanggan insert (pelanggan o) throws SQLException{
        PreparedStatement st = Koneksi.getConnection().prepareStatement("insert into pelanggan values(?,?,?,?,?)");
        st.setString(1, o.getIdPelanggan());
        st.setString(2, o.getNama());
        st.setString(3,o.getJeniskel());
        st.setString(4,o.getAlamat());
        st.setString(5, o.getNotlp());
        st.executeUpdate();
        return o;
    }
    public void update(pelanggan o) throws SQLException{
        PreparedStatement st = Koneksi.getConnection().prepareStatement("update pelanggan set nama=?, jeniskel=?, alamat=?, notlp=? where id_pelanggan=?");
        st.setString(1, o.getNama());
        st.setString(2, o.getJeniskel());
        st.setString(3,o.getAlamat());
        st.setString(4, o.getNotlp());
        st.setString(5, o.getIdPelanggan());
        st.executeUpdate();
    }
    //delete data berdasarkan kode barang
    public void delete(String id_pelanggan) throws SQLException{
        PreparedStatement st = Koneksi.getConnection().prepareStatement("delete from pelanggan where id_pelanggan=?");
        st.setString(1, id_pelanggan);
        st.executeUpdate();
    }
    public List<pelanggan> getAll() throws SQLException{
        Statement st = Koneksi.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from pelanggan");
        List<pelanggan>list= new ArrayList<pelanggan>();
        while(rs.next()){
            pelanggan plg = new pelanggan();
            plg.setIdPelanggan(rs.getString("id_pelanggan"));
            plg.setNama(rs.getString("nama"));
            plg.setJeniskel(rs.getString("jeniskel"));
            plg.setAlamat(rs.getString("alamat"));
            plg.setNotlp(rs.getString("notlp"));
            list.add(plg);
        }
        return list;
    }
}
