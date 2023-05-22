/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi7;

public class Latihan2 {
    public static void main (String[]args){
        String  [][] entry = {{"Florence", "735-1234", "Manila"}, 
            {"Joyce","983-3333","Quezon City"}, 
            {"Becca", "456-3322", "Manila"}};
        
        int i=0;
        
        do{
            System.out.println("");
            System.out.println("Name   : "+ entry[i][0]);
            System.out.println("Tel.#  : "+ entry[i][1]);
            System.out.println("Addres : "+ entry[i][2]);
            i++;
        } while (i<3);
    }
}
