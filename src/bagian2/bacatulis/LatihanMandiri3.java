package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        String namaBerkas = "hari.txt";
        int jumlahBaris = 0;

        // Membaca berkas dan menghitung baris
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            
            // Menampilkan hasil perhitungan ke layar
            System.out.println("Berkas '" + namaBerkas + "' berhasil dibaca.");
            System.out.println("Jumlah baris yang ada di dalamnya: " + jumlahBaris + " baris.");
            
        } catch (IOException e) {
            System.out.println("Gagal membaca atau memproses berkas: " + e.getMessage());
        }
    }
}