package Jobsheet7.Latihan2;
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

    public void cariJudulSeq(String judul) {
        int jumlahHasil = 0;
        for (Buku19 m : listBk) {
            if (m.judulBuku.equalsIgnoreCase(judul)) {
                m.tampilDataBuku19();
                jumlahHasil++;
            }
        }
        if (jumlahHasil == 0) {
            System.out.println("Data dengan judul " + judul + " tidak ditemukan");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul " + judul);
        }
    }

    public void sortingJudul() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku19 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public void cariJudulBin(String judul) {
        int left = 0;
        int right = idx - 1;
        int jumlahHasil = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(judul)) {
                int start = mid;
                int end = mid;

                while (start > 0 && listBk[start - 1].judulBuku.equalsIgnoreCase(judul)) {
                    start--;
                }

                while (end < idx - 1 && listBk[end + 1].judulBuku.equalsIgnoreCase(judul)) {
                    end++;
                }

                for (int i = start; i <= end; i++) {
                    listBk[i].tampilDataBuku19();
                    jumlahHasil++;
                }
                break;
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(judul) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (jumlahHasil == 0) {
            System.out.println("Data dengan judul " + judul + " tidak ditemukan");
        } else if (jumlahHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul " + judul);
        }
    }
}