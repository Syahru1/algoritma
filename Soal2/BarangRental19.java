package UAS.Soal2;

public class BarangRental19 {
    private String noTNKB;
    private String namaKendaraan;
    private String jenisKendaraan;
    private int tahun;
    private int biayaSewa;
    private boolean statusPeminjaman; // Menyimpan status peminjaman
    private BarangRental19 prev;
    private BarangRental19 next;

    public BarangRental19(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
        this.statusPeminjaman = false; // Saat dibuat, status peminjaman diatur ke false
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public void setNoTNKB(String noTNKB) {
        this.noTNKB = noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }

    public void setBiayaSewa(int biayaSewa) {
        this.biayaSewa = biayaSewa;
    }

    public boolean getStatusPeminjaman() { // Metode untuk mengambil status peminjaman
        return statusPeminjaman;
    }

    public void setStatusPeminjaman(boolean statusPeminjaman) { // Metode untuk mengatur status peminjaman
        this.statusPeminjaman = statusPeminjaman;
    }

    public BarangRental19 getPrev() {
        return prev;
    }

    public void setPrev(BarangRental19 prev) {
        this.prev = prev;
    }

    public BarangRental19 getNext() {
        return next;
    }

    public void setNext(BarangRental19 next) {
        this.next = next;
    }
}
