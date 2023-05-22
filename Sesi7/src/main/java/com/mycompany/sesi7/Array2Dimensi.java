/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

public class Array2Dimensi {
    public static void main (String [] args){
        String bulan [][]=  {{"Januari" , "31"},{"Februari" , "28"},{"Maret" , "31"},
            {"April" , "30"},{"Mei" , "31"},{"Juni" , "30"},
            {"Juli" , "31"},{"Agustus" , "31"},{"September" , "30"},
            {"Oktober" , "31"},{"November" , "30"},{"Desember" , "31"}};    
        
        for (int i = 0; i<bulan.length; i++){
            System.out.println("Bulan "+ bulan[i][0] + " memiliki "+ bulan[i][1]+ " hari");
        }
    }
}

