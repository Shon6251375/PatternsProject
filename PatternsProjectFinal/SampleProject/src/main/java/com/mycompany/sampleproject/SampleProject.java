/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sampleproject;

import java.util.Locale;

/**
 *
 * @author shonc
 */
public class SampleProject {
    
    public static Locale APP_LOCALE = Locale.ENGLISH;

    public static void main(String[] args) {
        DatabaseController dbc=new DatabaseController();
        dbc.setVisible(true);
    }
}
