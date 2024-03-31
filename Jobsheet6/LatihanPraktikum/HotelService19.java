package Jobsheet6.LatihanPraktikum;
import java.util.Scanner;

import Jobsheet6.Mahasiswa19;

public class HotelService19 {
    Hotel19 rooms[];
    int idx;
    
    public HotelService19(int n) {
        rooms = new Hotel19[n];
        idx = 0;
    }

    void tambah(Hotel19 h) {
        if(idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        }else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for(Hotel19 h : rooms) {
            h.tampil();
        }
    }

    void bubbleSort() {
        for(int i = 0; i < rooms.length-1; i++) {
            for(int j = 1; j < rooms.length-i; j++) {
                if(rooms[j].harga < rooms[j-1].harga) {
                    Hotel19 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for(int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for(int j = i + 1; j < rooms.length; j++) {
                if(rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            //swap
            Hotel19 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
