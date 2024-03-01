package Praktikum1;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.println("Masukkan jumlah Persegi Panjang : ");
        int jumlah = sc01.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[jumlah];

        for (int i = 0; i < jumlah; i++)

        {
            ppArray[i] = new PersegiPanjang(i, i);
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan panjang : ");
            ppArray[i].panjang = sc01.nextInt();
            System.out.println("Masukkan lebar : ");
            ppArray[i].lebar = sc01.nextInt();
        }

        for (int i = 0; i < jumlah; i++)

        {
            System.out.println("Persgi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}

