package Jobsheet6.LatihanPraktikum;
import java.util.Scanner;

public class MainHotel19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah hotel : ");
        int jumlahHotel = sc.nextInt();
        HotelService19 ht1 = new HotelService19(jumlahHotel);
        
        for (int i = 0; i < jumlahHotel; i++) {
            System.out.println("Hotel ke-" + (i+1));
            System.out.print("Masukkan nama : ");
            String nama = sc.next();
            System.out.print("Masukkan Kota : ");
            String kota = sc.next();
            System.out.print("Masukkan Harga : ");
            int harga = sc.nextInt();
            System.out.print("Masukkan Bintangnya : ");
            byte bintang = sc.nextByte();

            ht1.rooms[i] = new Hotel19(nama, kota, harga, bintang);
            ht1.tambah(ht1.rooms[i]);
        }

        System.out.println("====================================================");
        System.out.println("\n                 Hotel Service\n");
        System.out.println("====================================================");

        while (true) {
            System.out.println("Daftar Hotel");
            System.out.println("================================================");
            System.out.println("[1] Berdasarkam Harga " + "Termurah sampai Tertinggi");
            System.out.println("[2] Berdasarkan Bintag " + "Tertinggi sampai Terendah");
            System.out.println("[3] Keluar");
            System.out.println("================================================");
            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();

            if(pilihan == 1) {
                System.out.println("Daftar Hotel " + "Berdasarkan Bintang Tertinggi sampai Terendah");
                ht1.bubbleSort();
                ht1.tampil();
            }else if(pilihan == 2) {
                System.out.println("Daftar Hotel " + "Berdasarkan Bintang Tertinggi sampai Terendah");
                ht1.selectionSort();
                ht1.tampil();
            }else{
                System.out.println("====================");
                System.out.println("TerimaKasih");
                System.out.println("=====================");
                break;
            }
        }
    }
}
