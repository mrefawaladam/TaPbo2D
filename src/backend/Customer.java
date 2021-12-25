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
        Customer cs = new Customer();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer "
                                            + " WHERE id_customer = '" + id + "'");
        try{
            while(rs.next()){
                cs = new Customer();
//                cs.setAlamat(rs.getString(rs.getString("alamat")));
                cs.setId_customer(rs.getInt("id_customer"));
                cs.setNama_lengkap(rs.getString("nama_lengkap"));
                cs.setNo_hp(rs.getString("no_hp"));
                cs.setAlamat(rs.getString("alamat"));
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
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer" 
                                        + "     WHERE nama_lengkap LIKE '%" + keyword + "%' "
                                        + "         OR alamat LIKE '%" + keyword + "%' " );
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
    
    public void save(){
   
        if(getById(id_customer).getId_customer() == 0){
            String SQL = "INSERT INTO customer (nama_lengkap, no_hp, alamat) VALUES("
                    + "       '" + this.nama_lengkap + "', " 
                    + "       '" + this.no_hp + "', "
                    + "       '" + this.alamat + "' "
                    + "       )";
            this.id_customer = DBHelper.insertQueryGetId(SQL);
           
        }
        else{
            System.out.println("update");
            String SQL = "UPDATE customer SET "
                    + "     nama_lengkap = '" + this.nama_lengkap + "', " 
                    + "     no_hp = '" + this.no_hp + "', "
                    + "     alamat = '" + this.alamat + "' "
                    + "     WHERE id_customer = '" + this.id_customer + "'";
            DBHelper.executeQuery(SQL);

        }
    }
    
    public boolean delete(){
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahCustomer FROM transaction" + " WHERE id_customer = " 
                                            + this.id_customer + "");
        int jumlahCustomer = 0;
        
        try {
            while(rs.next()){
                jumlahCustomer = rs.getInt("jumlahCustomer");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if(jumlahCustomer == 0){
            String query = "DELETE FROM customer WHERE id_customer = " + this.id_customer;
            DBHelper.executeQuery(query);
            return true;
        }else{
            return false;
        }
    }
}
