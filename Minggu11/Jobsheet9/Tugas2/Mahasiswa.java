package Minggu11.Jobsheet9.Tugas2;

public class Mahasiswa {
    String nim;
    String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void print() {
        System.out.println("NIM: " + nim + ", Nama: " + nama);
    }
}
