package bagian3.kontak;

public class MainKontakMandiri {
    public static void main(String[] args) {
        // Inisialisasi pengelola buku kontak
        BukuKontakMandiri buku = new BukuKontakMandiri("kontak_baru.txt");

        System.out.println("--- 1. Menambah Kontak Baru (3 Data) ---");
        buku.tambahKontak(new KontakMandiri("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new KontakMandiri("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new KontakMandiri("Citra", "0833333", "citra@email.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        System.out.println("--- 2. Menguji Fitur Cari Kontak (Soal 1) ---");
        buku.cariKontak("Budi");  
        buku.cariKontak("Zack");  
        System.out.println();

        System.out.println("--- 3. Menguji Fitur Hapus Kontak (Soal 3) ---");
        buku.hapusKontak("Andi"); 
        System.out.println();

        System.out.println("--- 4. Memuat Ulang dari Berkas untuk Pembuktian ---");
        BukuKontakMandiri bukuUji = new BukuKontakMandiri("kontak_baru.txt");
        bukuUji.muatDariBerkas();
        bukuUji.tampilkanSemua();
        System.out.println("Total kontak saat ini: " + bukuUji.jumlahKontak());
    }
}