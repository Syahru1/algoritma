package Jobsheet3.Latihan1;

public class LimasSegiEmpat19 {
    int sisi, tinggi;

    double hitungVolume() {
        double volume = (1.0d/3.0d) * sisi * sisi * tinggi;
        return volume;
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = (sisi * sisi) + (4 * (1.0d/2.0d) * sisi * tinggi);
        return luasPermukaan;
    }
}
