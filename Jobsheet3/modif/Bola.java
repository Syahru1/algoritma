package Jobsheet3.modif;

public class Bola {
    
    int jari_jari;

    double hitungVolume() {
        double volume = 0;
        volume = (4.0/3.0) * Math.PI * Math.pow(jari_jari, 3);
        return volume;
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 0;
        luasPermukaan = 4 * Math.PI * Math.pow(jari_jari, 2);
        return luasPermukaan;
    }
}