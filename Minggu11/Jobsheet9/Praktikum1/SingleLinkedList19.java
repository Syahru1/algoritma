package Minggu11.Jobsheet9.Praktikum1;

public class SingleLinkedList19 {
    Node19 head, tail;

    boolean isEmpty() {
        //return head != null;
        return head == null;
    }

    void print() {
        if(!isEmpty()) {
            Node19 tmp = head;
            System.out.println("Isi Linked List");
            while(tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node19 ndInput = new Node19(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
            //ndInput.next = head;
            //head = ndInput;
        }else {
            //head = ndInput;
            //tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }

    }

    void addLast(int input) {
        Node19 ndInput = new Node19(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
            //tail.next = ndInput;
            //tail = ndInput;
        }else {
            //head = ndInput;
            //tail = ndInput;
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node19 ndInput = new Node19(input, null);
        Node19 temp = head;
        do{
            if(temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                //if(ndInput.next != null) {
                if(ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        }
        //while(temp == null);
        while(temp != null);
    }

    void insertAt(int index, int input) {
        Node19 ndInput = new Node19(input, null);
        //if(index > 0) {
        if(index < 0) {
            System.out.println("perbaiki logikanya!" + " kalau indeksnya -1 bagaimana???");
        }else if(index == 0) {
            addFirst(input);
        }else {
            Node19 temp = head;
            //for(int i = 0; i < index; i++) {
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node19(input, temp.next);
            //JIKA DIURAI
            //Node19 ndInput = new Node19(input, null);
            //ndInput.next = temp.next;
            //temp.next = ndInput;
            if(temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}