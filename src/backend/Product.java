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
    
    public Product(int id_product, Supplier suplier, Brand brand, String versi , int ram , String processor,int storage, int harga, int stok){
        this.productId = id_product;
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
        Product produk = new Product();
        ResultSet rs = DBHelper.selectQuery("SELECT product.*,supplier.nama_perusahaan,brand.nama_brand  " 
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.idbuku = '" + id + "'");
        try{
            while(rs.next()){
                produk = new Product();
                produk.setProductId(rs.getInt("id_product"));
                produk.getSuplier().setId_supplier(rs.getInt("id_supplier")); 
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return produk;
    }
    
    public static ArrayList<Product> getAll(){
        ArrayList<Product> ListProduct = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT product.*,supplier.nama_perusahaan,brand.nama_brand " 
                                        + "     FROM product "
                                        + "     INNER JOIN brand on brand.id_brand = product.id_brand "
                                        + "     INNER JOIN supplier on supplier.id_supplier = product.id_supplier");
        try{
            while(rs.next()){
                Product product = new Product();
                product.setProductId(rs.getInt("idbuku")); 
                product.getSuplier().setId_supplier(rs.getInt("id_supplier"));
                product.getSuplier().setNama_perusahaan(rs.getString("nama_perusahaan"));
                product.getBrand().setId_brand(rs.getInt("id_brand")); 
                product.getBrand().setNama_brand(rs.getString("nama_brand"));  
                product.setVersi(rs.getString("versi"));
                product.setStorage(rs.getInt("storage"));
                product.setRam(rs.getInt("ram"));
                product.setProcessor(rs.getString("processor"));
                product.setHarga(rs.getInt("harga"));
                product.setStok(rs.getInt("stok"));
                
                ListProduct.add(product);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListProduct;
    }
    
    public static ArrayList<Product> search(String keyword){
        ArrayList<Product> ListProduct = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT product.*,supplier.nama_perusahaan,brand.nama_brand " 
                                        + "     FROM product "
                                        + "     INNER JOIN brand on brand.id_brand = product.id_brand "
                                        + "     INNER JOIN supplier on supplier.id_supplier = product.id_supplier "

                                        + "     WHERE product.versi LIKE '%" + keyword + "%' "
                                        + "         OR brand.nama_brand LIKE '%" + keyword + "%' "
                                        + "         OR supplier.nama_perusahaan LIKE '%" + keyword + "%' ");
        try{
            while(rs.next()){
                 Product product = new Product();
                product.setProductId(rs.getInt("idbuku")); 
                product.getSuplier().setId_supplier(rs.getInt("id_supplier"));
                product.getSuplier().setNama_perusahaan(rs.getString("nama_perusahaan"));
                product.getBrand().setId_brand(rs.getInt("id_brand")); 
                product.getBrand().setNama_brand(rs.getString("nama_brand"));  
                product.setVersi(rs.getString("versi"));
                product.setStorage(rs.getInt("storage"));
                product.setRam(rs.getInt("ram"));
                product.setProcessor(rs.getString("processor"));
                product.setHarga(rs.getInt("harga"));
                product.setStok(rs.getInt("stok"));
                
                ListProduct.add(product);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListProduct;
    }
    
    public void save(){
        if(getById(productId).getProductId()== 0){
            String SQL = "INSERT INTO product (`id_supplier`, `id_brand`, `versi`, `storage`, `ram`, `processor`, `harga`, `stok`) VALUES("
 
                    + "       '" + this.getSuplier().getId_supplier()+ "', "
                    + "       '" + this.getBrand().getId_brand()+ "', "
                    + "       '" + this.versi + "' "
                    + "       '" + this.storage + "' "
                    + "       '" + this.ram + "' "
                    + "       '" + this.processor+ "' "
                    + "       '" + this.harga + "' "
                    + "       '" + this.stok + "' "
                    
                    + "       )";
            this.productId = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE product SET"
                    + "       id_brand = '" + this.getBrand().getId_brand() + "', "
                    + "       id_supplier = '" + this.getSuplier().getId_supplier() + "', "
                    + "       versi = '" + this.versi + "', "
                    + "       storage = '" + this.storage + "' "
                      + "       ram = '" + this.ram + "' "
                      + "       processor = '" + this.processor + "' "
                      + "       harga = '" + this.harga + "' "
                      + "       stok = '" + this.stok + "' "
                    + "       WHERE id_product = '" + this.productId + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM product WHERE idbuku = '" + this.productId + "'";
        DBHelper.executeQuery(SQL);
    }
     
}
