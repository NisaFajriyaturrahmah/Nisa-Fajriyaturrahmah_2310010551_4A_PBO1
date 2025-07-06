package uas;

import java.util.Scanner;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array
        PegawaiTetap[] daftarPegawai = new PegawaiTetap[2];
        int index = 0;

        System.out.println("=== Input Data Pegawai Tetap ===");

        // Perulangan
        while (index < daftarPegawai.length) {
            try {
                System.out.print("Masukkan Nama: ");
                String nama = input.nextLine();

                System.out.print("Masukkan ID Pegawai: ");
                String id = input.nextLine();

                System.out.print("Masukkan Jabatan: ");
                String jabatan = input.nextLine();

                System.out.print("Masukkan Gaji Bulanan: ");
                int gaji = Integer.parseInt(input.nextLine());

                daftarPegawai[index] = new PegawaiTetap(nama, id, jabatan, gaji);
                System.out.println(">> Data berhasil ditambahkan!\n");
                index++;
            } catch (NumberFormatException e) {
                System.out.println(">> Input angka tidak valid. Silakan ulangi.\n");
            }
        }

        System.out.println("\n=== Daftar Pegawai Tetap ===");
        for (PegawaiTetap pegawai : daftarPegawai) {
            pegawai.tampilkanInfo();
            // Seleksi
            if (pegawai.getGajiBulanan() >= 10000000) {
                System.out.println(">> Status: Pegawai senior");
            }
            System.out.println();
        }

        input.close();
    }
}
