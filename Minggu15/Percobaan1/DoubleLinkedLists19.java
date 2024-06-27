package Minggu15.Percobaan1;

public class DoubleLinkedLists19 {
    Node19 head;
    int size;

    public DoubleLinkedLists19(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item,int jarak){
        if (isEmpty()){
            head = new Node19(null, item, jarak, null);
        } else{
            Node19 newNode = new Node19(null, item, jarak, null);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item){
        if(isEmpty()){
            addFirst(item, item);
        }else{
            Node19 curent = head;
            while (curent.next != null) {
                curent = curent.next;
            }
            Node19 newNode = new Node19(curent, item, item, curent);
            curent.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception{
        if (isEmpty()){
            addFirst(item, index);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks diluar batas");
        } else{
            Node19 current = head;
            int i = 0;
            while (i<index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                Node19 newNode = new Node19(current, index, i, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node19 newNode = new Node19(current, index, i, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()){
            Node19 tmp = head;
            while (tmp !=null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    // praktikum 2
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if (head.next==null) {
            head = null;
            size--;
            return;
        } 
        Node19 current = head;
        while (current.next.next !=null) {
            current = current.next;
        }
        current.next = null;
        size--;
    } 

    //setelah dimodifikasi
    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks diluar batas.");
        }
        Node19 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        size--;
    }
    
    public int getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        Node19 tmp = head;
        while (tmp.next !=null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    //setelah di modifikasi
    public int get(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indeks diluar batas.");
        }
        Node19 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
        

    public int getJarak(int index) throws Exception{
        if(isEmpty() || index >= size ){
            throw new Exception("Nilai indeks diluar batas.");
        }
        Node19 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

}