package Jobsheet3.Latihan1;

public class Kerucut19 {
    double sisiMiring, jariJari;

    public double hitungLuasPermukaan() {
        double luasPermukaan = 0;
        luasPermukaan = Math.PI * jariJari * (sisiMiring + jariJari);
        return luasPermukaan;
    }

    public double hitungVolume() {
        double volume = 0;
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));
        volume = (1.0/3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }
}
