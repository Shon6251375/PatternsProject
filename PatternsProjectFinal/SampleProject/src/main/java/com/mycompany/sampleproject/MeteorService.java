/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sampleproject;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shonc
 */
public class MeteorService {
    UserMeteorDAOImplementation umdi;

    public MeteorService() {
        this.umdi = new UserMeteorDAOImplementation("jdbc:sqlite:C:/Users/shonc/Downloads/PatternsProject/MeteorDatabase.db");
    }
    
    public void viewTable(JTable jTable1)
    {
        List<Meteor> meteorlist=umdi.getAll();
        DefaultTableModel newmodel=(DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < meteorlist.size(); i++) {
            
            newmodel.addRow(new Object[]
            {
                meteorlist.get(i).getMeteor_id(),
                meteorlist.get(i).getMeteor_Name(),
                meteorlist.get(i).getMeteor_Impact_date(),
                meteorlist.get(i).getMeteor_Impact_Time(),
                meteorlist.get(i).getMeteor_Impact_Location(),
                meteorlist.get(i).getMeteor_Type(),
                meteorlist.get(i).getMeteor_Mass(),
                meteorlist.get(i).getMeteor_Diameter(),
                meteorlist.get(i).getAirbust()
            });
            
        }
        
    
    }
    
    public void addAMeteor(JTextField meteor_name,JTextField meteor_Impact_Date,JTextField meteor_Impact_time,JTextField meteor_Impact_Location,JTextField meteor_Impact_type,JTextField meteor_Impact_mass,JTextField meteor_Impact_diamater,JTextField meteor_Impact_airburst)
    {
        Meteor m=new Meteor(meteor_name.getText(), meteor_Impact_Date.getText(), meteor_Impact_time.getText(), meteor_Impact_Location.getText(), meteor_Impact_type.getText(), Double.parseDouble(meteor_Impact_mass.getText()), Double.parseDouble(meteor_Impact_diamater.getText()), meteor_Impact_airburst.getText());
        umdi.addMeteor(m);
    
    }
    
    public void removeaMeteor(JTextField id,JTable jtab)
    {
        umdi.removeMeteor(Integer.parseInt(id.getText()));
        List<Meteor> meteorlist=umdi.getAll();
        
        DefaultTableModel newmodel=(DefaultTableModel) jtab.getModel();
        newmodel.setRowCount(0);
         for (int i = 0; i < meteorlist.size(); i++) {
            
            newmodel.addRow(new Object[]
            {
                meteorlist.get(i).getMeteor_id(),
                meteorlist.get(i).getMeteor_Name(),
                meteorlist.get(i).getMeteor_Impact_date(),
                meteorlist.get(i).getMeteor_Impact_Time(),
                meteorlist.get(i).getMeteor_Impact_Location(),
                meteorlist.get(i).getMeteor_Type(),
                meteorlist.get(i).getMeteor_Mass(),
                meteorlist.get(i).getMeteor_Diameter(),
                meteorlist.get(i).getAirbust()
            });
            
        }
        
        
        
        
    
    }
    
    public void updateaMeteor(JTextField change,JTextField id,JRadioButton jRadioButton1,JRadioButton jRadioButton2,JRadioButton jRadioButton3,JRadioButton jRadioButton4,JRadioButton jRadioButton5,JRadioButton jRadioButton6,JRadioButton jRadioButton7,JRadioButton jRadioButton8)
    {
        String sql="";
        Boolean isnumber;
        
         if (jRadioButton1.isSelected()) {
                sql = "UPDATE Meteor SET Meteor_Name = ? WHERE Meteor_ID = ?";
            }

            if (jRadioButton2.isSelected()) {
                sql = "UPDATE Meteor SET Meteor_Impact_Date = ? WHERE Meteor_ID = ?";
            }

            if (jRadioButton3.isSelected()) {
                sql = "UPDATE Meteor SET Meteor_Impact_Time = ? WHERE Meteor_ID = ?";
            }

            if (jRadioButton4.isSelected()) {
                sql = "UPDATE Meteor SET Meteor_Impact_Location = ? WHERE Meteor_ID = ?";
            }

            if (jRadioButton5.isSelected()) {
                sql = "UPDATE Meteor SET Meteor_Type = ? WHERE Meteor_ID = ?";
            }

            if (jRadioButton6.isSelected()) {
                sql = "UPDATE Meteor SET Meteor_Mass = ? WHERE Meteor_ID = ?";
            }

            if (jRadioButton7.isSelected()) {
                sql = "UPDATE Meteor SET Meteor_Diameter_M = ? WHERE Meteor_ID = ?";
            }

            if (jRadioButton8.isSelected()) {
                sql = "UPDATE Meteor SET Airburst = ? WHERE Meteor_ID = ?";
            }
            try
            {
                Integer.parseInt(change.getText());
                isnumber=true;
            }
            catch(NumberFormatException e)
            {
                isnumber=false;

            }
            
            umdi.updateMeteor(Integer.parseInt(id.getText()), change.getText(), isnumber, sql);
    }
    
    public Meteor getoneMeteor(JTextField id)
    {
        return umdi.getMeteor(Integer.parseInt(id.getText()));
    
    }
    
    
    
    
    
    
}
