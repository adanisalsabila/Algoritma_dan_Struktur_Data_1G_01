package P3.LatihanPraktikum2;

import java.util.Scanner;

public class Mahasiswa {

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
    }
}