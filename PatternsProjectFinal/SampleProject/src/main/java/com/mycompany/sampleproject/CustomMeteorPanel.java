/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sampleproject;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author shonc
 */
public class CustomMeteorPanel extends JPanel{
    private int y;
    private int x;
    private double impactangle;
    private double velocity;
    private Image meteorImage;
    private double meteorSize;
    private List<Point> trail=new ArrayList<>();
    
    
    
    public CustomMeteorPanel(double mass,double velocity, String imagePath)
    {
        this.y=0;
        this.x=100;
        this.meteorSize=mass;
        this.impactangle=0;
        this.velocity=velocity/50;
        this.meteorSize=Math.max(20, mass/50.0);
        this.meteorImage=new ImageIcon(imagePath).getImage();
        Timer timer=new Timer(30, e -> {
            trail.add(new Point((int)x,(int)y));
            if(trail.size()>10)trail.remove(0);
             y += velocity; 
             impactangle +=5;
             
            if (y > getHeight() - meteorSize) {
            y = (int) (getHeight() - meteorSize);
            ((Timer)((javax.swing.Timer)e.getSource())).stop();
    }
        repaint();
    });
    timer.start();
    }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;
        g.setColor(Color.red);
        for(Point p: trail)
        {
            g2d.fillOval(p.x, p.y, (int)meteorSize, (int)meteorSize);
        
        }
        AffineTransform oldImage=g2d.getTransform();
        g2d.rotate(Math.toRadians(impactangle),x + meteorSize/2,y+meteorSize/2);
        g2d.drawImage(meteorImage, (int)x, (int)y,(int)meteorSize,(int)meteorSize,null);
        g2d.setTransform(oldImage);
        
        if(this.y >=getHeight() -meteorSize)
        {
            g2d.setColor(Color.red);
            g2d.fillOval((int)x-10, (int)y-10, (int)meteorSize+20, (int)meteorSize+20);
        
        }

    }
    
//    private int currentsize(double mass)
//    {
//        double minmass=100;
//        double maxmass =5000;
//        double normalized = (mass-minmass)/(maxmass-minmass);
//        normalized=Math.max(0, Math.min(1, normalized));
//        return (int) (20 + normalized *(80 - 20));
//        
//    
//    }
    
    
    
}
