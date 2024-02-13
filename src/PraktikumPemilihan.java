import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAkhir;
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        // input nilai tugas, kuis, uts, uas.

        System.out.println("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        System.out.println("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        System.out.println("Masukkan nilai UTS : ");
        nilaiUTS = sc.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        System.out.println("Masukkan nilai UAS : ");
        nilaiUAS = sc.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        // nilai akhir 20% dari nilai tugas, 20% dari nilai kuis, 30% dari nilai UTS, 30% dari nilai UAS
        nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

        // jika nilai Huruf yang didapatkan adalah A,B+,B,C+,C maka LULUS, jika nilai D dan E TIDAK LULUS
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("================================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : A \nKet : SELAMAT ANDA LULUS");
            System.out.println("================================");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("================================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : B+ \nKet : SELAMAT ANDA LULUS");
            System.out.println("================================");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("================================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : B \nKet : SELAMAT ANDA LULUS");
            System.out.println("================================");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("================================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : C+ \nKet : SELAMAT ANDA LULUS");
            System.out.println("================================");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("================================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : C \nKet : SELAMAT ANDA LULUS");
            System.out.println("================================");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("================================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai Huruf : D \nKet : MAAF ANDA TIDAK LULUS");
            System.out.println("================================");
        } else if (nilaiAkhir <= 39) {
            System.out.println("================================");
            System.out.println("Nilai akhir : " + nilaiAkhir + "\nNilai huruf : E \nKet : MAAF ANDA TIDAK LULUS");
            System.out.println("================================");

        }
    }
}