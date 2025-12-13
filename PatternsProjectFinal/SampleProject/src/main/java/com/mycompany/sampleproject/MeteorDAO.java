/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sampleproject;

import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author shonc
 */
public interface MeteorDAO {
    //abstract void addMeteor(JTextField meteor_name,JTextField meteor_Impact_Date,JTextField meteor_Impact_time,JTextField meteor_Impact_Location,JTextField meteor_Impact_type,JTextField meteor_Impact_mass,JTextField meteor_Impact_diamater,JTextField meteor_Impact_airburst);
    abstract void addMeteor(Meteor m);
    abstract void removeMeteor(int id);
    abstract void updateMeteor(int id,String text,boolean numorno,String sqlstat);
    abstract List<Meteor> getAll();
    
    
    
}
