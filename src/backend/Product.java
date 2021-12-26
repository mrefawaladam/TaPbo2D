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
 * @author refa
 */
public class Product {
    
    
    private int productId;
    private Supplier suplier = new Supplier();
    private Brand brand = new Brand();
    private String versi;
    private int storage;
    private int ram;
    private String processor;
    private int harga;
    private int stok;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Supplier getSuplier() {
        return suplier;
    }

    public void setSuplier(Supplier supier) {
        this.suplier = supier;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getVersi() {
        return versi;
    }

    public void setVersi(String versi) {
        this.versi = versi;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int Storage) {
        this.storage = Storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public Product(){
        
    }
    
    public Product(Supplier suplier, Brand brand, String versi , int ram , String processor,int storage, int harga, int stok){
        this.suplier = suplier;
        this.brand = brand;
        this.versi = versi;
        this.ram = ram ;
        this.processor = processor;
        this.storage = storage;
        this.harga = harga;
        this.stok = stok ;       
    }
    
    public static Product getById(int id){
        Product pd = new Product();
        ResultSet rs = DBHelper.selectQuery("SELECT *"
                                        + "     FROM product p "
                                        + "     LEFT JOIN supplier s ON s.id_supplier = p.id_supplier "
                                        + "     LEFT JOIN brand b ON b.id_brand = p.id_brand "
                                        + "     WHERE p.id_product = '" + id + "'");
        try{
            while(rs.next()){
                pd = new Product();
                pd.setProductId(rs.getInt("id_product"));
                pd.getSuplier().setId_supplier(rs.getInt("id_supplier"));
                pd.getSuplier().setNama_perusahaan(rs.getString("nama_perusahaan"));
                pd.getBrand().setId_brand(rs.getInt("id_brand"));
                pd.getBrand().setNama_brand(rs.getString("nama_brand"));
                pd.setVersi(rs.getString("versi"));
                pd.setStorage(rs.getInt("storage"));
                pd.setRam(rs.getInt("ram"));
                pd.setProcessor(rs.getString("processor"));
                pd.setHarga(rs.getInt("harga"));
                pd.setStok(rs.getInt("stok"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return pd;
    }
    
    public static ArrayList<Product> getAll(){
        ArrayList<Product> ListProduct = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT *"
                                        + "     FROM product p "
                                        + "     LEFT JOIN supplier s ON s.id_supplier = p.id_supplier "
                                        + "     LEFT JOIN brand b ON b.id_brand = p.id_brand ");
        
        try{
            while(rs.next()){
                Product pd = new Product();
                pd.setProductId(rs.getInt("id_product"));
                pd.getSuplier().setId_supplier(rs.getInt("id_supplier"));
                pd.getSuplier().setNama_perusahaan(rs.getString("nama_perusahaan"));
                pd.getBrand().setId_brand(rs.getInt("id_brand"));
                pd.getBrand().setNama_brand(rs.getString("nama_brand"));
                pd.setVersi(rs.getString("versi"));
                pd.setStorage(rs.getInt("storage"));
                pd.setRam(rs.getInt("ram"));
                pd.setProcessor(rs.getString("processor"));
                pd.setHarga(rs.getInt("harga"));
                pd.setStok(rs.getInt("stok"));
                
                ListProduct.add(pd);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListProduct;
    }
    
    public ArrayList<Product> search(String keyword){
        ArrayList<Product> ListProduct = new ArrayList();
        
        String sql = "SELECT *"
                    + "     FROM product p  "
                    + "     LEFT JOIN supplier s ON s.id_supplier = p.id_supplier "
                    + "     LEFT JOIN brand b ON b.id_brand = p.id_brand "
                    + "     WHERE "
                    + "     versi LIKE '%" + keyword + "%' "
                    + "     OR storage LIKE '%" + keyword + "%' "
                    + "     OR nama_brand LIKE '%" + keyword + "%' "
                    + "     OR nama_perusahaan LIKE '%" + keyword + "%' "
                    + "     OR ram LIKE '%" + keyword + "%' "
                    + "     OR processor LIKE '%" + keyword + "%' "
                    + "     OR harga LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Product pd = new Product();
                pd.setProductId(rs.getInt("id_product"));
                pd.getSuplier().setId_supplier(rs.getInt("id_supplier"));
                pd.getSuplier().setNama_perusahaan(rs.getString("nama_perusahaan"));
                pd.getBrand().setId_brand(rs.getInt("id_brand"));
                pd.getBrand().setNama_brand(rs.getString("nama_brand"));
                pd.setVersi(rs.getString("versi"));
                pd.setStorage(rs.getInt("storage"));
                pd.setRam(rs.getInt("ram"));
                pd.setProcessor(rs.getString("processor"));
                pd.setHarga(rs.getInt("harga"));
                pd.setStok(rs.getInt("stok"));
                
                ListProduct.add(pd);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListProduct;
    }
    
    public void save(){
        if(getById(productId).getProductId()== 0){
            String SQL = "INSERT INTO product (id_supplier, id_brand, versi, storage, ram, processor, harga, stok) VALUES("
                    + "       '" + this.getSuplier().getId_supplier()+ "', "
                    + "       '" + this.getBrand().getId_brand()+ "', "
                    + "       '" + this.versi+ "', "
                    + "       '" + this.storage+ "', "
                    + "       '" + this.ram+ "', "
                    + "       '" + this.processor+ "', "
                    + "       '" + this.harga + "', "
                    + "       '" + this.stok + "' "
                    + "       )";
            this.productId = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE product SET"
                    + "       id_supplier = '" + this.getSuplier().getId_supplier() + "', "
                    + "       id_brand = '" + this.getBrand().getId_brand()+ "', "
                    + "       versi = '" + this.versi + "', "
                    + "       storage = '" + this.storage + "', "
                    + "       ram = '" + this.ram + "', "
                    + "       processor = '" + this.processor + "', "
                    + "       harga = '" + this.harga + "', "
                    + "       stok = '" + this.stok + "' "
                    + "       WHERE id_product = '" + this.productId + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public boolean delete(){
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahProduk FROM transaction" + " WHERE id_product = " 
                                            + this.productId + "");
        int jumlahProduk = 0;
        
        try {
            while(rs.next()){
                jumlahProduk = rs.getInt("jumlahProduk");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if(jumlahProduk == 0){
            String query = "DELETE FROM product WHERE id_product = " + this.productId;
            DBHelper.executeQuery(query);
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return versi;
    }
     
}
