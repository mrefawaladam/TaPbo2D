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


public class Brand {
    private int id_brand;
    private String nama_brand;

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    public String getNama_brand() {
        return nama_brand;
    }

    public void setNama_brand(String nama_brand) {
        this.nama_brand = nama_brand;
    }

    public Brand() {
        
    }

    public Brand(String nama_brand) {
        this.nama_brand = nama_brand;
    }
    
    public static Brand getById(int id){
        Brand brd = new Brand();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM brand "
                                            + " WHERE id_brand = '" + id + "'");
        try{
            while(rs.next()){
                brd = new Brand();
                brd.setId_brand(rs.getInt("id_brand"));
                brd.setNama_brand(rs.getString("nama_brand"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return brd;
    }
    
    public static ArrayList<Brand> getAll(){
        ArrayList<Brand> ListBrand = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM brand");
        
        try{
            while(rs.next()){
                Brand brd = new Brand();
                brd.setId_brand(rs.getInt("id_brand"));
                brd.setNama_brand(rs.getString("nama_brand"));
                
                ListBrand.add(brd);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListBrand;
    }
    
    public ArrayList<Brand> search(String keyword){
        ArrayList<Brand> ListBrand = new ArrayList();
        
        String sql = "SELECT * FROM brand WHERE "
                    + "     nama_brand LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Brand brd = new Brand();
                brd.setId_brand(rs.getInt("id_brand"));
                brd.setNama_brand(rs.getString("nama_brand"));
                
                ListBrand.add(brd);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListBrand;
    }
    
    public void save(){
        if(getById(id_brand).getId_brand()== 0){
            String SQL = "INSERT INTO brand (nama_brand) VALUES("
                    + "       '" + this.nama_brand + "'  "
                    + "       )";
            this.id_brand = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE brand SET "
                    + "     nama_brand = '" + this.nama_brand + "' "
                    + "     WHERE id_brand = '" + this.id_brand + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM brand WHERE id_brand = '" + this.id_brand + "'";
        DBHelper.executeQuery(SQL);
    }
}
