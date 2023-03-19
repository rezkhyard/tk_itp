package org.hartomoro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in); // untuk penjumlahan menu agar maximal 10
        System.out.println("Selamat Datang di Restoran Bugar Universitas BNAS");
        System.out.println("----------------------------");

        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = input.nextLine();
        // Input jumlah orang dan nama pemesan
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();
        System.out.println("--------------------------------------------------------");

        // Tampilkan menu makanan
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng Spesial (Rp. 9999.99)");
        System.out.println("2. Ayam Bakar Spesial (Rp. 12345.67)");
        System.out.println("3. Steak Sirloin Spesial (Rp. 21108.40)");
        System.out.println("4. Kwetiaw Siram Spesial (Rp. 13579.13)");
        System.out.println("5. Kambing Guling Spesial (Rp. 98765.43)");

        // Input jumlah pesanan masing-masing menu
        System.out.print("Masukkan jumlah pesanan Nasi Goreng Spesial: ");
        int nasiGoreng = input.nextInt();
        System.out.print("Masukkan jumlah pesanan Ayam Bakar Spesial: ");
        int ayamBakar = input.nextInt();
        System.out.print("Masukkan jumlah pesanan Steak Sirloin Spesial: ");
        int steakSirloin = input.nextInt();
        System.out.print("Masukkan jumlah pesanan Kwetiaw Siram Spesial: ");
        int kwetiawSiram = input.nextInt();
        System.out.print("Masukkan jumlah pesanan Kambing Guling Spesial: ");
        int kambingGuling = input.nextInt();

        int total = nasiGoreng + ayamBakar + steakSirloin + kwetiawSiram + kambingGuling;

        System.out.print("total pesanan: " + total);

        System.out.println("\n");

        if (total < 10) {
            System.out.println("total pesanan : " + total);
        } else {
            System.out.println("anda telah mencapai pesanan maksimal");
            System.exit(0);
        }


        DecimalFormat df = new DecimalFormat("#.##");

        // Hitung harga pembelian dari masing-masing menu
        double hargaNasiGoreng = nasiGoreng * 9999.99;
        double hargaAyamBakar = ayamBakar * 12345.67;
        double hargaSteakSirloin = steakSirloin * 21108.40;
        double hargaKwetiawSiram = kwetiawSiram * 13579.13;
        double hargaKambingGuling = kambingGuling * 98765.43;

        //buat kemaksimal 2 untuk masing-masing pesanan
        String formatted1 = df.format(hargaNasiGoreng);
        String formatted2 = df.format(hargaAyamBakar);
        String formatted3 = df.format(hargaSteakSirloin);
        String formatted4 = df.format(hargaKwetiawSiram);
        String formatted5 = df.format(hargaKambingGuling);


        // Hitung total pembelian
        double totalPembelian = hargaNasiGoreng + hargaAyamBakar + hargaSteakSirloin
                + hargaKwetiawSiram + hargaKambingGuling;


        // Hitung harga diskon
        double hargaDiskon = totalPembelian / 10;


        // Hitung total pembelian setelah diskon
        double totalPembelianSetelahDiskon = totalPembelian - hargaDiskon;


        // Hitung pembelian per orang
        double pembelianPerOrang = totalPembelianSetelahDiskon / jumlahOrang;


        String formatted6 = df.format(totalPembelian);
        String formatted7 = df.format(hargaDiskon);
        String formatted8 = df.format(totalPembelianSetelahDiskon);
        String formatted9 = df.format(pembelianPerOrang);

        // Tampilkan hasil
        System.out.println("----------------------------");
        System.out.println("Restoran BUGAR");
        System.out.println("Nama Pemesan : " + namaPemesan);
        System.out.println("----------------------------");
        System.out.println("Pembelian :");
        System.out.println("1. Nasi Goreng Spesial        : " + nasiGoreng + " * Rp. 9999.99 = "+ hargaNasiGoreng);
        System.out.println("2. Ayam Bakar Spesial         : " + ayamBakar +  " * Rp. 12345.67 = "+ hargaAyamBakar);
        System.out.println("3. Steak Sirloin Spesial      : " + steakSirloin +  " * Rp. 21108.40 = "+ hargaSteakSirloin);
        System.out.println("4. Kwetiaw Siram Spesial      : " + kwetiawSiram +  " * Rp. 13579.13 = "+ hargaKwetiawSiram);
        System.out.println("5. Kambing Guling Spesial     : " + kambingGuling +  " * Rp. 13579.13 = "+ hargaKambingGuling);
        System.out.println("----------------------------");
        System.out.printf("Total Pembelian : %.2f", totalPembelian);
        System.out.println("\n");
        System.out.printf("Dics 10 persen (Masa Promosi) : %.2f", hargaDiskon);
        System.out.println("\n");
        System.out.println("----------------------------");
        System.out.printf("Total Pembelian setelah Diskon 10 persen : RP. : %.2f", totalPembelianSetelahDiskon);
        System.out.println("\n");
        System.out.println("----------------------------");
        System.out.printf("Total Harga Perorang : : RP.  %.2f", pembelianPerOrang);
        System.out.println("\n");
        System.out.println("                 Terima Kasih atas kunjungan anda");
        System.out.println("                  ...Tekan Enter untuk Keluar...");

    }
}
