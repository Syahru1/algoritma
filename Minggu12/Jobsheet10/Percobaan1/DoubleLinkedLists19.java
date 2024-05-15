package Minggu12.Jobsheet10.Percobaan1;

public class DoubleLinkedLists19 {
    Node19 head;
    int size;

    public DoubleLinkedLists19() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if(isEmpty()) {
            head = new Node19(null, item, null);
        }else {
            Node19 newNode19 = new Node19(null, item, head);
            head.prev = newNode19;
            head = newNode19;
        }
        size++;
    }

    public void addLast(int item) {
        if(isEmpty()) {
            addFirst(item);
        }else {
            Node19 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node19 newNode19 = new Node19(current, item, null);
            current.next = newNode19;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty() || index == 0) {
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("Nilai indexs di luar batas");
        }else {
            Node19 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node19 newNode19 = new Node19(null, item, current);
                current.prev = newNode19;
                head = newNode19;
            }else {
                Node19 newNode19 = new Node19(current.prev, item, current);
                newNode19.prev = current.prev;
                newNode19.next = current;
                current.prev.next = newNode19;
                current.prev = newNode19;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if(!isEmpty()) {
            Node19 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else {
            System.out.println("Linked Lists Kosong");
        }
    }
}