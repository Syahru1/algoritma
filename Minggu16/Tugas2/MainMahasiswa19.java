package Minggu16.Tugas2;
import java.util.Scanner;

public class MainMahasiswa19 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Mahasiswa19.dataMahasiswa();
        MataKuliah19.dataMataKuliah();

        while (true) {
            System.out.println("\n===============================================");
            System.out.println(" SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER ");
            System.out.println("=================================================");
            System.out.println("Menu:");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Cari Nilai Mahasiswa");
            System.out.println("4. Urutkan Data Nilai");
            System.out.println("5. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("6. Tampilkan Data Mahasiswa");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    Nilai19.inputNilai();
                    break;
                case 2:
                    Nilai19.tampilNilai();
                    break;
                case 3:
                    Nilai19.cariNilaiMahasiswa();
                    break;
                case 4:
                    Nilai19.urutDataNilai();
                    break;
                case 5:
                    Mahasiswa19.tampilDaftarMahasiswa();
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    Mahasiswa19.hapusMahasiswa(nimHapus);
                    Mahasiswa19.tampilDaftarMahasiswa();
                    break;
                case 6:
                    Mahasiswa19.tampilDaftarMahasiswa();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}