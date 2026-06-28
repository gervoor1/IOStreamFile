package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        String namaBerkas = "hari.txt";

        // 1. Menambahkan (append) 2 nama hari lagi
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas, true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("2 nama hari berhasil ditambahkan ke " + namaBerkas + "\n");
        } catch (IOException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }

        // 2. Menampilkan seluruh isinya
        System.out.println("--- Seluruh Isi Berkas Setelah Ditambah ---");
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca berkas: " + e.getMessage());
        }
    }
}