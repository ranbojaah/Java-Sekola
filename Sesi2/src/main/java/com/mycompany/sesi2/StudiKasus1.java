/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi2;
class tabung {
    double jari;
    double tinggi;
}
class StudiKasus1 {
    public static void main (String [] args){
        double volume;
        tabung x = new tabung ();
        
        x.jari= 14;
        x.tinggi= 20;
        
        volume = 3.14 * x.jari * x.jari * x.tinggi;
        
        System.out.println("Volume Tabung = " + volume);
    }
}
