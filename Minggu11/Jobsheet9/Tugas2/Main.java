package Minggu11.Jobsheet9.Tugas2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        MahasiswaQueue mhs = new MahasiswaQueue();
        int menu = 0;
        do {
            System.out.println("===========================");
            System.out.println("Layanan Unit Kemahasiswaan");
            System.out.println("===========================");
            System.out.println("1. Tambah antrean");
            System.out.println("2. Keluarkan antrean");
            System.out.println("3. Lihat seluruh antrean");
            System.out.println("4. Lihat antrean terdepan");
            System.out.println("5. Keluar ");
            System.out.println("Pilih Menu : -> ");
            menu =sc.nextInt();
            switch(menu) {
                case 1:
                System.out.println("Masukkan nim : ");
                String nim = sc.next();
                System.out.println("Masukkan nama : ");
                String nama = sa.nextLine();
                mhs.enqueque(nim, nama);
                break;
                case 2 :
                if(!mhs.isEmpty()) {
                    System.out.println("Data dengan nim " + mhs.front.data.nim + " dan nama " + mhs.front.data.nama + " berhasil keluar antrean.");
                }
                mhs.dequeue();
                break;
                case 3:
                mhs.print();
                break;
                case 4 :
                mhs.peek();
                break;
                case 5 :
                System.out.println("Keluar dari program.");
                break;
                default :
                System.out.println("Input tidak valid");
                break;
            }
        }while(menu != 5);
        }
    }
