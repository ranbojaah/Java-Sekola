/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi1_zahranfaizsalman;
import java.util.Scanner;
 class Soal3Tester {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang\t: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan Lebar\t\t: ");
        double lebar = input.nextDouble();
        
        Soal3 meja = new Soal3();
        meja.setPanjang(panjang);
        meja.setLebar(lebar);
        
        System.out.println("");
        System.out.println("Panjang\t: " +meja.getPanjang());
        System.out.println("Lebar\t: " +meja.getLebar());
        System.out.println("Luasnya\t: "+meja.HitungLuas());
    }
}
