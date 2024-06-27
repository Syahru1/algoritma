package Minggu12.Jobsheet10.Tugas2;

public class Film19 {
    private String id;
    private String judul;
    private double rating;
    private Film19 next;
    private Film19 prev;

    public Film19(String id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public double getRating() {
        return rating;
    }

    public Film19 getNext() {
        return next;
    }

    public Film19 getPrev() {
        return prev;
    }

    public void setNext(Film19 next) {
        this.next = next;
    }

    public void setPrev(Film19 prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "ID \t: " + id + "\nJudul \t: " + judul + "\nRating \t: " + rating;
    }
}
