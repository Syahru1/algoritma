package Minggu11.Jobsheet9.Praktikum1;

public class SLLMain19 {
    public static void main(String[] args) {
        SingleLinkedList19 singLL19 = new SingleLinkedList19();
        singLL19.print();
        singLL19.addFirst(890);
        singLL19.print();
        singLL19.addLast(760);
        singLL19.print();
        singLL19.addFirst(700);
        singLL19.print();
        singLL19.insertAfter(700, 999);
        singLL19.print();
        singLL19.insertAt(3, 833);
        singLL19.print();
    }
}