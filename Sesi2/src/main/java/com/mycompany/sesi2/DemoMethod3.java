/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi2;
class balok {
    double panjang;
    double lebar;
    double tinggi;
    
   void isidata(double p, double l, double t){
       panjang = p;
       tinggi = t;
       lebar = l;
   }
   double hitungvolume(){
       return (panjang * lebar * tinggi);
   }
}
public class DemoMethod3 {
    public static void main(String[]args) {
        balok k;
        
            k = new balok();
            
            k.isidata(4, 3, 2);
            
            System.out.println("Volume kotak = " + k.hitungvolume());
    }
}
