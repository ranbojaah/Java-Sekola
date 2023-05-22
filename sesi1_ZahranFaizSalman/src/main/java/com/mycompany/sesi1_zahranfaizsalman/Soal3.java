/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesi1_zahranfaizsalman;

public class Soal3 {
    //bagian untuk memesan atribut atau variable
    public double panjang;
    public double lebar;
    public double luas;
    
    //membuat method setter
    public void setPanjang (double panjang){
        this.panjang = panjang;
    }
    public void setLebar (double lebar){
        this.lebar = lebar;
    }
    //membuat method getter
     public double getPanjang (){
        return panjang;
    }
     public double getLebar (){
        return lebar;
    }
    //membuat method untuk proses perhitugan
    public double HitungLuas(){
        luas = panjang * lebar;
        return luas;
    }
}
