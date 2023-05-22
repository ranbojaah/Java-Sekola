/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi8;

class Stack {
    private final int MAX = 10; //medeklarasikan konstanta max
    
    private int [] stack = new int [MAX];
    private int atas;
    
    //constructor
    Stack(){
        atas = -1;
    }
    
    //menyimpan nilai ke dalam stack
    void push (int nilai){
        if (atas !=9){
            stack [++atas] = nilai;
        }else {
            System.out.println("Stack penuh...");
        }
    }
    
    int pop (){
        if (atas >= 0){
            return stack [atas--];
        }else {
            System.out.println("Stack masih kosong...");
            return 0;
        }
    }
}
class DemoFinal {
    public static void main(String[] args) {
        Stack s = new Stack();
        
        //memasukkan nilai nilai ke dalam stack
        for (int i=1; i <=10; i++){
            s.push(i*10);
        }
        
        //mengambil nilai nilai yang terdepat di dalam stack
        for (int i=1; i<=10; i++){
            System.out.println(s.pop());
        }
    }
}
