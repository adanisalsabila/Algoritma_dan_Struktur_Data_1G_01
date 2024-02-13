import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input nilai masing-masing matkul
        System.out.println("----Program Menghitung IP Semester----");
        System.out.println("=====================================================================================================");
        System.out.println("Selamat Datang! \nSilahkan masukkan nilai masing-masing matkul Anda untuk menghitung IP Semester ini.");
        System.out.println("=====================================================================================================");
        System.out.println("Masukkan nilai angka MK Pancasila :");
        double nilaiPancasila = sc.nextDouble();
        System.out.println("Masukkan nilai angka MK Konsep Teknologi Informasi :");
        double nilaiKTI = sc.nextDouble();
        System.out.println("Masukkan nilai angka MK Critical Thinking and Problem Solving :");
        double nilaiCTPS = sc.nextDouble();
        System.out.println("Masukkan nilai angka MK Matematika Dasar :");
        double nilaiMatDas = sc.nextDouble();
        System.out.println("Masukkan nilai angka MK Bahasa Inggris :");
        double nilaiBhsInggris = sc.nextDouble();
        System.out.println("Masukkan nilai angka MK Dasar Pemrograman :");
        double nilaiDasPro = sc.nextDouble();
        System.out.println("Masukkan nilai angka MK Praktikum Dasar Pemrograman :");
        double nilaiPrakDasPro = sc.nextDouble();
        System.out.println("Masukkan nilai angka MK Keselamatan dan Kesehatan Kerja :");
        double nilaiK3 = sc.nextDouble();

        // konversi nilai ke huruf IP dan bobot nilai
        String[] namaMataKuliah = { "Pancasila", "KTI", "CTPS", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Prak. DasPro", "K3" };
        double[] nilaiMataKuliah = { nilaiPancasila, nilaiKTI, nilaiCTPS, nilaiMatDas, nilaiBhsInggris, nilaiDasPro, nilaiPrakDasPro, nilaiK3 };
        String[] konversiIP = new String[8];
        double[] bobotNilai = new double[8];

        for (int i = 0; i < 8; i++) {
            konversiIP[i] = konversiNilai(nilaiMataKuliah[i]);
            bobotNilai[i] = hitungBobot(nilaiMataKuliah[i]);
        }

        // hitung IP semester
        double ipSemester = hitungIPSemester(bobotNilai);

        // menampilkan hasil dalam bentuk tabel
        System.out.println("===================================================================");
        System.out.println("| No |     Mata Kuliah     | Nilai Mata Kuliah | Konversi | Bobot |");
        System.out.println("===================================================================");
        for (int i = 0; i < 8; i++) {
            System.out.printf("| %-2d | %-20s | %-17.2f | %-8s | %-5.2f |\n", (i + 1), namaMataKuliah[i], nilaiMataKuliah[i], konversiIP[i], bobotNilai[i]);
        }
        System.out.println("===================================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        sc.close();
    }

    // konversi nilai ke huruf IP
    public static String konversiNilai(double nilai) {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 75) {
            return "A-";
        } else if (nilai >= 70) {
            return "B+";
        } else if (nilai >= 65) {
            return "B";
        } else if (nilai >= 60) {
            return "B-";
        } else if (nilai >= 55) {
            return "C+";
        } else if (nilai >= 50) {
            return "C";
        } else if (nilai >= 45) {
            return "D";
        } else {
            return "E";
        }
    }

    // menghitung bobot nilai
    public static double hitungBobot(double nilai) {
        if (nilai >= 80) {
            return 4.0;
        } else if (nilai >= 75) {
            return 3.7;
        } else if (nilai >= 70) {
            return 3.3;
        } else if (nilai >= 65) {
            return 3.0;
        } else if (nilai >= 60) {
            return 2.7;
        } else if (nilai >= 55) {
            return 2.3;
        } else if (nilai >= 50) {
            return 2.0;
        } else if (nilai >= 45) {
            return 1.5;
        } else {
            return 0.0;
        }
    }

    // menghitung IP semester
    public static double hitungIPSemester(double[] bobotNilai) {
        double totalBobot = 0;
        for (double bobot : bobotNilai) {
            totalBobot += bobot;
        }
        return totalBobot / bobotNilai.length;
    }
}
