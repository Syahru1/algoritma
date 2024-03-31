package Jobsheet7.TestSearching.P7;
import java.util.Scanner;

public class BukuMain19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        pencarianBuku19 data = new pencarianBuku19();
        int jumBuku = 5;

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku \t  : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t  : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t  : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t  : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t  : ");
            int stock = s.nextInt();

            Buku19 m = new Buku19(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("-------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");

        System.out.println("-------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilPosisi(cari, posisi);
    }
}
