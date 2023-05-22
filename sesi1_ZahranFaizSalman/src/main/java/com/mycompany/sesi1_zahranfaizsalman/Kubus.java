/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi1_zahranfaizsalman;


public class Kubus {
    public double sisi;
    public double volume;
    
    public void setsisi(double sisi){
        this.sisi = sisi;
    }
    public double getsisi(){
        return sisi;
    }
    public double HitungVolume(){
        volume = sisi * sisi * sisi;
        return volume;
    }
}
