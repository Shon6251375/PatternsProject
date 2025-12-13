/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sampleproject;

/**
 *
 * @author shonc
 */
public class Meteor {
    private int meteor_id;
    private String meteor_Name;
    private String meteor_Impact_date;
    private String meteor_Impact_Time;
    private String meteor_Impact_Location;
    private String meteor_Type;
    private double meteor_Mass;
    private double meteor_Diameter;
    private String airbust;
    
     public Meteor(int meteor_id,String meteor_Name, String meteor_Impact_date, String meteor_Impact_Time, String meteor_Impact_Location, String meteor_Type, double meteor_Mass, double meteor_Diameter, String airbust) {
        this.meteor_id=meteor_id;
        this.meteor_Name = meteor_Name;
        this.meteor_Impact_date = meteor_Impact_date;
        this.meteor_Impact_Time = meteor_Impact_Time;
        this.meteor_Impact_Location = meteor_Impact_Location;
        this.meteor_Type = meteor_Type;
        this.meteor_Mass = meteor_Mass;
        this.meteor_Diameter = meteor_Diameter;
        this.airbust = airbust;
    }

    
    

    public Meteor(String meteor_Name, String meteor_Impact_date, String meteor_Impact_Time, String meteor_Impact_Location, String meteor_Type, double meteor_Mass, double meteor_Diameter, String airbust) {
        this.meteor_Name = meteor_Name;
        this.meteor_Impact_date = meteor_Impact_date;
        this.meteor_Impact_Time = meteor_Impact_Time;
        this.meteor_Impact_Location = meteor_Impact_Location;
        this.meteor_Type = meteor_Type;
        this.meteor_Mass = meteor_Mass;
        this.meteor_Diameter = meteor_Diameter;
        this.airbust = airbust;
    }

    public int getMeteor_id() {
        return this.meteor_id;
    }


    
    
    public String getMeteor_Name() {
        return this.meteor_Name;
    }

    public void setMeteor_Name(String meteor_Name) {
        this.meteor_Name = meteor_Name;
    }

    public String getMeteor_Impact_date() {
        return this.meteor_Impact_date;
    }

    public void setMeteor_Impact_date(String meteor_Impact_date) {
        this.meteor_Impact_date = meteor_Impact_date;
    }

    public String getMeteor_Impact_Time() {
        return this.meteor_Impact_Time;
    }

    public void setMeteor_Impact_Time(String meteor_Impact_Time) {
        this.meteor_Impact_Time = meteor_Impact_Time;
    }

    public String getMeteor_Impact_Location() {
        return this.meteor_Impact_Location;
    }

    public void setMeteor_Impact_Location(String meteor_Impact_Location) {
        this.meteor_Impact_Location = meteor_Impact_Location;
    }

    public String getMeteor_Type() {
        return this.meteor_Type;
    }

    public void setMeteor_Type(String meteor_Type) {
        this.meteor_Type = meteor_Type;
    }

    public double getMeteor_Mass() {
        return this.meteor_Mass;
    }

    public void setMeteor_Mass(double meteor_Mass) {
        this.meteor_Mass = meteor_Mass;
    }

    public double getMeteor_Diameter() {
        return this.meteor_Diameter;
    }

    public void setMeteor_Diameter(double meteor_Diameter) {
        this.meteor_Diameter = meteor_Diameter;
    }

    public String getAirbust() {
        return this.airbust;
    }

    public void setAirbust(String airbust) {
        this.airbust = airbust;
    }
    
    
    
    
    
    
    
    
    
    
}
