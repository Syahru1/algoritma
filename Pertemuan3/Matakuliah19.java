package Pertemuan3;

public class Matakuliah19 {
    String kode;
    String nama;
    int sks;
    int jam;
    Dosen dosen;
    int kuota;
    Mahasiswa mhs[];

    void gantiKodeMK(String newKode) {
        kode = newKode;
    }

    void gantiNamaMK(String newNama) {
        nama = newNama;
    }

    void gantiDosenMK(Dosen newDosen) {
        dosen = newDosen;
    }

    void tampilMahasiswa() {
        for(Mahasiswa n:mhs) {
            System.out.println(n.alamat);
        }
    }

    public static void main(String[] args) {
        
    }
}
