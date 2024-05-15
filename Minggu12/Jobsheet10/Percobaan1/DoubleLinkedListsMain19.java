package Minggu12.Jobsheet10.Percobaan1;

public class DoubleLinkedListsMain19 {
    public static void main(String[] args) throws Exception{
        DoubleLinkedLists19 dll = new DoubleLinkedLists19();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}