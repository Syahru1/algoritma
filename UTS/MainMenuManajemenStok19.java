package UTS;
import java.util.Scanner;

public class MainMenuManajemenStok19 {
    private Inventaris19 inventaris; //Untuk mengelola daftar produk.
    private Scanner scanner; 

    public MainMenuManajemenStok19() {
        this.inventaris = new Inventaris19(); //Menginisialisasi atribut inventaris dengan objek baru dari kelas Inventaris19.
        this.scanner = new Scanner(System.in); //Menginisialisasi atribut scanner dengan objek baru dari kelas Scanner yang menerima input dari System.in
    }
    //Deklarasi dari metode mainMenu yang akan menampilkan menu utama program dan mengelola pilihan pengguna.
    public void mainMenu() {
        while (true) { // Looping while yang akan terus berjalan selama kondisi true, sehingga menu akan terus muncul setelah pengguna memilih salah satu opsi.
            // Daftar seluruh menu
            System.out.println("\nMenu Manajemen Stok:");
            System.out.println("1. Tambah Data Barang");
            System.out.println("2. Tampilkan Semua Data Barang");
            System.out.println("3. Urutkan Data Berdasarkan Stok");
            System.out.println("4. Tampilkan Barang Makanan Tanpa Stok");
            System.out.println("5. Cari Data Barang Berdasarkan Nama");
            System.out.println("6. Tambahkan Stok untuk Barang Tertentu");
            System.out.println("7. Kurangi Stok untuk Barang Tertentu");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            
            int menu = scanner.nextInt(); //Menerima input pilihan menu dari pengguna.
            switch (menu) { //Melakukan operasi berdasarkan pilihan menu yang diinputkan oleh pengguna.
                case 1: //Memanggil metode tambahDataBarang untuk menambahkan data barang.
                    tambahDataBarang();
                    break;
                case 2: //Memanggil metode tampilkanSemuaDataBarang untuk menampilkan semua data barang.
                    tampilkanSemuaDataBarang();
                    break;
                case 3: //Memanggil metode urutkanDataBerdasarkanStok untuk mengurutkan data berdasarkan stok.
                    urutkanDataBerdasarkanStok();
                    break;
                case 4: // Memanggil metode tampilkanBarangMakananTanpaStok untuk menampilkan barang makanan tanpa stok.
                    tampilkanBarangMakananTanpaStok();
                    break;
                case 5: //Memanggil metode cariDataBarangBerdasarkanNama untuk mencari data barang berdasarkan nama.
                    cariDataBarangBerdasarkanNama();
                    break;
                case 6: //Memanggil metode tambahStokBarang untuk menambahkan stok barang tertentu.
                    tambahStokBarang();
                    break;
                case 7: //Memanggil metode kurangiStokBarang untuk mengurangi stok barang tertentu.
                    kurangiStokBarang();
                    break;
                case 8: //Mengakhiri program.
                    System.out.println("Keluar dari program.");
                    return;
                default: //Menampilkan pesan kesalahan jika pilihan tidak valid.
                    System.out.println("Pilihan tidak valid, silakan masukkan angka 1-8.");
                    break;
            }
        }
    }
    //Menambahkan data barang ke dalam inventaris.
    private void tambahDataBarang() {
        //Seluruh inputan dari pengguna.
        System.out.print("Masukkan kode barang: ");
        String kode = scanner.next();
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.next();
        System.out.print("Masukkan kategori barang: ");
        String kategori = scanner.next();
        System.out.print("Masukkan harga satuan: ");
        int harga = scanner.nextInt();
        System.out.print("Masukkan stok awal: ");
        int stok = scanner.nextInt();
        //Membuat objek Produk19 baru dengan menggunakan data yang telah dimasukkan oleh pengguna.
        Produk19 produk = new Produk19(kode, nama, kategori, harga, stok);
        inventaris.tambahProduk(produk); //Menambahkan objek produk ke dalam inventaris menggunakan metode tambahProduk dari kelas Inventaris19.
        System.out.println("Produk berhasil ditambahkan.");
    }
    //Menampilkan semua data barang yang ada di inventaris.
    private void tampilkanSemuaDataBarang() { //Deklarasi dari metode tampilkanSemuaDataBarang yang akan menampilkan semua data barang yang ada di inventaris.
        Produk19[] produkArray = inventaris.dapatkanProdukArray(); //Mengambil seluruh data barang dari inventaris dan menyimpannya dalam array produkArray.
        if (produkArray.length == 0) { //Memeriksa apakah produkArray kosong atau tidak.
            System.out.println("Belum ada data barang.");
        } else { //Jika produkArray tidak kosong, maka akan menampilkan seluruh data barang.
            for (Produk19 p : produkArray) { //Melakukan looping untuk setiap produk dalam produkArray.
                if (p != null) { //Memeriksa apakah produk tidak null
                    System.out.println(p); //Menampilkan data produk dengan memanggil metode toString() dari objek p.
                }
            }
        }
    }
    //Mengurutkan data barang berdasarkan stok dalam mode menaik.
    private void urutkanDataBerdasarkanStok() { //Deklarasi dari metode urutkanDataBerdasarkanStok yang akan mengurutkan data barang berdasarkan stok dalam mode menaik.
        Produk19[] produkArray = inventaris.urutkanBerdasarkanStok(); //Mengambil seluruh data barang dari inventaris yang telah diurutkan berdasarkan stok dan menyimpannya dalam array produkArray.
        for (Produk19 p : produkArray) { //Melakukan looping untuk setiap produk dalam produkArray.
            if (p != null) { //Memeriksa apakah produk tidak null.
                System.out.println(p); //Menampilkan data produk dengan memanggil metode toString() dari objek p.
            }
        }
    }
    //Menampilkan data barang makanan yang tidak memiliki stok.
    private void tampilkanBarangMakananTanpaStok() { //Deklarasi dari metode tampilkanBarangMakananTanpaStok yang akan menampilkan data barang makanan yang tidak memiliki stok.
        Produk19[] produkArray = inventaris.dapatkanMakananTanpaStok(); //Mengambil seluruh data barang makanan tanpa stok dari inventaris dan menyimpannya dalam array produkArray.
        if (produkArray.length == 0) { //Memeriksa apakah produkArray kosong atau tidak.
            System.out.println("Tidak ada barang makanan tanpa stok.");
        } else { //Jika produkArray tidak kosong, maka akan menampilkan seluruh data barang makanan tanpa stok.
            for (Produk19 p : produkArray) { //Melakukan looping untuk setiap produk dalam produkArray.
                if (p != null) { //Memeriksa apakah produk tidak null.
                    System.out.println(p); //Menampilkan data produk dengan memanggil metode toString() dari objek p.
                }
            }
        }
    }
    //Mencari data barang berdasarkan kata kunci nama yang dimasukkan pengguna.
    private void cariDataBarangBerdasarkanNama() { //Deklarasi dari metode cariDataBarangBerdasarkanNama yang akan mencari data barang berdasarkan kata kunci nama yang dimasukkan pengguna.
        System.out.print("Masukkan kata kunci nama barang: ");
        String nama = scanner.next();
        Produk19[] produkArray = inventaris.cariProdukDenganNama(nama); //Mencari data barang berdasarkan kata kunci nama yang dimasukkan pengguna dan menyimpannya dalam array produkArray.
        if (produkArray.length == 0) { //Memeriksa apakah produkArray kosong atau tidak.
            System.out.println("Tidak ada barang yang cocok dengan pencarian.");
        } else { //Jika produkArray tidak kosong, maka akan menampilkan seluruh data barang yang cocok dengan pencarian.
            for (Produk19 p : produkArray) { //Melakukan looping untuk setiap produk dalam produkArray.
                if (p != null) { //Memeriksa apakah produk tidak null.
                    System.out.println(p); //Menampilkan data produk dengan memanggil metode toString() dari objek p.
                }
            }
        }
    }
    //Menambah stok barang berdasarkan kode barang yang dimasukkan pengguna.
    private void tambahStokBarang() { //Deklarasi dari metode tambahStokBarang yang akan menambah stok barang berdasarkan kode barang yang dimasukkan pengguna.
        System.out.print("Masukkan kode barang untuk menambah stok: ");
        String kode = scanner.next();
        System.out.print("Masukkan jumlah stok yang akan ditambah: ");
        int jumlah = scanner.nextInt();
        //Mencari produk berdasarkan kode barang yang dimasukkan pengguna.
        Produk19 produk = inventaris.cariProdukDenganKode(kode);
        if (produk != null) { ////Memeriksa apakah produk ditemukan berdasarkan kode barang yang dimasukkan pengguna.
            produk.kurangiStok(-jumlah);
            System.out.println("Stok berhasil ditambahkan.");
        } else { //Jika produk tidak ditemukan, maka akan menampilkan pesan bahwa produk tidak ditemukan.
            System.out.println("Produk tidak ditemukan.");
        }
    }
    //Mengurangi stok barang berdasarkan kode barang yang dimasukkan pengguna.
    private void kurangiStokBarang() { //Deklarasi dari metode kurangiStokBarang yang akan mengurangi stok barang berdasarkan kode barang yang dimasukkan pengguna.
        System.out.print("Masukkan kode barang untuk mengurangi stok: ");
        String kode = scanner.next();
        System.out.print("Masukkan jumlah stok yang akan dikurangi: ");
        int jumlah = scanner.nextInt();
        //Mencari produk berdasarkan kode barang yang dimasukkan pengguna.
        Produk19 produk = inventaris.cariProdukDenganKode(kode);
        //Memeriksa apakah produk ditemukan berdasarkan kode barang yang dimasukkan pengguna dan apakah jumlah stok yang akan dikurangi tidak melebihi stok yang tersedia.
        if (produk != null && jumlah <= produk.tambahStok()) {
            produk.kurangiStok(jumlah);
            System.out.println("Stok berhasil dikurangi.");
        } else if (produk != null) { //ika produk ditemukan tetapi jumlah stok yang akan dikurangi melebihi stok yang tersedia.
            System.out.println("Jumlah pengurangan melebihi stok yang tersedia.");
        } else { // Jika produk tidak ditemukan, maka akan menampilkan pesan bahwa produk tidak ditemukan.
            System.out.println("Produk tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        //Menjalankan program manajemen stok barang.
        new MainMenuManajemenStok19().mainMenu();
    }
}