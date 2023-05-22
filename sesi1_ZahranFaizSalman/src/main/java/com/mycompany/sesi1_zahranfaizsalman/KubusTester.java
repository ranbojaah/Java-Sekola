/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi1_zahranfaizsalman;
import java.util.Scanner;

public class KubusTester {
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Sisi\t : ");
        double sisi = input.nextDouble();
        
        Kubus box = new Kubus();
        box.setsisi(sisi);
        
        System.out.println();
        System.out.println("Sisi\t\t : "+box.getsisi());
        System.out.print("Volume\t\t : "+box.getsisi());
        System.out.print(" * "+box.getsisi());
        System.out.println(" * "+box.getsisi());
        System.out.println("Volumenya\t : "+box.HitungVolume());
        
    }
}

