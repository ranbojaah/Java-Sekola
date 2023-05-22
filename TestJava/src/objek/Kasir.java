
package objek;
import java.util.Scanner;
public class Kasir {
    public static void main (String [] args){
        Pelanggan pelanggan = new Pelanggan ();
        Makanan makan = new Makanan ();
        Penjualan jual = new Penjualan ();
        double total = 0;
        double subtotal;
        String rilll;
        
        System.out.println("*******************************************");
        System.out.println("----------------Menu Makanan---------------");
        System.out.println("*******************************************");
        System.out.println("1. Bala - bala             Rp.5000        ");
        System.out.println("2. Gehu                    Rp.10000        ");
        System.out.println("3. Seblak                  Rp.15000        ");
        System.out.println("*******************************************");
        Scanner input = new Scanner(System.in);
        System.out.print("Member ? true/false : "  );
        pelanggan.setMember(input.nextBoolean());
        
        do{
        System.out.print("Pilih Menu Makanan : ");
        int order = input.nextInt();
        makan.setPesan(order, pelanggan);
        System.out.print("Jumlah Beli : ");
        int jmlh = input.nextInt();
        System.out.println("-------------------List-------------------");
        subtotal = makan.getHarga()*jmlh;
        total = total + subtotal;
        System.out.println("Menu Dipilih : " + makan.getMakanan());
        System.out.println("Total : Rp." + (subtotal));
        System.out.println("=================================================");
            System.out.println("Pesan Lagi?");
            System.out.println("ya/tidak");
            System.out.println("=================================================");
        rilll = input.next();
            System.out.println("=================================================");
        }
        while(rilll.equalsIgnoreCase("ya"));
        if(rilll.equalsIgnoreCase("tidak")){
         
        System.out.println("-------------------Struk-------------------");
        System.out.println("Total Harga : Rp." +total);    
        System.out.print("Masukkan Uang : Rp." );
        double uang = input.nextDouble();
        System.out.println("Kembalian : Rp." + (uang - total));
        }
        System.out.println("-----------------Terima Kasih----------------");
    }
}
