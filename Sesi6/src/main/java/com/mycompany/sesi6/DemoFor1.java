/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi6;

class DemoFor1 {
    public static void main (String [] args){
        int n = 10;
        int hasil = 0;
        for (int i=1; i<=n; i++) {
            hasil += i;
            if (i !=n){
                System.out.print(i+ " + ");
            }else{
                System.out.print(i+ "");
                System.out.print(" = ");
            }
    }
                    System.out.println(hasil);
    }
}
