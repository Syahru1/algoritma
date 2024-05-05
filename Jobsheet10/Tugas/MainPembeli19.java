package Jobsheet10.Tugas;
import java.util.Scanner;

public class MainPembeli19 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Paling Belakang");
        System.out.println("5. Menampilkan Semua Data");
        System.out.println("6. Cek Posisi Antrian Pembeli");
        System.out.println("7. Menampilkan Semua Pembeli");
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Menampilkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        QueuePembeli19 antri = new QueuePembeli19(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No HP: ");
                    int noHp = sc.nextInt();
                    Pembeli19 pbl = new Pembeli19(nama, noHp);
                    antri.enqueue(pbl);
                    break;
                case 2:
                    Pembeli19 data = antri.Dequeue();
                    if(!"".equals(data.nama) && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;
                case 6: 
                    System.out.print("Masukkan Nama Pembeli: ");
                    String namaPembeli = sc.next();
                    antri.peekPosition(namaPembeli);
                    break;
                case 7:
                    System.out.println("Daftar Pembeli");
                    System.out.println("======================");
                    antri.daftarPembeli();
                    System.out.println("=======================");
                default:
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 ||
                pilih == 4 || pilih == 5 || pilih == 6 );
    }
}
