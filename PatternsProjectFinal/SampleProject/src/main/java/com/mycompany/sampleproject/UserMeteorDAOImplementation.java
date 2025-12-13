/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sampleproject;


import com.mycompany.sampleproject.Meteor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shonc
 */
public class UserMeteorDAOImplementation implements MeteorDAO{
    private String db_URL;

    public UserMeteorDAOImplementation(String db_URL) {
        this.db_URL=db_URL;
        
    }
    @Override
    public List<Meteor> getAll() {
        ArrayList<Meteor> meteorlist=new ArrayList<>();
        String sql="SELECT * FROM Meteor";
        try(Connection conn=DriverManager.getConnection(db_URL);
            Statement stmt=conn.createStatement();
            ResultSet rs= stmt.executeQuery(sql)){
            
            while(rs.next()){
                Meteor m=new Meteor(
                        rs.getInt("Meteor_ID"),
                        rs.getString("Meteor_Name"), 
                        rs.getString("Meteor_Impact_Date"), 
                        rs.getString("Meteor_Impact_Time"), 
                        rs.getString("Meteor_Impact_Location"),
                        rs.getString("Meteor_Type"), 
                        rs.getDouble("Meteor_Mass"), 
                        rs.getDouble("Meteor_Diameter_M"),
                        rs.getString("Airburst")
                        );
                meteorlist.add(m);            
            }
            return meteorlist;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return meteorlist;
        }
    }
    @Override
    public void addMeteor(Meteor m) {
        String sql="INSERT INTO Meteor(Meteor_Name, Meteor_Impact_Date, Meteor_Impact_Time, Meteor_Impact_Location, Meteor_Type, Meteor_Mass, Meteor_Diameter_M, Airburst)VALUES(?,?,?,?,?,?,?,?)";
        try(Connection conn=DriverManager.getConnection(db_URL);
            PreparedStatement pstmt=conn.prepareStatement(sql);){
            
            pstmt.setString(1, m.getMeteor_Name());
            pstmt.setString(2, m.getMeteor_Impact_date());
            pstmt.setString(3, m.getMeteor_Impact_Time());
            pstmt.setString(4, m.getMeteor_Impact_Location());
            pstmt.setString(5, m.getMeteor_Type());
            pstmt.setDouble(6, m.getMeteor_Mass());
            pstmt.setDouble(7, m.getMeteor_Diameter());
            pstmt.setString(8, m.getAirbust());
            pstmt.executeUpdate();

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        
        }
    }

    @Override
    public void removeMeteor(int id) {
         String sql="DELETE FROM Meteor WHERE Meteor_ID = ?";
        try(Connection conn=DriverManager.getConnection(db_URL);
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ){
            pstmt.setInt(1,id);
            int rowsAffected=pstmt.executeUpdate();

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        
        }
    }

    @Override
    public void updateMeteor(int id, String text, boolean numorno,String sqlstat) {
        try(Connection conn=DriverManager.getConnection(db_URL);
                PreparedStatement pstmt= conn.prepareStatement(sqlstat)
            
            ){
            if(numorno)
            {
                pstmt.setDouble(1, Double.parseDouble(text));
                pstmt.setInt(2, id);
                int rowsAffected = pstmt.executeUpdate();
            
            }
            else{
                pstmt.setString(1, text);
                pstmt.setInt(2, id);
                int rowsAffected = pstmt.executeUpdate();
            
            }
            

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        
        }
        
    }

    
    
    

   
    
    
}
