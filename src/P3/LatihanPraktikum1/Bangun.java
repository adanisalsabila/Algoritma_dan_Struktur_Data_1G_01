package P3.LatihanPraktikum1;

import java.util.Scanner;

class Kerucut {
    public double jariJari;
    public double tinggi;
    public double sisiMiring;

    public Kerucut(double jariJari, double tinggi, double sisiMiring) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
}

class LimasSegiEmpat {
    private double sisiAlas;
    private double tinggi;

    public LimasSegiEmpat(double sisiAlas, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        return (sisiAlas * sisiAlas) + (4 * sisiAlas * tinggi);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * (sisiAlas * sisiAlas) * tinggi;
    }
}

class Bola {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}