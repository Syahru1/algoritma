package UAS.Soal2;
import java.util.Scanner;

public class RentalSystem19 {
    private BarangRental19 headBarang;
    private TransaksiRental19 headTransaksi;
    private int kodeTransaksiCounter = 1;

    public RentalSystem19() {
        BarangRental19 barang1 = new BarangRental19("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        BarangRental19 barang2 = new BarangRental19("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        BarangRental19 barang3 = new BarangRental19("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
        BarangRental19 barang4 = new BarangRental19("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000);
        BarangRental19 barang5 = new BarangRental19("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000);
    
        barang1.setNext(barang2);
        barang2.setPrev(barang1);
        barang2.setNext(barang3);
        barang3.setPrev(barang2);
        barang3.setNext(barang4);
        barang4.setPrev(barang3);
        barang4.setNext(barang5);
        barang5.setPrev(barang4);
        headBarang = barang1;
    }
    
    public void tampilkanDaftarBarang() {
        System.out.println("--------------------------------------------------------");
        System.out.printf("| %-10s | %-15s | %-10s | %-5s | %-10s |\n", "No TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa");
        System.out.println("--------------------------------------------------------");
        BarangRental19 current = headBarang;
        while (current != null) {
            System.out.printf("| %-10s | %-15s | %-10s | %-5d | %-10d |\n", current.getNoTNKB(), current.getNamaKendaraan(), current.getJenisKendaraan(), current.getTahun(), current.getBiayaSewa());
            current = current.getNext();
        }
        System.out.println("--------------------------------------------------------");
    }
    
    // public void lakukanPeminjaman(Scanner scanner) {
    //     System.out.print("Masukkan nama peminjam: ");
    //     String namaPeminjam = scanner.next();
    //     System.out.print("Masukkan nomor TNKB kendaraan yang ingin dipinjam: ");
    //     String noTNKB = scanner.next();
    //     System.out.print("Masukkan lama pinjam (hari): ");
    //     int lamaPinjam = scanner.nextInt();

    //     BarangRental19 barang = cariBarangByNoTNKB(noTNKB);
    //     if (barang != null) {
    //         double totalBiaya = barang.getBiayaSewa() * lamaPinjam;
    //         TransaksiRental19 transaksi = new TransaksiRental19(kodeTransaksiCounter++, namaPeminjam, lamaPinjam, totalBiaya, barang);

    //         if (headTransaksi == null) {
    //             headTransaksi = transaksi;
    //         } else {
    //             TransaksiRental19 current = headTransaksi;
    //             while (current.getNext() != null) {
    //                 current = current.getNext();
    //             }
    //             current.setNext(transaksi);
    //             transaksi.setPrev(current);
    //         }
    //         System.out.println("Peminjaman berhasil dilakukan!");
    //     } else {
    //         System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " tidak ditemukan.");
    //     }
    // }

    public void lakukanPeminjaman(Scanner scanner) {
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan nomor TNKB kendaraan: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan lama pinjam (jam): ");
        int lamaPinjam = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline
        System.out.print("Apakah member? (ya/tidak): ");
        String isMemberStr = scanner.nextLine();
        boolean isMember = isMemberStr.equalsIgnoreCase("ya");
    
        BarangRental19 barang = cariBarangByNoTNKB(noTNKB);
        if (barang != null) {
            if (barang.getStatusPeminjaman()) {
                System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " sudah dipinjam oleh orang lain.");
                return;
            }
    
            double biayaSewaPerJam;
            if (barang.getJenisKendaraan().equalsIgnoreCase("Motor")) {
                biayaSewaPerJam = 25000;
            } else {
                biayaSewaPerJam = 40000;
            }
    
            double totalBiaya = biayaSewaPerJam * lamaPinjam;
    
            if (lamaPinjam >= 48 && lamaPinjam <= 78) {
                totalBiaya *= 0.9; // Diskon 10% untuk peminjaman 48-78 jam
            } else if (lamaPinjam > 78) {
                totalBiaya *= 0.8; // Diskon 20% untuk peminjaman lebih dari 78 jam
            }
    
            if (isMember) {
                totalBiaya -= 25000; // Potongan harga untuk member
            }
    
            TransaksiRental19 transaksi = new TransaksiRental19(kodeTransaksiCounter++, namaPeminjam, lamaPinjam, totalBiaya, barang);
    
            // Menambahkan transaksi ke linked list transaksi
            if (headTransaksi == null) {
                headTransaksi = transaksi;
            } else {
                TransaksiRental19 current = headTransaksi;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(transaksi);
                transaksi.setPrev(current);
            }
    
            // Menandai kendaraan sebagai dipinjam
            barang.setStatusPeminjaman(true);
    
            System.out.println("Peminjaman berhasil dilakukan!");
        } else {
            System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " tidak ditemukan.");
        }
    }

    private BarangRental19 cariBarangByNoTNKB(String noTNKB) {
        BarangRental19 current = headBarang;
        while (current != null) {
            if (current.getNoTNKB().equals(noTNKB)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void tampilkanSeluruhTransaksi() {
        System.out.println("Seluruh Transaksi: ");
        TransaksiRental19 current = headTransaksi;
        while (current != null) {
            System.out.println("Kode Transaksi: " + current.getKodeTransaksi());
            System.out.println("Nama Peminjam: " + current.getNamaPeminjam());
            System.out.println("Lama Pinjam: " + current.getLamaPinjam() + " hari");
            System.out.println("Total Biaya: " + current.getTotalBiaya());
            System.out.println("Kendaraan: " + current.getBr().getNamaKendaraan());
            System.out.println("-----------------------------------");
            current = current.getNext();
        }
    }

    public void urutkanTransaksi() {
        TransaksiRental19 current = headTransaksi;
        while (current != null) {
            TransaksiRental19 min = current;
            TransaksiRental19 innerCurrent = current.getNext();
            while (innerCurrent != null) {
                if (min.getBr().getNoTNKB().compareTo(innerCurrent.getBr().getNoTNKB()) > 0) {
                    min = innerCurrent;
                }
                innerCurrent = innerCurrent.getNext();
            }
            TransaksiRental19 temp = new TransaksiRental19(min.getKodeTransaksi(), min.getNamaPeminjam(), min.getLamaPinjam(), min.getTotalBiaya(), min.getBr());
            min.setKodeTransaksi(current.getKodeTransaksi());
            min.setNamaPeminjam(current.getNamaPeminjam());
            min.setLamaPinjam(current.getLamaPinjam());
            min.setTotalBiaya(current.getTotalBiaya());
            min.setBr(current.getBr());
            current.setKodeTransaksi(temp.getKodeTransaksi());
            current.setNamaPeminjam(temp.getNamaPeminjam());
            current.setLamaPinjam(temp.getLamaPinjam());
            current.setTotalBiaya(temp.getTotalBiaya());
            current.setBr(temp.getBr());

            current = current.getNext();
        }
    }
}
