package UTS;

public class Inventaris19 {
    private Produk19[] produkArray; //Menyimpan objek-objek Produk19.
    private int jumlahProduk; //Atribut untuk menyimpan jumlah produk yang ada dalam array.

    public Inventaris19() {
        this.produkArray = new Produk19[10]; //Membuat array dengan ukuran 10.
        this.jumlahProduk = 0; //Menginisialisasi jumlah array dengan nilai 0.
    }
    //Untuk menambahkan objek Produk19 ke dalam array produkArray dalam kelas Inventaris19.
    public void tambahProduk(Produk19 produk) {
        if (jumlahProduk < produkArray.length) { //Memeriksa apakah jumlah produk saat ini (jumlahProduk) kurang dari panjang array produkArray.
            produkArray[jumlahProduk] = produk; //Menambahkan objek Produk19 ke dalam array produkArray.
            jumlahProduk++; //Meningkatkan nilai jumlahProduk sebanyak 1.
        } else { //Jika jumlah produk saat ini (jumlahProduk) sama atau lebih besar dari panjang array produkArray, maka array produkArray akan diperluas.
            Produk19[] newArray = new Produk19[jumlahProduk * 2]; //Membuat array baru dengan ukuran dua kali lipat dari jumlahProduk saat ini.
            for (int i = 0; i < jumlahProduk; i++) { //Meng-copy semua elemen dari produkArray ke newArray.
                newArray[i] = produkArray[i]; 
            }
            produkArray = newArray; //Mengganti produkArray dengan newArray.
            produkArray[jumlahProduk] = produk; //Menambahkan objek Produk19 ke dalam produkArray.
            jumlahProduk++; //Meningkatkan nilai jumlahProduk sebanyak 1.
        }
    }
    //Mengembalikan array produkArray dari kelas Inventaris19.
    public Produk19[] dapatkanProdukArray() { //Deklarasi dari metode dapatkanProdukArray yang akan mengembalikan array produkArray.
        Produk19[] result = new Produk19[jumlahProduk]; //Membuat array result dengan ukuran sesuai dengan jumlahProduk saat ini.
        for (int i = 0; i < jumlahProduk; i++) {  //Meng-copy semua elemen dari produkArray ke result.
            result[i] = produkArray[i]; //Meng-copy elemen produkArray ke result sesuai dengan indeks i.
        }
        return result; //Mengembalikan array result yang berisi objek Produk19.
    }
    //Mengurutkan array produkArray berdasarkan nilai stok produk dari yang terkecil ke yang terbesar.
    public Produk19[] urutkanBerdasarkanStok() {  //Deklarasi dari metode urutkanBerdasarkanStok yang akan mengembalikan array produkArray yang sudah diurutkan berdasarkan stok.
        for (int i = 0; i < jumlahProduk - 1; i++) { //Iterasi pertama untuk membandingkan semua elemen dalam array.
            for (int j = 0; j < jumlahProduk - i - 1; j++) {//Iterasi kedua untuk membandingkan elemen-elemen yang belum diurutkan.
                // Membandingkan stok dari dua elemen yang sedang dibandingkan. Jika stok elemen j lebih besar dari stok elemen j + 1, maka kedua elemen tersebut akan ditukar posisinya.
                if (produkArray[j].tambahStok() > produkArray[j + 1].tambahStok()) { 
                    Produk19 temp = produkArray[j]; //Menyimpan elemen j dalam variabel temp.
                    produkArray[j] = produkArray[j + 1]; //Menyalin elemen j + 1 ke elemen j.
                    produkArray[j + 1] = temp; //Menyalin elemen temp ke elemen j + 1.
                }
            }
        }
        return dapatkanProdukArray(); // Mengembalikan array produkArray yang sudah diurutkan berdasarkan stok.
    }
    //Mengembalikan array Produk19 yang berisi semua produk makanan tanpa stok.
    public Produk19[] dapatkanMakananTanpaStok() {
        Produk19[] result = new Produk19[jumlahProduk]; 
        int count = 0;
        for (int i = 0; i < jumlahProduk; i++) { //Looping untuk memeriksa setiap objek Produk19 dalam array produkArray.
            //Memeriksa apakah objek Produk19 memiliki kategori "Makanan" dan stoknya adalah 0.
            if (produkArray[i].tambahKategori().equalsIgnoreCase("Makanan") && produkArray[i].tambahStok() == 0) {
                result[count] = produkArray[i]; //Menambahkan objek Produk19 yang sesuai kriteria ke dalam array result.
                count++;
            }
        }
        Produk19[] finalResult = new Produk19[count];
        for (int i = 0; i < count; i++) {  //eng-copy semua elemen dari result ke finalResult.
            finalResult[i] = result[i]; //Meng-copy elemen result ke finalResult sesuai dengan indeks i.
        }
        return finalResult; //Mengembalikan array finalResult yang berisi objek Produk19 dengan kategori "Makanan" dan stoknya 0.
    }
    //Mencari produk berdasarkan kata kunci nama dan mengembalikan array Produk19 yang berisi produk yang sesuai.
    public Produk19[] cariProdukDenganNama(String nama) {
        Produk19[] result = new Produk19[jumlahProduk];
        int count = 0;
        for (int i = 0; i < jumlahProduk; i++) { // Looping untuk memeriksa setiap objek Produk19 dalam array produkArray.
            //Memeriksa apakah nama objek Produk19 mengandung kata kunci yang diberikan.
            if (produkArray[i].tambahNama().toLowerCase().contains(nama.toLowerCase())) {
                result[count] = produkArray[i]; //Menambahkan objek Produk19 yang sesuai kriteria ke dalam array result.
                count++; //Meningkatkan nilai count sebanyak 1.
            }
        }
        Produk19[] finalResult = new Produk19[count]; //Membuat array finalResult dengan ukuran sesuai dengan count.
        for (int i = 0; i < count; i++) {//Meng-copy semua elemen dari result ke finalResult.
            finalResult[i] = result[i]; //Meng-copy elemen result ke finalResult sesuai dengan indeks i.
        }
        return finalResult; //Mengembalikan array finalResult yang berisi objek Produk19 dengan nama yang mengandung kata kunci yang diberikan.
    }
    //Mencari produk berdasarkan kode barang dan mengembalikan objek Produk19 yang sesuai.
    public Produk19 cariProdukDenganKode(String kodeBarang) { //Deklarasi dari metode cariProdukDenganKode yang akan mengembalikan objek Produk19 dari array produkArray berdasarkan kode barang yang diberikan.
        for (int i = 0; i < jumlahProduk; i++) { // Looping untuk memeriksa setiap objek Produk19 dalam array produkArray.
            if (produkArray[i].tambahKodeBarang().equals(kodeBarang)) { //Memeriksa apakah kode barang objek Produk19 sama dengan kode barang yang diberikan.
                return produkArray[i]; //Mengembalikan objek Produk19 yang sesuai dengan kode barang yang diberikan.
            }
        }
        return null; //Mengembalikan null jika tidak ada objek Produk19 yang kode barangnya sesuai dengan kode barang yang diberikan.
    }
}