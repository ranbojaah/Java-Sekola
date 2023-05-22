package com.mycompany.sesi4;
import java.util.Scanner;

public class StudiKasus2 {
    public static void main (String [] args){
        System.out.println("Program Konversi Kilometer ke Meter\n");
        double hasil;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Kilometer = ");
        double km = input.nextDouble();
        
        hasil = km * 1000;
        
        System.out.println("Convert Ke Meter = " + hasil);
    }
}   