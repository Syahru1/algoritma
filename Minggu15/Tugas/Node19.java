package Minggu15.Tugas;

public class Node19 {
    int data;
    Node19 prev;
    Node19 next;
    int jarak;

    Node19(Node19 prev, int data, int jarak, Node19 next){
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.jarak = jarak;
    }
}