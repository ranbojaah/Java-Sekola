/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi5Driver;
import java.util.Scanner;
public class Skorbola {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Tim : ");
        String team = input.nextLine();
        System.out.print("Main Ke 1 (M/K) : ");
        String m1 = input.nextLine();
        System.out.print("Main Ke 2 (M/K) : ");
        String m2 = input.nextLine();
        input.close();
        
        int total = 0;
        if (m1.equalsIgnoreCase("M") && m2.equalsIgnoreCase("M")){
            total = 2;
        }
        else if (m1.equalsIgnoreCase("K") && m2.equalsIgnoreCase("K")){
            total = 0;
        }
        else{
            total = 1;
        }
        
        System.out.println("");
        System.out.println("        HASIL PERTANDINGAN SEPAK BOLA       ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Tim\t : " + team);
        System.out.println("Main ke-1\t : " + m1);
        System.out.println("Main ke-2\t : "+ m2);
        System.out.println("Skor\t\t : " + total);
       
        if (total == 2){
            System.out.println("Keterangan\t : UCL CHAMPION");
        }
        else if (total == 1 && m1.equalsIgnoreCase("M")){
            System.out.println("Keterangan\t : UCL Runner Up");
        }
        else if (total == 1 && m2.equalsIgnoreCase("M")){
            System.out.println("Keterangan\t\t : Semi FInalis UCL");
        }
        else{
            System.out.println("Coba DI UEL");
        }
    }
}
