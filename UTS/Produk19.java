package UTS;

public class Produk19 {
    private String kodeBarang; //Menyimpan kode barang dari produk
    private String nama; //Menyimpan nama produk
    private String kategori; //Menyimpan kategori produk
    private int hargaSatuan; //Menyimpan harga satuan produk
    private int stok; //Menyimpan jumlah stok produk

    //Menginisialisasi atributnya dengan nilai yang diberikan saat objek dibuat
    public Produk19(String kodeBarang, String nama, String kategori, int hargaSatuan, int stok) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.hargaSatuan = hargaSatuan;
        this.stok = stok;
    }
    //Mengembalikan nilai dari atribut kodeBarang
    public String tambahKodeBarang() {
        return kodeBarang;
    }
    //Mengembalikan nilai dari atribut nama
    public String tambahNama() {
        return nama;
    }
    //Mengembalikan nilai dari atribut kategori
    public String tambahKategori() {
        return kategori;
    }
    //Mengembalikan nilai dari atribut hargaSatuan 
    public int tambahHargaSatuan() {
        return hargaSatuan;
    }
    //Mengembalikan nilai dari atribut stok
    public int tambahStok() {
        return stok;
    }
    //Menambah jumlah stok produk dengan nilai yang diberikan oleh parameter
    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }
    //Mengurangi jumlah stok produk dengan nilai yang diberikan oleh parameter
    public void kurangiStok(int jumlah) {
        this.stok -= jumlah;
    }
    //Mengembalikan representasi string dari objek
    public String toString() {
        return String.format("Kode Barang: %s, Nama: %s, Kategori: %s, Harga Satuan: %d, Stok: %d", 
        kodeBarang, nama, kategori, hargaSatuan, stok);
    }
}