package Minggu16.Percobaan3;

public class Mahasiswa19 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa19() {
    }

    public Mahasiswa19(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String toString() {
        return "Mahasiswa{"+"nim="+nim+", nama="+nama+", notelp="+notelp+'}';
    }
}