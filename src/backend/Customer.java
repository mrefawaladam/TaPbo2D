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
    
    public Customer(String nama_lengkap, String no_hp, String alamat)
    {
        this.nama_lengkap = nama_lengkap ;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }
    
    public static Customer getById(int id){
        System.err.println(id);
        Customer cs = new Customer();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer"
                                        + "id_customer   = '" + id + "'");
        
        try{
            while(rs.next()){
                cs = new Customer();
                cs.setAlamat(rs.getString(rs.getString("alamat")));
                cs.setId_customer(rs.getInt("id_customer"));
                cs.setNama_lengkap(rs.getString("nama_lengkap"));
                cs.setNo_hp(rs.getString("no_hp"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return cs;
    }
    
    public static ArrayList<Customer> getAll(){
        ArrayList<Customer> ListCustomers = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT  * FROM customer");
       
        try{
            while(rs.next()){
                Customer cs= new Customer();
                cs.setId_customer(rs.getInt("id_customer")); 
                cs.setNama_lengkap(rs.getString("nama_lengkap"));
                cs.setNo_hp(rs.getString("no_hp"));
                cs.setAlamat(rs.getString("alamat"));
                ListCustomers.add(cs);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListCustomers;
    }
    
    public static ArrayList<Customer> search(String keyword){
        ArrayList<Customer> ListCustomers = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM " 
                                        + "     WHERE nama_lengkap LIKE '%" + keyword + "%' "
                                        + "         OR alamat LIKE '%" + keyword + "%' " );
        try{
            while(rs.next()){
                Customer cs= new Customer();
                cs.setAlamat(rs.getString(rs.getString("alamat")));
                cs.setId_customer(rs.getInt("id_customer"));
                cs.setNama_lengkap(rs.getString("nama_lengkap"));
                cs.setNo_hp(rs.getString("no_hp"));;
                
                ListCustomers.add(cs);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListCustomers;
    }
    
    public void save(){
        System.err.println("fjasl");
        if(getById(id_customer).getId_customer() == 0){
            String SQL = "INSERT INTO customer (id_customer, nama_lengkap, no_hp, alamat) VALUES("
                    + "       '" + this.nama_lengkap + "', " 
                    + "       '" + this.no_hp + "', "
                    + "       '" + this.alamat + "' "
                    + "       )";
            this.id_customer = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE buku SET"
                         + "       '" + this.nama_lengkap + "', " 
                    + "       '" + this.no_hp + "', "
                    + "       '" + this.alamat +  "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.id_customer + "'";
        DBHelper.executeQuery(SQL);
    }
}
