/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi4;
import java.util.Scanner;
public class Pemilu {
    public static void main (String [] args){
        System.out.println("Program Penentuan Calon Pemilih");
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Silahkan Masukkan Umur Anda : ");
        int umur = input.nextInt();
        
        if (umur < 17){
            System.out.println("Maaf Anda Tidak Berhak Mengikuti Pemilu");
        }
        else{
            System.out.println("Selamar Anda Berhak Mengikuti Pemilu");
        }
    }
}
