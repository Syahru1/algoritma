package quiz2MuhammadSyahrulGunawan;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll1 = new DoubleLinkedList();
        dll1.addFirst(45);
        dll1.addFirst(10);
        dll1.addFirst(10);
        dll1.addFirst(15);
        dll1.addFirst(150);
        dll1.print(); 
        dll1.deleteFirst();
        dll1.print(); 
        dll1.printFromTail(); 
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        System.out.println("\nMenampilkan addLast");
        dll1.addLast(30);
        dll1.addLast(20);
        dll1.print(); 
        System.out.println("\nMenampilkan printFromtAIL");
        dll1.printFromTail(); 
        //lanjutkan dengan memanggil method merge, split
        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(70);
        dll2.addFirst(60);
        dll2.addFirst(50);
        System.out.println("\nList 1 Sebelum merge:");
        dll1.print(); 
        System.out.println("List 2 Sebelum merge:");
        dll2.print();

        System.out.println("Setelah Merge dll1 and dll2:");
        merge(dll1, dll2); 
        dll1.print();
        dll1.printFromTail();

    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1, DoubleLinkedList dll2) {
        //complete this method
        if (dll1.isEmpty()) {
            dll1.head = dll2.head;
            dll1.tail = dll2.tail;
            dll1.size = dll2.size;
        } else if (!dll2.isEmpty()) {
            dll1.tail.n = dll2.head;
            dll2.head.p = dll1.tail;
            dll1.tail = dll2.tail;
            dll1.size += dll2.size;
        }
    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
