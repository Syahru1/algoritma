package Minggu16.Tugas2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Mahasiswa19 {
    private String nim;
    private String nama;
    private static List<Mahasiswa19> daftarMahasiswa = new ArrayList<>();
    private static Queue<Mahasiswa19> antrianHapus = new LinkedList<>();

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

    public static void hapusMahasiswa(String nim) {
        Mahasiswa19 mahasiswa = cariMahasiswa(nim);
        if (mahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan!");
        } else {
            antrianHapus.add(mahasiswa);
            Mahasiswa19 mahasiswaDihapus = antrianHapus.poll();
            daftarMahasiswa.remove(mahasiswaDihapus);
            System.out.println("Mahasiswa dengan NIM " + mahasiswaDihapus.getNim() + " dan nama " + mahasiswaDihapus.getNama() + " telah dihapus.");
        }
    }

}
