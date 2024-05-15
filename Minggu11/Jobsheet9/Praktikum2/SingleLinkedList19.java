package Minggu11.Jobsheet9.Praktikum2;

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
                System.out.println(tmp.data + "\n");
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

    /*int getSize() {
        int count = 0;
        Node19 tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        System.out.println(count);
        return count;
    }*/

    int getData(int index) {
        Node19 tmp = head;
        for(int i = 0; i < index + 1 ; i++) {
            tmp = tmp.next;
        }
        //return tmp.next.data;
        return tmp.data;
    }

    int indexOf(int key) {
        Node19 tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        //if(tmp != null) {
        if(tmp == null) {
            //return 1;
            return -1;
        }else {
            return index;
        }
    }

    void removeFirst() {
        //if(!isEmpty()) {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
        }else if(head == tail) {
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    void removeLast() {
        //if(!isEmpty()) {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
        }//else if(head != tail) {
        else if(head == tail) {
            head = tail = null;
        }else{
            Node19 temp = head;
            //while(temp.next != null) {
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            //tail = temp.next;
            tail = temp;
        }
    }

    void remove(int key) {
        //if(!isEmpty()) {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
        }else{
            Node19 temp = head;
            while(temp != null) {
                //if(temp.data != key && temp == head) {
                if(temp.data == key && temp == head) {
                    removeFirst();
                    break;
                }else if(temp.next.data == key) {
                    temp.next = temp.next.next;
                    if(temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        }else {
            Node19 temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null) {
                tail = temp;
            }
        }
    }
}