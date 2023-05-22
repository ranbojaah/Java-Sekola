/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi6;

class DemoSwitch2 {
    public static void main(String[] args){
        int a=2, b;
        switch(a){
            case 1 : b= a + 1;
            case 2 : b= a + 2;
            case 3 : b= a + 3;
            case 4 : b= a + 4;
            case 5 : b= a + 5;
            default : b = 0;
        }
        System.out.println("Nilai b: " + b);
    }
}
