package Minggu11.Jobsheet9.Tugas1;

public class MainSLL19 {
    public static void main(String[] args) {
        SLL19 sll = new SLL19();
        sll.addFirst(new MahasiswaSLL19("111", "anton"));
        sll.addLast(new MahasiswaSLL19("115", "sari"));
        sll.insertAfter("111", new MahasiswaSLL19("112", "prita"));
        sll.insertAfter("112", new MahasiswaSLL19("113", "yusuf"));
        sll.insertAt(3, new MahasiswaSLL19("114", "doni"));
        sll.print();
    }
}
