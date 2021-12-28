/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author MUHAMMAD REFA WALADA
 */

import java.sql.*;


public class Login {
    private String username;
    private String nama_lengkap;
    private String password;
    private int user_id;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }
    
    
    public static Login prosesLogin(String u , String p)
    {
        Login lgn = new Login();
        ResultSet rs = DBHelper.selectQuery( "SELECT * FROM admin WHERE username='"+u+"' AND password='"+p+"'");
        
        
        try{
            while(rs.next()){
                lgn = new Login();
                lgn.setUsername(rs.getString("username"));
                lgn.setNama_lengkap(rs.getString("nama_lengkap"));
                lgn.setPassword(rs.getString("password"));
                lgn.setUser_id(rs.getInt("id_admin"));
                lgn.setStatus(2);
            }
            
        }
        catch (Exception e){
            lgn.setStatus(1);
            e.printStackTrace();
        }
        return lgn;
    }
}
