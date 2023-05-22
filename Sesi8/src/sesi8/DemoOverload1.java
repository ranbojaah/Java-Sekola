/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
package sesi8;
class Pembagian {
    //mendefinisikan method dengan dua parameter bertipe int
    int bagi (int a, int b){
        return a/b;
    }
    
    //mendefinisikan method dengan dua parameter
    //bertipe double
    double bagi (double a, double b){
        return a/b;
    }
}
class DemoOverload1 {
    public static void main (String[] args){
        Pembagian b = new Pembagian();
        
        int x = b.bagi(10, 4);
        double y = b.bagi(10.0, 4.0);
        
        System.out.println("Hasil bagi tipe int    = " + x);
        System.out.println("Hasil bagi tipe double = "+ y);
    }
}
