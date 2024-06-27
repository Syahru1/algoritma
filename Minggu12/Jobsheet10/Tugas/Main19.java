package Minggu12.Jobsheet10.Tugas;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList19 dll = new DoubleLinkedList19();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            int x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.print("Nomor Antrian :");
                    int nomorAntrian = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima : ");
                    String namaPenerima = sc.nextLine();
                    dll.addLast(namaPenerima, nomorAntrian);
                    break;
                case 2:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }
    }
}