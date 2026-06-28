package bagian1.berkas;

import java.io.File;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        // Buat objek File yang menunjuk laporan.txt
        File fileLaporan = new File("laporan.txt");
        
        // Tampilkan apakah berkas tersebut ada
        boolean apakahAda = fileLaporan.exists();
        System.out.println("Apakah berkas ada? : " + apakahAda);
        
        // Jika ada, tampilkan ukurannya dalam byte
        if (apakahAda) {
            System.out.println("Ukuran berkas (byte): " + fileLaporan.length());
        }
    }
}