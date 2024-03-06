package Quiz1;

public class Pegawai19 {
    String nama;
    int masaKerjaThn;
    double jamLembur;
    int gajiPokok;

    public Pegawai19(String namaPegawai, int masaKerjaThnPegawai, double jamLemburPegawai, int gajiPokokPegawai) {
        nama = namaPegawai;
        masaKerjaThn = masaKerjaThnPegawai;
        jamLembur = jamLemburPegawai;
        gajiPokok = gajiPokokPegawai;
    }

    public double hitungGajiLembur() {
        double persenGajiPokok;
        if (masaKerjaThn < 5) {
            persenGajiPokok = 0.05;
        }else {
            persenGajiPokok = 0.1;
        }
        return jamLembur * (gajiPokok * persenGajiPokok);

    }

    public double hitungTunjangan() {
        if (masaKerjaThn < 5) {
            return gajiPokok * 0.25;
        }else {
            return gajiPokok * 0.5;
        }
    }

    public double hitungGajiTotal () {
        return gajiPokok + hitungGajiLembur() + hitungTunjangan();
    }
}