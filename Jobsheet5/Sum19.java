package Jobsheet5;

public class Sum19 {
    public int elemen;
    public double keuntungan[], total;

    Sum19 (int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        total = 0;
        for(int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if(l > r) {
            //return arr[l];
            return 0;
        }else if(l == r) {
            return arr[1];
            /*int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];*/
        } else {
            int mid = (l + r) / 2;
            return totalDC(arr, l, mid) + totalDC(arr, mid + 1, r);
        }
        //return 0;
    }
}