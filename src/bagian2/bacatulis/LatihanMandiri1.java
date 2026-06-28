package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        String namaBerkas = "hari.txt";

        // 1. Menulis 5 nama hari ke berkas (satu nama per baris)
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
            System.out.println("5 nama hari berhasil ditulis ke " + namaBerkas + "\n");
        } catch (IOException e) {
            System.out.println("Gagal menulis berkas: " + e.getMessage());
        }

        // 2. Membaca kembali dan menampilkan ke layar
        System.out.println("--- Isi Berkas hari.txt ---");
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