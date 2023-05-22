/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi2;
class StudiKasus2 {
    public static void main (String [] args){
        
        double volume1, volume2;
        
        tabung x1 = new tabung();
        tabung x2 = new tabung();
        
        x1.jari = 14;
        x1.tinggi =20;
        
        x2.jari= 7;
        x2.tinggi=14;
        
        volume1 = 3.14 * x1.jari * x1.jari * x1.tinggi;
        volume2 = 3.14 * x2.jari * x2.jari * x2.tinggi;
        
        System.out.println("Volume Tabung 1 = " + volume1);
        System.out.println("Volume Tabung 2 =" + volume2);
    }
}
