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

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+1 + ". "+ menu[i]);
            int currPesanan = sc.nextInt();

            if(currPesanan >= 0 && currPesanan <= 10) {
                pesanan.add(currPesanan);
            } else {
                System.out.println("Batas pesanan 0-10!");
                i--;
            }
        }

        System.out.println("Selamat menikmati pesanan anda...");
        sc.nextLine();
        System.out.println();

        ArrayList<Double> total = new ArrayList<>();
        double grandTotal = 0;

        System.out.println("Pembelian:");

        for (int i = 0; i < menu.length; i++) {
            double currTotal = pesanan.get(i) * harga[i];
            total.add(currTotal);
            grandTotal += currTotal;

            System.out.println(i+1 + ". "+ menu[i] +"   " + pesanan.get(i) + " porsi * Rp " + harga[i] + "  = Rp " + total.get(i));
        }

        double discount = 0.10 * grandTotal;
        double netTotal = grandTotal - discount;
        double perOrang = netTotal / jmlPemesan;

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
