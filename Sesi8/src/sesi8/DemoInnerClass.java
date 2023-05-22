/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi8;

class Luar {
    private int a;
    
    public void setA (int nilai){
        a = nilai;
    }
    
    public int getA(){
        return a;
    }
    
    //mendefinisikan inner class
    class Dalam {
        private int x = 10; //hnya dikenali oleh kelas dalam
        
        public void showData(){
            System.out.println("Nilai a dari kelas Luar  : "+a);
            System.out.println("Nilai x dari kelas Dalam : "+x);
        }
    }
    public void showData(){
        //baris di bawah ini salah, karena x tidak dikenal di sini
//        System.out.println("Nilai x dari kelas Dalam : "+x);

        Dalam obj = new Dalam();
        obj.showData();
    }
}
class DemoInnerClass {
    public static void main(String[] args) {
        Luar objl = new Luar();
        //dalam obj 2 = new Dalam (); //salah
        objl.setA(5);
        objl.showData();
    }
}
