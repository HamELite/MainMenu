import java.util.Scanner;






public class index {
public static void main(String[] args) {
    
   
    
    
    Integer angka = 1;
    Float desimal = (float) 1.1;
    Boolean testing = true;
    Integer test = 1;

    test = 2;
    String nama ="Ilham Kusuma Ganteng";
    int kelas=10;
    Float umur = (float) 1.8;
    Integer angka3 = 20;
    Float desimal2 = (float) 3.6;
    int angka4 =45;


    var sum = angka3 + desimal2 + angka4;
    System.out.println("Nama: "+nama);
    System.out.println("Kelas : "+kelas);
    System.out.println("Umur : "+umur);
    System.out.println("Hasil Penjumlahan Dari 20+3.6+45 adalah : " +sum );
    
    

    Scanner sc = new Scanner(System.in);
    String nama;
    System.out.print("Nama kamu siapa: ");
    nama = sc.next();
    System.out.println("Nama Saya " + nama);
    int menu = sc.nextInt();
    for (int i = 1; i > menu ; i++) {
      System.out.println("Pilih Menu : 0.Kalkulator  , 2.keluar");
      System.out.print("Masukan angka pertama:");
      int angka1 = sc.nextInt();
      System.out.println("Masukan angka kedua: ");
      int angka2 = sc.nextInt();
      int hasil = angka1 + angka2;
      System.out.println("Hasil: " + hasil);
      if (hasil % 2 == 0) {
        System.out.println("angka genap");
      } else{
        System.out.println("Angka Ganjl");
      }
    }






}

}