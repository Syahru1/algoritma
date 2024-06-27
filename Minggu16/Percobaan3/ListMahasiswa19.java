package Minggu16.Percobaan3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa19 {
    List<Mahasiswa19> mahasiswa19s = new ArrayList<>();
    public void tambah(Mahasiswa19... mahasiswa19) {
        mahasiswa19s.addAll (Arrays.asList(mahasiswa19));
    }
    public void hapus(int index) {
        mahasiswa19s.remove(index);
    }
    public void update(int index, Mahasiswa19 mhs) {
        mahasiswa19s.set(index, mhs);
    }
    public void tampil() {
        mahasiswa19s.stream().forEach(mhs ->{
            System.out.println(""+mhs.toString());
        });
    }
    int linearSearch(String nim) {
        for(int i = 0; i < mahasiswa19s.size(); i++) {
            if(nim.equals(mahasiswa19s.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public void sortingData() {
        Collections.sort(mahasiswa19s, new Comparator<Mahasiswa19>() {
            public int compare(Mahasiswa19 ml, Mahasiswa19 m2) {
                return m2.nim.compareTo(ml.nim);
            }
        });
    }

    public static void main(String[] args) {
        ListMahasiswa19 lm = new ListMahasiswa19();
        Mahasiswa19 m = new Mahasiswa19("201234", "Noureen", "02lxxl");
        Mahasiswa19 m1 = new Mahasiswa19("201235", "Akhleema", "02lxx2");
        Mahasiswa19 m2 = new Mahasiswa19("201236", "Shannum", "02lxx3");
        //menambah objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa19("201235", "Akhleema Lela","021xx2"));
        System.out.println("");
        lm.tampil();

        int indexl = Collections.binarySearch(lm.mahasiswa19s, new Mahasiswa19("201235", "", ""),
                new Comparator<Mahasiswa19>() {
            public int compare(Mahasiswa19 ml, Mahasiswa19 m2) {
                return ml.nim.compareTo(m2.nim);
            }   
        });
        if(indexl >= 0) {
            lm.update(indexl, new Mahasiswa19("201235", "Akhleema Lela", "021xx2"));
        }
        System.out.println("");
    }
}