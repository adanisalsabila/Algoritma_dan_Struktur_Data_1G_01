package P5.Praktikum3;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan masukkan jumlah perusahaan : ");
        int jumlah = sc.nextInt();
        double totalUntungSemuaPerusahaan = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("====================================================");
            System.out.println("Program Menghitung Total (Satuan Juta. Misal 5.9)");
            System.out.println("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("=====================================================");
            double[] keuntunganPerusahaan = new double[elm];
            for (int j = 0; j < sm.elemen; j++) {
                System.out.println("Masukkan untung bulan ke - " +(j+1)+" = ");
                keuntunganPerusahaan[j] = sc.nextDouble();
                totalUntungSemuaPerusahaan += keuntunganPerusahaan[j];
            }

            System.out.println("=====================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "+sm.totalBF(keuntunganPerusahaan));
            System.out.println("=====================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "+sm.totalDC(keuntunganPerusahaan, 0, sm.elemen-1));
        }
        System.out.println("Total Untung Semua Perusahaan Sebesar " + totalUntungSemuaPerusahaan);
    }
}
