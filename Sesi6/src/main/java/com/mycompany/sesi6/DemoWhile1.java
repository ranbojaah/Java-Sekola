/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi6;

class DemoWhile1 {
    public static void main (String [] args){
        int n=5;
        int hasil=0;
        int i=1;
        while (i<=n){
            System.out.print(i);
            if (i != n){
                System.out.print(" + ");
            }else{
                System.out.print(" = ");
            }
            hasil +=i;
            i++;
        }
        System.out.println(hasil);
    }
}
