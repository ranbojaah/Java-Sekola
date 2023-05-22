/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;
import java.util.Scanner;
public class Latihan {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    int JumlahKota, JumlahJenisKendaraan;

    System.out.println("\n<<<<<<<<<<<<<< PENGHITUNG PENGGUNA KENDARAAN >>>>>>>>>>>>>");
    System.out.print("Input jumlah kota: ");
    JumlahKota = input.nextInt();

    System.out.print("Ada berapa jenis kendaraan: ");
    JumlahJenisKendaraan = input.nextInt();
    input.nextLine(); // read newline

    String[] kota = new String[JumlahKota];
    System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<< KOTA >>>>>>>>>>>>>>>>>>>>>>>>>>");
    for (int i = 0; i < JumlahKota; i++) {
      System.out.print("Masukkan nama kota ke-" + (i + 1) + ": ");
      kota[i] = input.nextLine();
    }

    String[] jenisKendaraan = new String[JumlahJenisKendaraan];
    System.out.println("\n>>>>>>>>>>>>>>>>>>> JENIS KENDARAAN <<<<<<<<<<<<<<<<<<<<<<");
    for (int i = 0; i < JumlahKota; i++) {
      System.out.print("Masukkan jenis kendaraan ke-" + (i + 1) + ": ");
      jenisKendaraan[i] = input.nextLine();
    }

    int[][] jumlahKendaraan = new int[JumlahKota][JumlahJenisKendaraan];
    for (int i = 0; i < JumlahKota; i++) {
      System.out.println("\n>>>>>>>>>>>>>>>>>>>>> " + kota[i].toUpperCase() + " <<<<<<<<<<<<<<<<<<<<<<");
      for (int j = 0; j < JumlahJenisKendaraan; j++) {
        System.out.print("Jumlah kendaraan " + jenisKendaraan[j] + " di Kota " + kota[i] + ": ");
        jumlahKendaraan[i][j] = input.nextInt();
      }
    }

    int[] totalKendaraan = new int[JumlahJenisKendaraan];
    int totalSemua = 0;
    System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>> HASIL <<<<<<<<<<<<<<<<<<<<<<\n");
    for (int i = 0; i < JumlahKota; i++) {
      System.out.println("Kota " + kota[i]);
      int totalKota = 0;
      for (int j = 0; j < JumlahJenisKendaraan; j++) {
        System.out.println(jenisKendaraan[j] + ": " + jumlahKendaraan[i][j]);
        totalKota += jumlahKendaraan[i][j];
        totalKendaraan[i] += jumlahKendaraan[j][i];
      }
      totalSemua += totalKota;
      System.out.println("Jumlah: " + totalKota);
      System.out.print("\n");
    }

    System.out.println("\n>>>>>>>>>>>> JUMLAH KENDARAAN <<<<<<<<<<<<\n");
    for (int i = 0; i < JumlahJenisKendaraan; i++) {
      System.out.println(jenisKendaraan[i] + ": " + totalKendaraan[i]);
    }
    System.out.println("Total semua: " + totalSemua);

    input.close();
    }
}
