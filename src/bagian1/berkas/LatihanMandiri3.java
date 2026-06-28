package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        // Buat objek File sementara.txt
        File fileSementara = new File("sementara.txt");
        
        try {
            // Buat berkasnya
            if (fileSementara.createNewFile()) {
                System.out.println("Berkas 'sementara.txt' berhasil dibuat.");
            }
            
            // Tampilkan status keberadaan sebelum dihapus
            System.out.println("Status sebelum dihapus: " + fileSementara.exists());
            
            // Hapus kembali dengan method delete()
            if (fileSementara.delete()) {
                System.out.println("Berkas 'sementara.txt' berhasil dihapus.");
            }
            
            // Tampilkan status keberadaan sesudah dihapus
            System.out.println("Status sesudah dihapus: " + fileSementara.exists());
            
        } catch (IOException e) {
            // Menangani error jika proses pembuatan berkas gagal
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}