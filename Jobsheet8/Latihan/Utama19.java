package Jobsheet8.Latihan;
import java.util.Scanner;
public class Utama19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gudang19 gudang = new Gudang19(7);
        
        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
                    Barang19 barangBaru = new Barang19(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Pilih kriteria pencarian:");
                    System.out.println("1. Berdasarkan kode barang");
                    System.out.println("2. Berdasarkan nama barang");
                    System.out.print("Masukkan pilihan (1/2): ");
                    int pilihanCari = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (pilihanCari) {
                        case 1:
                            System.out.println("Masukkan kode barang yang ingin dicari: ");
                            int kodeCari = scanner.nextInt();
                            gudang.cariBarangKode(kodeCari);
                            break;
                        case 2:
                            System.out.println("Masukkan nama barang yang ingin dicari: ");
                            String namaCari = scanner.nextLine();
                            gudang.cariBarangNama(namaCari);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            } 
        }
    }
}