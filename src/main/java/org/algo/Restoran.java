package org.algo;

import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng Spesial", "Ayam Bakar Spesial", "Steak Sirloin Spesial", "Kwetiaw Siram Spesial", "Kambing Guling Spesial"};
        Double[] harga = {9999.99, 12345.67, 21108.40, 13579.13, 98765.43};
        ArrayList<Integer> pesanan = new ArrayList<>();

        System.out.println("Selamat siang...");

        System.out.println("Pesan untuk berapa orang: ");
        int jmlPemesan = sc.nextInt();

        System.out.println("Pesan atas nama: ");
        String name = sc.nextLine();

        sc.nextLine();
        System.out.println();

        System.out.println("Menu spesial hari ini");
        System.out.println("=======================");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+1 + ". "+ menu[i] +"   @ Rp " + harga[i]);
        }

        sc.nextLine();

        System.out.println("Pesanan anda (batas pesanan 0-10)");

        System.out.println("1. "+ menu[0]);
        pesanan.add(sc.nextInt());

        System.out.println("2. "+ menu[1]);
        pesanan.add(sc.nextInt());

        System.out.println("3. "+ menu[2]);
        pesanan.add(sc.nextInt());

        System.out.println("4. "+ menu[3]);
        pesanan.add(sc.nextInt());

        System.out.println("5. "+ menu[4]);
        pesanan.add(sc.nextInt());

        System.out.println("Selamat menikmati pesanan anda...");
        sc.nextLine();
        System.out.println();

        Double[] total = {pesanan.get(0) * harga[0], pesanan.get(1) * harga[1], pesanan.get(2) * harga[2], pesanan.get(3) * harga[3], pesanan.get(4) * harga[4]};
        double grandTotal = total[0] + total[1] + total[2] + total[3] + total[4];
        double discount = 0.10 * grandTotal;
        double netTotal = grandTotal - discount;
        double perOrang = netTotal / jmlPemesan;

        System.out.println("Pembelian:");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+1 + ". "+ menu[i] +"   " + pesanan.get(i) + " porsi * Rp " + harga[i] + "  = Rp " + total[i]);
        }

        System.out.println("=========================================================================");
        System.out.println("Total pembelian                                         = Rp " + grandTotal);
        System.out.println("Disc. 10% (masa promosi)                                = Rp " + discount);
        System.out.println("=========================================================================");
        System.out.println("Total pembelian setelah disc 10%                        = Rp " + netTotal);
        System.out.println("Pembelian per orang (untuk " + jmlPemesan + " orang)                    = Rp " + perOrang);

        System.out.println();

        System.out.println("Terima kasih atas kunjungan anda....:");
        System.out.println(".... tekan ENTER untuk keluar......");
        sc.nextLine();

    }
}
