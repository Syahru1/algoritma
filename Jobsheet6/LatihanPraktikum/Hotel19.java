package Jobsheet6.LatihanPraktikum;

public class Hotel19 {
    String nama, kota;
    int harga;
    Byte bintang;

    public Hotel19(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    
    void tampil() {
        System.out.println("Nama Hotel = " + nama);
        System.out.println("Kota Hotel = " + kota);
        System.out.println("Harga Hotel = " + harga);
        System.out.println("Bintang Hotel = " + bintang);
    }
}