package Minggu16.Tugas1;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa19 {
    String nim;
    String nama;
    static List<Mahasiswa19> daftarMahasiswa = new ArrayList<>();

    public Mahasiswa19(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public static void dataMahasiswa() {
        daftarMahasiswa.add(new Mahasiswa19("20001", "Thalhan"));
        daftarMahasiswa.add(new Mahasiswa19("20002", "Zubair"));
        daftarMahasiswa.add(new Mahasiswa19("20003", "Abdur-Rahman"));
        daftarMahasiswa.add(new Mahasiswa19("20004", "Agung F"));
        daftarMahasiswa.add(new Mahasiswa19("20005", "Sa ' id"));
        daftarMahasiswa.add(new Mahasiswa19("20006", "Ubaidah"));
    }

    public static void tampilDaftarMahasiswa() {
        System.out.println("\n========================================");
        System.out.println(" DAFTAR MAHASISWA ");
        System.out.println("========================================");
        System.out.println("--------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-10s |\n", "NIM", "Nama", "Telf");
        System.out.println("--------------------------------------------------");

        for (Mahasiswa19 m : daftarMahasiswa) {
            System.out.printf("| %-10s | %-20s | %-10s | \n", m.getNim(), m.getNama(), "021xxx");
        }
        System.out.println("--------------------------------------------------");
    }

    public static Mahasiswa19 cariMahasiswa(String nim) {
        for (Mahasiswa19 m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null;
    }
}
