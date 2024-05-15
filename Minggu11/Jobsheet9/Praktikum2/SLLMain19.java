package Minggu11.Jobsheet9.Praktikum2;

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

        System.out.println("Data pada indeks ke-1=" + singLL19.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL19.indexOf(760));
        singLL19.remove(999);
        singLL19.print();
        singLL19.removeAt(0);
        singLL19.print();
        singLL19.removeFirst();
        singLL19.print();
        singLL19.removeLast();
        singLL19.print();
    }
}
