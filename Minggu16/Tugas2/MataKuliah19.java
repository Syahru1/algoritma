package Minggu16.Tugas2;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah19 {
    private String kode;
    private String nama;
    private int sks;
    private static List<MataKuliah19> daftarMataKuliah = new ArrayList<>();

    public MataKuliah19(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public static void dataMataKuliah() {
        daftarMataKuliah.add(new MataKuliah19("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah19("00002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new MataKuliah19("00003", "Algoritma dan Pemograman", 2));
        daftarMataKuliah.add(new MataKuliah19("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah19("00005", "Algoritma dan Pemograman Algoritma dan Pemograman", 3));
    }

    public static void tampilDaftarMataKuliah() {
        System.out.println("\n========================================");
        System.out.println(" DAFTAR MATA KULIAH ");
        System.out.println("========================================");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-50s | %-5s|\n", "Kode", "Mata Kuliah", "SKS");
        System.out.println("--------------------------------------------------------------------------");

        for (MataKuliah19 mk : daftarMataKuliah) {
            System.out.printf("| %-10s | %-50s | %-5d|\n", mk.getKode(), mk.getNama(), mk.getSks());
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public static MataKuliah19 cariMataKuliah(String kode) {
        for (MataKuliah19 mk : daftarMataKuliah) {
            if (mk.getKode().equals(kode)) {
                return mk;
            }
        }
        return null;
    }
}