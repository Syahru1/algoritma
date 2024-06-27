package Minggu11.Jobsheet9.Tugas1;

public class MahasiswaSLL19 {
    String nim, nama;

    public MahasiswaSLL19(){

    }

    public MahasiswaSLL19(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public void print(){
        System.out.println("NIM = "+nim);
        System.out.println("Nama = "+nama);
    }
}