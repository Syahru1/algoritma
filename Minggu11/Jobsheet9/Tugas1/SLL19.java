package Minggu11.Jobsheet9.Tugas1;

public class SLL19 {
    Node19 head;
    int size;
    public SLL19(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void print(){
        if(isEmpty())
            System.out.println("SLL kosong!!!");
        else{
            Node19 tmp = head;
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }
    public void addFirst(MahasiswaSLL19 mhs){
        Node19 newNode = new Node19(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addLast(MahasiswaSLL19 mhs){
        Node19 newNode = new Node19(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            Node19 tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }
    public void insertAfter(String afterNim, MahasiswaSLL19 mhs){
        if(isEmpty()){
            addFirst(mhs);
        }else{
            Node19 tmp = head;
            while(tmp!=null){
                if(tmp.data.nim.equalsIgnoreCase(afterNim)){
                    Node19 newNode = new Node19(mhs);
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    size++;
                    break;
                }else{
                    tmp = tmp.next;
                }
            }
        }
    }
    public void insertAt(int idx, MahasiswaSLL19 mhs){
        if(isEmpty()||idx==0){
            addFirst(mhs);
        }else if(idx==size){
            addLast(mhs);
        }else{
            Node19 tmp = head;
            for(int i=0; i<idx-1;i++){
                tmp = tmp.next;
            }
            Node19 newNode = new Node19(mhs);
            newNode.next = tmp.next;
            tmp.next = newNode;
            size++;
        }
    }
}
