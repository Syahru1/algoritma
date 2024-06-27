package UAS.Soal;

import java.util.Scanner;

public class Main19 {
    static BarangRental19[] daftarBarang = {
            new BarangRental19("B1234CD", "Toyota Avanza", "Mobil", 2018, 40000),
            new BarangRental19("D5678EF", "Honda Vario", "Motor", 2020, 25000),
            new BarangRental19("F9101GH", "Suzuki Ertiga", "Mobil", 2019, 40000),
            new BarangRental19("S 4567 YV", "Honda Beat", "Motor", 2017, 10000),
            new BarangRental19("N 4511 VS", "Honda Vario", "Motor", 2018, 10000),
            new BarangRental19("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000),
            new BarangRental19("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000),
            new BarangRental19("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000),
    };
    static DoublyLinkedList19 daftarTransaksi = new DoublyLinkedList19();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    tampilkanDaftarBarang();
                    break;
                case 2:
                    tambahTransaksiRental();
                    break;
                case 3:
                    tampilkanDaftarTransaksi();
                    break;
                case 4:
                    daftarTransaksi.sort();
                    tampilkanDaftarTransaksi();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
    }

    static void tampilkanDaftarBarang() {
        System.out.println("\nDaftar Barang Rental:");
        for (BarangRental19 barang : daftarBarang) {
            barang.displayInfo();
            System.out.println();
        }
    }

    static void tambahTransaksiRental() {
        System.out.println("\nTambah Transaksi Rental");
        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = scanner.nextLine();
        if (!daftarTransaksi.isRented(noTNKB)) {
            BarangRental19 barang = findBarangByNoTNKB(noTNKB);
            if (barang != null) {
                System.out.print("Nama Peminjam: ");
                String namaPeminjam = scanner.nextLine();
                System.out.print("Lama Pinjam (dalam jam): ");
                int lamaPinjam = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                TransaksiRental19 transaksi = new TransaksiRental19(namaPeminjam, lamaPinjam, barang);
                daftarTransaksi.add(transaksi);
                System.out.println("Transaksi berhasil ditambahkan.");
            } else {
                System.out.println("Barang dengan Nomor TNKB tersebut tidak ditemukan.");
            }
        } else {
            System.out.println("Barang dengan Nomor TNKB tersebut sudah dipinjam.");
        }
    }

    static BarangRental19 findBarangByNoTNKB(String noTNKB) {
        for (BarangRental19 barang : daftarBarang) {
            if (barang.noTNKB.equalsIgnoreCase(noTNKB)) {
                return barang;
            }
        }
        return null;
    }

    static void tampilkanDaftarTransaksi() {
        System.out.println("\nDaftar Transaksi Rental:");
        daftarTransaksi.display();
    }
}

