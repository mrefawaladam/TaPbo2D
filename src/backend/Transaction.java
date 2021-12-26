/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Transaction {
    
    private int id_transaction;
    private Admin admin = new Admin();
    private Product product = new Product();
    private Customer customer = new Customer();
    private String tanggal;
    private int qty;
    private int total;

    public Transaction() {
        
    }

    public Transaction(Admin admin, Product product, Customer customer, String tanggal, int qty, int total) {
        this.admin = admin;
        this.product = product;
        this.customer = customer;
        this.tanggal = tanggal;
        this.qty = qty;
        this.total = total;
    }

    public int getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(int id_transaction) {
        this.id_transaction = id_transaction;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public static Transaction getById(int id){
        Transaction ts = new Transaction();
        ResultSet rs = DBHelper.selectQuery("SELECT *"
                                        + "     FROM transaction t "
                                        + "     LEFT JOIN admin a ON t.id_admin = a.id_admin "
                                        + "     LEFT JOIN product p ON p.id_product= t.id_product "
                                        + "     LEFT JOIN customer c ON c.id_customer= t.id_customer "
                                        + "     WHERE t.id_transaction = '" + id + "'");
        try{
            while(rs.next()){
                ts = new Transaction();
                ts.setId_transaction(rs.getInt("id_transaction"));
                ts.getAdmin().setId_admin(rs.getInt("id_admin"));
                ts.getAdmin().setNama_lengkap(rs.getString("a.nama_lengkap"));
                ts.getProduct().setProductId(rs.getInt("id_product"));
                ts.getProduct().setVersi(rs.getString("versi"));
                ts.getProduct().setHarga(rs.getInt("harga"));
                ts.getCustomer().setId_customer(rs.getInt("id_customer"));
                ts.getCustomer().setNama_lengkap(rs.getString("c.nama_lengkap"));
                ts.setTanggal(rs.getString("tanggal"));
                ts.setQty(rs.getInt("qty"));
                ts.setTotal(rs.getInt("total"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ts;
    }
    
    public static ArrayList<Transaction> getAll(){
        ArrayList<Transaction> ListTransaction = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT *"
                                        + "     FROM transaction t "
                                        + "     LEFT JOIN admin a ON t.id_admin = a.id_admin "
                                        + "     LEFT JOIN product p ON p.id_product= t.id_product "
                                        + "     LEFT JOIN customer c ON c.id_customer= t.id_customer ");
        
        try{
            while(rs.next()){
                Transaction ts = new Transaction();
                ts.setId_transaction(rs.getInt("id_transaction"));
                ts.getAdmin().setId_admin(rs.getInt("id_admin"));
                ts.getAdmin().setNama_lengkap(rs.getString("a.nama_lengkap"));
                ts.getProduct().setProductId(rs.getInt("id_product"));
                ts.getProduct().setVersi(rs.getString("versi"));
                ts.getProduct().setHarga(rs.getInt("harga"));
                ts.getCustomer().setId_customer(rs.getInt("id_customer"));
                ts.getCustomer().setNama_lengkap(rs.getString("c.nama_lengkap"));
                ts.setTanggal(rs.getString("tanggal"));
                ts.setQty(rs.getInt("qty"));
                ts.setTotal(rs.getInt("total"));
                
                ListTransaction.add(ts);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListTransaction;
    }
    
    public ArrayList<Transaction> search(String keyword){
        ArrayList<Transaction> ListTransaction = new ArrayList();
        
        String sql = "SELECT *"
                    + "     FROM transaction t "
                    + "     LEFT JOIN admin a ON t.id_admin = a.id_admin "
                    + "     LEFT JOIN product p ON p.id_product= t.id_product "
                    + "     LEFT JOIN customer c ON c.id_customer= t.id_customer "
                    + "     WHERE "
                    + "     c.nama_lengkap LIKE '%" + keyword + "%' "
                    + "     OR a.nama_lengkap LIKE '%" + keyword + "%' "
                    + "     OR versi LIKE '%" + keyword + "%' "
                    + "     OR tanggal LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Transaction ts = new Transaction();
                ts.setId_transaction(rs.getInt("id_transaction"));
                ts.getAdmin().setId_admin(rs.getInt("id_admin"));
                ts.getAdmin().setNama_lengkap(rs.getString("a.nama_lengkap"));
                ts.getProduct().setProductId(rs.getInt("id_product"));
                ts.getProduct().setVersi(rs.getString("versi"));
                ts.getProduct().setHarga(rs.getInt("harga"));
                ts.getCustomer().setId_customer(rs.getInt("id_customer"));
                ts.getCustomer().setNama_lengkap(rs.getString("c.nama_lengkap"));
                ts.setTanggal(rs.getString("tanggal"));
                ts.setQty(rs.getInt("qty"));
                ts.setTotal(rs.getInt("total"));
                
                ListTransaction.add(ts);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListTransaction;
    }
    
    public void save(){
        if(getById(id_transaction).getId_transaction()== 0){
            String SQL = "INSERT INTO transaction (id_admin, id_product, id_customer, qty, total) VALUES("
                    + "       '" + this.getAdmin().getId_admin()+ "', "
                    + "       '" + this.getProduct().getProductId()+ "', "
                    + "       '" + this.getCustomer().getId_customer()+ "', "
                    + "       '" + this.qty+ "', "
                    + "       '" + this.qty * this.getProduct().getHarga() + "' "
                    + "       )";
            this.id_transaction = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE transaction SET"
                    + "       id_admin = '" + this.getAdmin().getId_admin() + "', "
                    + "       id_product = '" + this.getProduct().getProductId()+ "', "
                    + "       id_customer = '" + this.getCustomer().getId_customer() + "', "
                    + "       qty = '" + this.qty + "', "
                    + "       total = '" + this.qty * this.getProduct().getHarga()+ "' "
                    + "       WHERE id_transaction = '" + this.id_transaction + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public boolean delete(){
        String SQL = "DELETE FROM transaction WHERE id_transaction = '" + this.id_transaction + "'";
        DBHelper.executeQuery(SQL);
        return true;
    }
}
