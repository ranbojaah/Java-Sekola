
package objek;

public class Makanan {
   Pelanggan bagian = new Pelanggan();
   public int pesan ;
   public double harga;
   public String makanan;
   
   public void setPesan (int pesan, Pelanggan pelanggan){
       if (pelanggan.member){
           switch (pesan){
               case 1 :
                   this.makanan = "Bala - bala";
                   this.harga = 4750;
                   break;
               case 2 :
                   this.makanan = "Gehu";
                   this.harga = 9000;
                   break;
               case 3 :
                   this.makanan = "Seblak";
                   this.harga = 12750;
                   break;
               default :
                   this.makanan = "Tidak Tersedia";
                   this.harga = 0;
           }
       } 
       else {
           switch (pesan){
               case 1 :
                   this.makanan = "Bala - bala";
                   this.harga = 5000;
                   break;
               case 2 :
                   this.makanan = "Gehu";
                   this.harga = 10000;
                   break;
               case 3 :
                   this.makanan = "Seblak";
                   this.harga = 15000;
                   break;
               default :
                   this.makanan = "Tidak Tersedia";
                   this.harga = 0;
           }
       }
   }
   public double getHarga(){
       return harga;
   }
   public String getMakanan(){
       return makanan;
   }
}
