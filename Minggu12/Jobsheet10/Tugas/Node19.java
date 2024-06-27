package Minggu12.Jobsheet10.Tugas;

public class Node19 {
    int nomorData;
    String data;
    Node19 prev, next;

    Node19(Node19 prev, String data, Node19 next, int nomorData) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.nomorData = nomorData;
    }
}