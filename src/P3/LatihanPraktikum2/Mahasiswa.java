package P3.LatihanPraktikum2;

import java.util.Scanner;

public class Mahasiswa {
    public static double hitungRataRata(double[] ipk) {
        double total = 0;
        for (double nilai : ipk) {
            total += nilai;
        }
        return total / ipk.length;
    }

    public static double cariIPKTerbesar(double[] ipk) {
        double maxIPK = ipk[0];
        for (double nilai : ipk) {
            if (nilai > maxIPK) {
                maxIPK = nilai;
            }
        }
        return maxIPK;
    }

    public static int cariIndexIPKTerbesar(double[] ipk) {
        double maxIPK = ipk[0];
        int indexMaxIPK = 0;
        for (int i = 1; i < ipk.length; i++) {
            if (ipk[i] > maxIPK) {
                maxIPK = ipk[i];
                indexMaxIPK = i;
            }
        }
        return indexMaxIPK;
    }

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        String[] nama = new String[3];
        String[] nim = new String[3];
        char[] jenisKelamin = new char[3];
        double[] ipk = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            nama[i] = sc01.next();
            System.out.print("Masukkan nim: ");
            nim[i] = sc01.next();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            jenisKelamin[i] = sc01.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            ipk[i] = sc01.nextDouble();
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + nama[i]);
            System.out.println("NIM: " + nim[i]);
            System.out.println("Jenis Kelamin: " + jenisKelamin[i]);
            System.out.println("IPK: " + ipk[i]);
            System.out.println();
        }

        double rataRata = hitungRataRata(ipk);
        System.out.println("Rata-rata IPK: " + rataRata);

        int indexIPKTerbesar = cariIndexIPKTerbesar(ipk);
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + nama[indexIPKTerbesar]);
        System.out.println("NIM: " + nim[indexIPKTerbesar]);
        System.out.println("Jenis Kelamin: " + jenisKelamin[indexIPKTerbesar]);
        System.out.println("IPK: " + ipk[indexIPKTerbesar]);
    }
}
