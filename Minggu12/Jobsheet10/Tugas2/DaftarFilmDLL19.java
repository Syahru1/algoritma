package Minggu12.Jobsheet10.Tugas2;

public class DaftarFilmDLL19 {
    Node19 head;
    int size;

    DaftarFilmDLL19() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film19 item) {
        if (isEmpty()) {
            head = new Node19(null, item, null);
        } else {
            Node19 newNode = new Node19(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film19 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node19 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node19 newNode = new Node19(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film19 item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node19 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node19 newNode = new Node19(current, item, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node19 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus !");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus !");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node19 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas !");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node19 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Film19 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public Film19 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node19 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film19 get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node19 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film19 getId(String id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node19 tmp = head;
        while (tmp != null) {
            if (tmp.data.getId().equals(id)) {
                return tmp.data;
            }
            tmp = tmp.next;
        }
        throw new Exception("Film dengan ID " + id + " tidak ditemukan");
    }

    public void daftarFilm() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Cetak Data");
            Node19 current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public void daftarFilmRatingDESC() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            // Menggunakan Bubble Sort untuk mengurutkan berdasarkan rating
            for (int i = 0; i < size - 1; i++) {
                Node19 current = head;
                for (int j = 0; j < size - i - 1; j++) {
                    if (current.data.getRating() < current.next.data.getRating()) {
                        // Tukar data
                        Film19 temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                    current = current.next;
                }
            }

            daftarFilm(); // Cetak daftar film setelah diurutkan
        }
    }
}
