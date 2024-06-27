package Minggu16.Tugas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nilai19 {
    Mahasiswa19 mahasiswa;
    MataKuliah19 mataKuliah;
    double nilai;
    static List<Nilai19> daftarNilai = new ArrayList<>();

    public Nilai19(Mahasiswa19 mahasiswa, MataKuliah19 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public Mahasiswa19 getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah19 getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    public static void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa19.tampilDaftarMahasiswa();
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = scanner.nextLine();
        Mahasiswa19 mahasiswa = Mahasiswa19.cariMahasiswa(nim);
        
        if (mahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan!");
            return;
        }

        MataKuliah19.tampilDaftarMataKuliah();
        System.out.print("Pilih MK by kode: ");
        String kode = scanner.nextLine();
        MataKuliah19 mataKuliah = MataKuliah19.cariMataKuliah(kode);
        
        if (mataKuliah == null) {
            System.out.println("Mata Kuliah tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan Nilai: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        Nilai19 nilaiObj = new Nilai19(mahasiswa, mataKuliah, nilai);
        daftarNilai.add(nilaiObj);
    }

    public static void tampilNilai() {
        System.out.println("\n========================================");
        System.out.println(" DAFTAR NILAI MAHASISWA ");
        System.out.println("========================================");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-50s | %-5s | %-5s | \n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        for (Nilai19 n : daftarNilai) {
            System.out.printf("| %-10s | %-20s | %-50s | %-5d | %-5.2f | \n", n.getMahasiswa().getNim(),
                    n.getMahasiswa().getNama(), n.getMataKuliah().getNama(), n.getMataKuliah().getSks(), n.getNilai());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }

    public static void cariNilaiMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = scanner.nextLine();
        int totalSks = 0;
        boolean found = false;

        System.out.println("\n========================================");
        System.out.println(" DAFTAR NILAI MAHASISWA ");
        System.out.println("========================================");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-50s | %-5s | %-5s | \n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        for (Nilai19 n : daftarNilai) {
            if (n.getMahasiswa().getNim().equals(nim)) {
                System.out.printf("| %-10s | %-20s | %-50s | %-5d | %-5.2f | \n", n.getMahasiswa().getNim(),
                        n.getMahasiswa().getNama(), n.getMataKuliah().getNama(), n.getMataKuliah().getSks(), n.getNilai());
                totalSks += n.getMataKuliah().getSks();
                found = true;
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");

        if (found) {
            System.out.println("Total SKS yang telah diambil sebanyak: " + totalSks + " SKS");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan atau belum memiliki nilai.");
        }
    }

    public static void urutDataNilai() {
        daftarNilai.sort((n1, n2) -> Double.compare(n2.getNilai(), n1.getNilai()));

        System.out.println("\n========================================");
        System.out.println(" DAFTAR NILAI MAHASISWA ");
        System.out.println("========================================");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-50s | %-5s | %-5s | \n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        for (Nilai19 n : daftarNilai) {
            System.out.printf("| %-10s | %-20s | %-50s | %-5d | %-5.2f | \n", n.getMahasiswa().getNim(),
                    n.getMahasiswa().getNama(), n.getMataKuliah().getNama(), n.getMataKuliah().getSks(), n.getNilai());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}