package UAS.Soal;

public class DoublyLinkedList19 {
    Node19 head;
    Node19 tail;
  
    public DoublyLinkedList19() {
      head = null;
      tail = null;
    }
  
    public void add(TransaksiRental19 data) {
      Node19 newNode = new Node19(data);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
      }
    }
  
    public boolean isRented(String noTNKB) {
      Node19 current = head;
      while (current != null) {
        if (current.data.br.noTNKB.equals(noTNKB)) {
          return true;
        }
        current = current.next;
      }
      return false;
    }
  
    public void sort() {
      Node19 current = head;
      while (current != null) {
        Node19 next = current.next;
        while (next != null) {
          if (current.data.shouldSwap(next.data)) {
            TransaksiRental19 temp = current.data;
            current.data = next.data;
            next.data = temp;
          }
          next = next.next;
        }
        current = current.next;
      }
    }
  
    public void display() {
      Node19 current = head;
      while (current != null) {
        current.data.displayInfo();
        current = current.next;
      }
    }
  }
  
