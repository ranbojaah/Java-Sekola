/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi2;
import java.util.Scanner;

    class StudiKasus4Tester {
    public static void main (String [] args){
         
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Alas\t= ");
        double alas = input.nextDouble();
        System.out.print("Masukkan Tinggi\t= ");
        double tinggi = input.nextDouble();
        
        StudiKasus4 x = new StudiKasus4();
        x.setalas(alas);
        x.settinggi(tinggi);
        
        System.out.println();
        System.out.println("Alas\t\t : "+x.getalas());
        System.out.println("Tinggi\t\t : "+x.gettinggi());
        System.out.print("Luas\t\t : 0.5 *" + x.getalas());
        System.out.println("*" + x.gettinggi());
        System.out.println("Luas\t\t : " + x.hitungluas());
        
    }
}
