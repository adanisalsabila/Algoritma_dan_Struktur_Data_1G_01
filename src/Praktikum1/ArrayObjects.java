package Praktikum1;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for (int i = 0; i < 3; i++)

        {
            ppArray[i] = new PersegiPanjang(i, i);
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan panjang : ");
            ppArray[i].panjang = sc01.nextInt();
            System.out.println("Masukkan lebar : ");
            ppArray[i].lebar = sc01.nextInt();
        }

        for (int i = 0; i < 3; i++)

        {
            System.out.println("Persgi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}

