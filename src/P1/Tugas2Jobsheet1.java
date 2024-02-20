package P1;
import java.util.Scanner;

public class Tugas2Jobsheet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----Penghitung Kecepatan, Jarak, dan Waktu----");
            System.out.println("===============================================");
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("0. Keluar");
            System.out.println("===============================================");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();

            if (pilihan == 0) {
                break;
            }

            // memanggil fungsi
            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Invalid!");
            }
        }

        sc.close();
    }

    // menghitung kecepatan
    public static void hitungKecepatan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (m): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = sc.nextDouble();
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }

    // menghitung jarak
    public static void hitungJarak() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = sc.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = sc.nextDouble();
        double jarak = kecepatan * waktu;
        System.out.println("Jarak: " + jarak + " m");
    }

    // menghitung waktu
    public static void hitungWaktu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (m): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = sc.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu + " s");
    }
}
