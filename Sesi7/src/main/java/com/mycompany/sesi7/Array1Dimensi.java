/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

public class Array1Dimensi {
    public static void main (String []args){
        String bulan [];
        bulan = new String [12] ;
        bulan [0]= "Januari";
        bulan [1]= "Februari";
        bulan [2]= "Maret";
        bulan [3]= "April";
        bulan [4]= "Mei";
        bulan [5]= "Juni";
        bulan [6]= "Juli";
        bulan [7]= "Agustus";
        bulan [8]= "September";
        bulan [9]= "Oktober";
        bulan [10]= "November";
        bulan [11]= "Desember";
        
        int [] JumlahHari = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i=0; i<bulan.length; i++) {
            System.out.println("Bulan " +bulan[i] + " Memiliki " + JumlahHari[i] + " Hari");
        }
    }
}
