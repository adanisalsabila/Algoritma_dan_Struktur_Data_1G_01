package P3.LatihanPraktikum1;

import java.util.Scanner;

public class BangunMain {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        Object[] bangunRuang = new Object[3];

        for (int i = 0; i < bangunRuang.length; i++) {
            System.out.println("Bangun Ruang ke-" + (i+1));
            System.out.println("Pilih jenis bangun ruang (1 = Kerucut, 2 = Limas Segi Empat, 3 = Bola): ");
            int pilihan = sc01.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan jari-jari: ");
                    double jariJariKerucut = sc01.nextDouble();
                    System.out.println("Masukkan tinggi: ");
                    double tinggiKerucut = sc01.nextDouble();
                    System.out.println("Masukkan sisi miring: ");
                    double sisiMiringKerucut = sc01.nextDouble();
                    bangunRuang[i] = new Kerucut(jariJariKerucut, tinggiKerucut, sisiMiringKerucut);
                    break;

                case 2:
                    System.out.println("Masukkan panjang sisi alas: ");
                    double sisiAlasLimas = sc01.nextDouble();
                    System.out.println("Masukkan tinggi limas: ");
                    double tinggiLimas = sc01.nextDouble();
                    bangunRuang[i] = new LimasSegiEmpat(sisiAlasLimas, tinggiLimas);
                    break;
                case 3:
                    System.out.println("Masukkan jari-jari bola: ");
                    double jariJariBola = sc01.nextDouble();
                    bangunRuang[i] = new Bola(jariJariBola);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        for (int i = 0; i < bangunRuang.length; i++) {
            System.out.println("\nBangun Ruang ke-" + (i+1));
            if (bangunRuang[i] instanceof Kerucut) {
                Kerucut kerucut = (Kerucut) bangunRuang[i];
                System.out.println("Luas Permukaan Kerucut: " + kerucut.hitungLuasPermukaan());
                System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
            } else if (bangunRuang[i] instanceof LimasSegiEmpat) {
                LimasSegiEmpat limas = (LimasSegiEmpat) bangunRuang[i];
                System.out.println("Luas Permukaan Limas Segi Empat: " + limas.hitungLuasPermukaan());
                System.out.println("Volume Limas Segi Empat: " + limas.hitungVolume());
            } else if (bangunRuang[i] instanceof Bola) {
                Bola bola = (Bola) bangunRuang[i];
                System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
                System.out.println("Volume Bola: " + bola.hitungVolume());
            }
        }
    }
}