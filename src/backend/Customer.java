/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author MUHAMMAD REFA WALADA
 */
public class Customer {
    private int id_customer;
    private String nama_lengkap;
    private String no_hp;
    private String alamat;

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public Customer(){
    }
    
    public Customer(String nama_lengkap, String no_p, String alamat)
    {
        this.nama_lengkap = nama_lengkap ;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }
    
    public static Customer getById(int id){
        Customer cs = new Customer();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.idbuku = '" + id + "'");
        try{
            while(rs.next()){
                cs = new Customer();
                cs.setAlamat(rs.getString(rs.alamat));
                
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return buku;
    }
    
    public static ArrayList<Customer> getAll(){
        ArrayList<Customer> ListBuku = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT  * FROM customer");
        try{
            while(rs.next()){
                Customer cs= new Customer();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public static ArrayList<Buku> search(String keyword){
        ArrayList<Buku> ListBuku = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.judul LIKE '%" + keyword + "%' "
                                        + "         OR b.penerbit LIKE '%" + keyword + "%' "
                                        + "         OR b.penulis LIKE '%" + keyword + "%' ");
        try{
            while(rs.next()){
                Buku buku= new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void save(){
        if(getById(idbuku).getIdbuku() == 0){
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + "       '" + this.judul + "', "
                    + "       '" + this.getKategori().getIdkategori() + "', "
                    + "       '" + this.penulis + "', "
                    + "       '" + this.penerbit + "' "
                    + "       )";
            this.idbuku = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE buku SET"
                    + "       judul = '" + this.judul + "', "
                    + "       idkategori = '" + this.getKategori().getIdkategori() + "', "
                    + "       penulis = '" + this.penulis + "', "
                    + "       penerbit = '" + this.penerbit + "' "
                    + "       WHERE idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper.executeQuery(SQL);
    }
}
