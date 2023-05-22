/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi2;
class kotak {
    double panjang;
    double lebar;
    double tinggi;
}
 class DemoKotak1 {
    public static void main(String[]args){
        
        double volume;
        kotak k = new kotak();
        
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi= 2;
        
        volume = k.panjang * k.lebar * k.tinggi;
        
        System.out.println("Volume kotak = " + volume);
    }
}
