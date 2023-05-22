/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi6;

class DemoForPrima {
    public static void main (String [] args){
        int bilangan =21;
        boolean prima = true;
        for (int i=2; i <= (bilangan/2); i++){
            if((bilangan % i) == 0) {
                prima = false;
                break;
            }
        }
        if (prima ){
            System.out.println(bilangan +" merupakan bilangan prima");
        }else{
            System.out.println(bilangan +" bukan bilangan prima");
        }
    }
}
