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

public class Admin {
    private int id_admin;
    private String nama_lengkap;
    private String username;
    private String password;
    private String no_hp;
    private String alamat;

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Admin() {
        
    }

    public Admin(String nama_lengkap, String username, String password, String no_hp, String alamat) {
        this.nama_lengkap = nama_lengkap;
        this.username = username;
        this.password = password;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }
    
    public static Admin getById(int id){
        Admin adm = new Admin();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM admin "
                                            + " WHERE id_admin = '" + id + "'");
        try{
            while(rs.next()){
                adm = new Admin();
                adm.setId_admin(rs.getInt("id_admin"));
                adm.setNama_lengkap(rs.getString("nama_lengkap"));
                adm.setUsername(rs.getString("username"));
                adm.setPassword(rs.getString("password"));
                adm.setNo_hp(rs.getString("no_hp"));
                adm.setAlamat(rs.getString("alamat"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return adm;
    }
    
    public static ArrayList<Admin> getAll(){
        ArrayList<Admin> ListAdmin = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM admin");
        
        try{
            while(rs.next()){
                Admin adm = new Admin();
                adm.setId_admin(rs.getInt("id_admin"));
                adm.setNama_lengkap(rs.getString("nama_lengkap"));
                adm.setUsername(rs.getString("username"));
                adm.setPassword(rs.getString("password"));
                adm.setNo_hp(rs.getString("no_hp"));
                adm.setAlamat(rs.getString("alamat"));
                
                ListAdmin.add(adm);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListAdmin;
    }
    
    public ArrayList<Admin> search(String keyword){
        ArrayList<Admin> ListAdmin = new ArrayList();
        
        String sql = "SELECT * FROM admin WHERE "
                    + "     nama_lengkap LIKE '%" + keyword + "%' "
                    + "     OR username LIKE '%" + keyword + "%' "
                    + "     OR no_hp LIKE '%" + keyword + "%' "
                    + "     OR alamat LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Admin adm = new Admin();
                adm.setId_admin(rs.getInt("id_admin"));
                adm.setNama_lengkap(rs.getString("nama_lengkap"));
                adm.setUsername(rs.getString("username"));
                adm.setPassword(rs.getString("password"));
                adm.setNo_hp(rs.getString("no_hp"));
                adm.setAlamat(rs.getString("alamat"));
                
                ListAdmin.add(adm);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListAdmin;
    }
    
    public void save(){
        if(getById(id_admin).getId_admin()== 0){
            String SQL = "INSERT INTO admin (nama_lengkap, username, password, no_hp, alamat) VALUES("
                    + "       '" + this.nama_lengkap + "',  "
                    + "       '" + this.username + "',  "
                    + "       '" + this.password + "',  "
                    + "       '" + this.no_hp + "',  "
                    + "       '" + this.alamat + "'  "
                    + "       )";
            this.id_admin = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE admin SET "
                    + "     nama_lengkap = '" + this.nama_lengkap + "', "
                    + "     username = '" + this.username + "', "
                    + "     password = '" + this.password + "', "
                    + "     no_hp = '" + this.no_hp + "', "
                    + "     alamat = '" + this.alamat + "' "
                    + "     WHERE id_admin = '" + this.id_admin + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM admin WHERE id_admin = '" + this.id_admin + "'";
        DBHelper.executeQuery(SQL);
    }
}
