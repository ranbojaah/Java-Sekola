/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi2;
class tabung{
    double jari;
    double tinggi;
    
    void isidata(double r, double t){
        jari = r;
        tinggi = t;
    }
    double hitungvolume (){
        return (3.14* jari * jari * tinggi);
    }
}
public class StudiKasus3 {
    public static void main (String []args){
        tabung x;
        
            x = new tabung();
            x.isidata(21, 7);
            
            System.out.println("Volume Tabung = " + x.hitungvolume());
    }
}
