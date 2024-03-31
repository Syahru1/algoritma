package Jobsheet7.TestSearching.P7;

public class pencarianBuku19 {
    Buku19 listBk[] = new Buku19[5];
    int idx;

    void tambah(Buku19 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku19 m : listBk) {
            m.tampilDataBuku19();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for(int j = 0; j < listBk.length; j++) {
            if(listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if(pos != -1) {
            System.out.println("Data : " + x + "ditemukan pada indeks " + pos);
        }else {
            System.out.println("Data : " + x +"tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x );
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        }else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}