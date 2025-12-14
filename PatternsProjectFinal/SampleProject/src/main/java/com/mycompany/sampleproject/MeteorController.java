/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sampleproject;

import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author shonc
 */
public class MeteorController {
    private static MeteorController mcInstance;
    private MeteorService ms;

    private MeteorController() {
        this.ms = new MeteorService();
    }
    
    public static synchronized MeteorController getInstance()
    {
        if(mcInstance == null)
        {
            mcInstance=new MeteorController();
        
        }
        return mcInstance;
    
    }
    
    public void calladdmeteor(JTextField meteor_name,JTextField meteor_Impact_Date,JTextField meteor_Impact_time,JTextField meteor_Impact_Location,JTextField meteor_Impact_type,JTextField meteor_Impact_mass,JTextField meteor_Impact_diamater,JTextField meteor_Impact_airburst)
    {
        ms.addAMeteor(meteor_name, meteor_Impact_Date, meteor_Impact_time, meteor_Impact_Location, meteor_Impact_type, meteor_Impact_mass, meteor_Impact_diamater, meteor_Impact_airburst);
    
    }
    
    public void callremovemeteor(JTextField id,JTable jtab)
    {
        ms.removeaMeteor(id,jtab);
    
    }
    
    public void callupdatemeteor(JTextField change,JTextField id,JRadioButton jRadioButton1,JRadioButton jRadioButton2,JRadioButton jRadioButton3,JRadioButton jRadioButton4,JRadioButton jRadioButton5,JRadioButton jRadioButton6,JRadioButton jRadioButton7,JRadioButton jRadioButton8)
    {
        ms.updateaMeteor(change, id, jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5, jRadioButton6, jRadioButton7, jRadioButton8);
    
    }
    
    public void callviewTable(JTable jTable1)
    {
        ms.viewTable(jTable1);
        
    
    }
    
    public Meteor getonemeteorcalled(JTextField id)
    {
        return ms.getoneMeteor(id);
    
    }
    
    
    
}
