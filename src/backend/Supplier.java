/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Berryl Radian
 */
import java.util.ArrayList;
import java.sql.*;

public class Supplier {
    private int id_supplier;
    private String nama_perusahaan;
    private String alamat_perusahaan;
    private String contact_person;

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNama_perusahaan() {
        return nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
    }

    public String getAlamat_perusahaan() {
        return alamat_perusahaan;
    }

    public void setAlamat_perusahaan(String alamat_perusahaan) {
        this.alamat_perusahaan = alamat_perusahaan;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public Supplier() {
        
    }

    public Supplier(String nama_perusahaan, String alamat_perusahaan, String contact_person) {
        this.nama_perusahaan = nama_perusahaan;
        this.alamat_perusahaan = alamat_perusahaan;
        this.contact_person = contact_person;
    }
    
    public static Supplier getById(int id){
        Supplier spl = new Supplier();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM supplier "
                                            + " WHERE id_supplier = '" + id + "'");
        try{
            while(rs.next()){
                spl = new Supplier();
                spl.setId_supplier(rs.getInt("id_supplier"));
                spl.setNama_perusahaan(rs.getString("nama_perusahaan"));
                spl.setAlamat_perusahaan(rs.getString("alamat_perusahaan"));
                spl.setContact_person(rs.getString("contact_person"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return spl;
    }
    
    public static ArrayList<Supplier> getAll(){
        ArrayList<Supplier> ListSupplier = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM supplier");
        
        try{
            while(rs.next()){
                Supplier spl = new Supplier();
                spl.setId_supplier(rs.getInt("id_supplier"));
                spl.setNama_perusahaan(rs.getString("nama_perusahaan"));
                spl.setAlamat_perusahaan(rs.getString("alamat_perusahaan"));
                spl.setContact_person(rs.getString("contact_person"));
                
                ListSupplier.add(spl);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListSupplier;
    }
    
    public ArrayList<Supplier> search(String keyword){
        ArrayList<Supplier> ListSupplier = new ArrayList();
        
        String sql = "SELECT * FROM supplier WHERE "
                    + "     nama_perusahaan LIKE '%" + keyword + "%' "
                    + "     OR alamat_perusahaan LIKE '%" + keyword + "%' "
                    + "     OR contact_person LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Supplier spl = new Supplier();
                spl.setId_supplier(rs.getInt("id_supplier"));
                spl.setNama_perusahaan(rs.getString("nama_perusahaan"));
                spl.setAlamat_perusahaan(rs.getString("alamat_perusahaan"));
                spl.setContact_person(rs.getString("contact_person"));
                
                ListSupplier.add(spl);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListSupplier;
    }
    
    public void save(){
        if(getById(id_supplier).getId_supplier()== 0){
            String SQL = "INSERT INTO supplier (nama_perusahaan, alamat_perusahaan, contact_person) VALUES("
                    + "       '" + this.nama_perusahaan + "',  "
                    + "       '" + this.alamat_perusahaan + "',  "
                    + "       '" + this.contact_person + "'  "
                    + "       )";
            this.id_supplier = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE supplier SET "
                    + "     nama_perusahaan = '" + this.nama_perusahaan + "', "
                    + "     alamat_perusahaan = '" + this.alamat_perusahaan + "', "
                    + "     contact_person = '" + this.contact_person + "' "
                    + "     WHERE id_supplier = '" + this.id_supplier + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public boolean delete(){
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahSupplier FROM product" + " WHERE id_supplier = " 
                                            + this.id_supplier + "");
        int jumlahSupplier = 0;
        
        try {
            while(rs.next()){
                jumlahSupplier = rs.getInt("jumlahSupplier");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if(jumlahSupplier == 0){
            String query = "DELETE FROM supplier WHERE id_supplier = " + this.id_supplier;
            DBHelper.executeQuery(query);
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return nama_perusahaan;
    }
}