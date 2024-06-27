package Minggu11.Jobsheet9.Tugas2;

public class MahasiswaQueue {
    Node front, rear;
    int size;

    public MahasiswaQueue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueque(String nim, String nama) {
        Mahasiswa data = new Mahasiswa(nim, nama);
        Node newNode =new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa dengan NIM " + nim + " dan nama " + nama + " telah");
    }
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang dapat dilayani.");
        } else {
            Mahasiswa data = front.data;
            front = front.next;
            if (front==null) {
                rear = null;
            }
            size--;
            System.out.println("Mahasiswa berikut sudah dilayani");
            data.print();
        }
    }
    public void peek() {
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan dalan antrian");
            front.data.print();
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian saat ini:");
            Node tmp = front;
            while(tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }
}
