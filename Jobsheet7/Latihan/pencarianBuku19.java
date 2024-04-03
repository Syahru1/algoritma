package Jobsheet7.Latihan;
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

    public void tampilPosisi(String x, int pos) {
        if(pos != -1) {
            System.out.println("Data : " + x + "ditemukan pada indeks " + pos);
        }else {
            System.out.println("Data : " + x +"tidak ditemukan");
        }
    }

    public void tampilData(String kode, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + kode);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + kode + " tidak ditemukan");
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listBk[j].kodeBuku.equals(cari)) { 
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = listBk[mid].kodeBuku.compareTo(cari); 
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }
}