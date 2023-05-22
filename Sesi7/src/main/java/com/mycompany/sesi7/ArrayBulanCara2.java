/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

public class ArrayBulanCara2 {
    public static void main (String [] args){
        String [] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli","Agustus", "September", "Oktober", "November", "Desember"};
        
        int [] JumlahHari = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i=0; i<bulan.length; i++) {
            System.out.println("Bulan " +bulan[i] + " Memiliki " + JumlahHari[i] + " Hari");
        }
    }
}
