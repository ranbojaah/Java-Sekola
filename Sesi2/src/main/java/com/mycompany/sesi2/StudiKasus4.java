/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi2;


public class StudiKasus4 {
    public double alas;
    public double tinggi;
    public double luas;
    
    public void setalas(double alas){
        this.alas= alas;
    }
    public void settinggi(double tinggi){
        this.tinggi= tinggi;
    }
    public double getalas(){
        return alas;
    }
    public double gettinggi(){
        return tinggi;
    }
    public double hitungluas(){
        luas = 0.5 * alas * tinggi;
        return luas;
    }
}
