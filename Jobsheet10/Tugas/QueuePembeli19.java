package Jobsheet10.Tugas;

public class QueuePembeli19 {
    Pembeli19 antrian[];
    int front, rear, size, max;

    public QueuePembeli19(int n) {
        max = n;
        antrian = new Pembeli19[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsFull() {
        if(size == max) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public void enqueue(Pembeli19 antri) {
        if(IsFull()) {
            System.out.println("Queue sudah penuh");
        }else {
            if(isEmpty()) {
                front = rear = 0;
            }else {
                if(rear == max -1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli19 Dequeue() {
        Pembeli19 dt = null;
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            dt = antrian[front];
            size--;
            if(isEmpty()) {
                front = rear = -1;
            }else {
                if(front == max -1) {
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " | " + antrian[i].noHp);
                i = (i + 1) % max;
            }
                System.out.println(antrian[i].nama + " | " + antrian[i].noHp); 
            System.out.println("Jumlah elemen = " + size); 
        }
    }

    public void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen Terdepan: " + antrian[front].nama + " " + antrian[front].noHp);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if(!isEmpty()) {
            System.out.println("Elemen Paling Belakang: " + antrian[rear].nama + " " + antrian[rear].noHp);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            for(int i = 0; i < antrian.length; i++) {
                if(antrian[i].nama.equals(nama)) {
                    System.out.println("Nama Pembeli ditemukan berada" + " pada antrian ke-: " + i);
                    break;
                }
            }
        }
    }

    public void daftarPembeli() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.println(i + ") " + antrian[i].nama);
                i = (i + 1) % max;
            }
                System.out.println(i+") " + antrian[i].nama);
            System.out.println("Jumlah elemen = " + size);
        }
    }
} 