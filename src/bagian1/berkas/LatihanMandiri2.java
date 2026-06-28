package bagian1.berkas;

import java.io.File;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        // Buat objek File untuk folder bernama arsip
        File folderArsip = new File("arsip");
        
        // Buat folder dan simpan nilai kembaliannya (true/false)
        boolean berhasil = folderArsip.mkdir();
        
        // Tampilkan pesan berdasarkan nilai kembalian
        if (berhasil) {
            System.out.println("Pesan: Folder 'arsip' BERHASIL dibuat.");
        } else {
            System.out.println("Pesan: Folder 'arsip' GAGAL dibuat (mungkin folder sudah ada).");
        }
    }
}