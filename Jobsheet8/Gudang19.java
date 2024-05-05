package Jobsheet8;

import java.util.Stack;

public class Gudang19 {
    Barang19[] tumpukan;
    int size;
    int top;

    public Gudang19(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang19[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean cekPenuh() {
        /*if (top == -1) {
            return true;
        }else {
            return false;
        }*/
        return top == size -1; 
    }

    public void tambahBarang(Barang19 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        }else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang19 ambilBarang() {
        if(!cekKosong()) {
            Barang19 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        }else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang19 lihatBarangTeratas() {
        //if(!isEmpty()) {
        if(!cekKosong()) {
            Barang19 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        }else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for(int i = top; i >= 0; i--) {
            //for(int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi19 stack = new StackKonversi19();
        while(kode != 0) {
        //while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while(!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}