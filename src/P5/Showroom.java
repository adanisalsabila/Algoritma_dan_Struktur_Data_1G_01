package P5;

import java.util.Scanner;

public class Showroom {
    
    // Fungsi untuk mencari top acceleration tertinggi dan terendah menggunakan Divide and Conquer
    public static int[] findMaxMinAcceleration(Object[] mobilList, int start, int end) {
        if (start == end) {
            int[] result = {((Mobil) mobilList[start]).topAcceleration, ((Mobil) mobilList[start]).topAcceleration};
            return result;
        }

        int mid = (start + end) / 2;

        // Mencari top acceleration tertinggi dan terendah di setiap bagian
        int[] leftMaxMin = findMaxMinAcceleration(mobilList, start, mid);
        int[] rightMaxMin = findMaxMinAcceleration(mobilList, mid + 1, end);

        // Membandingkan dan mengembalikan top acceleration tertinggi dan terendah dari kedua bagian
        int maxAcceleration = Math.max(leftMaxMin[0], rightMaxMin[0]);
        int minAcceleration = Math.min(leftMaxMin[1], rightMaxMin[1]);

        int[] result = {maxAcceleration, minAcceleration};
        return result;
    }

    // Fungsi untuk menghitung rata-rata top power menggunakan Brute Force
    public static double calculateAverageTopPower(Object[] mobilList) {
        double totalTopPower = 0;
        for (Object obj : mobilList) {
            totalTopPower += ((Mobil) obj).topPower;
        }
        int totalMobil = mobilList.length;
        double averageTopPower = totalTopPower / totalMobil;
        return averageTopPower;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan data mobil
        System.out.print("Masukkan jumlah mobil: ");
        int n = scanner.nextInt();
        Mobil[] mobilList = new Mobil[n];

        // Memasukkan data mobil dari input pengguna
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mobil ke-" + (i + 1) + ":");
            System.out.print("Merk: ");
            String merk = scanner.next();
            System.out.print("Tipe: ");
            String tipe = scanner.next();
            System.out.print("Tahun: ");
            int tahun = scanner.nextInt();
            System.out.print("Top Acceleration: ");
            int topAcceleration = scanner.nextInt();
            System.out.print("Top Power: ");
            int topPower = scanner.nextInt();
            mobilList[i] = new Mobil(merk, tipe, tahun, topAcceleration, topPower);
        }

        // Mencari top acceleration tertinggi dan terendah menggunakan Divide and Conquer
        int[] maxMinAcceleration = findMaxMinAcceleration(mobilList, 0, mobilList.length - 1);
        int maxAcceleration = maxMinAcceleration[0];
        int minAcceleration = maxMinAcceleration[1];

        // Menghitung rata-rata top power menggunakan Brute Force
        double averageTopPower = calculateAverageTopPower(mobilList);

        // Menampilkan hasil
        System.out.println("a) Top acceleration tertinggi: " + maxAcceleration);
        System.out.println("b) Top acceleration terendah: " + minAcceleration);
        System.out.println("c) Rata-rata top power: " + averageTopPower);

        scanner.close();
    }
}

class Mobil {
    String merk;
    String tipe;
    int tahun;
    int topAcceleration;
    int topPower;

    public Mobil(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }
}
