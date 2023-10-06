public class Main {
  public static void main() {
    // jumlah
    int jumlah = 150000;
    int sisaKembalian = (jumlah - 88500);
    
    // hitung kembalian
    int limaPuluh = sisaKembalian / 50000;
    int sisa = sisaKembalian % 50000;
    int duaPuluh = sisa / 20000;
    sisa = sisa % 20000;
    int sepuluhRibu = sisa / 10000;
    sisa = sisa % 10000;
    int limaRibu = sisa / 5000;
    sisa = sisa % 5000;
    int seribu = sisa / 1000;
    sisa = sisa % 1000;
    int limaRatusRupiah = sisa / 500;
    sisa = sisa % 500;


    // print hasil
    System.out.println("jumlah : " + jumlah);
    System.out.println("kembalian : " + sisaKembalian);
    System.out.println("lima puluh : " + limaPuluh);
    System.out.println("dua puluh : " + duaPuluh);
    System.out.println("sepuluh : " + sepuluhRibu);
    System.out.println("lima ribu : " + limaRibu);
    System.out.println("seribu : " + seribu);
    System.out.println("lima ratus rupiah : " + limaRatusRupiah);
  }
}