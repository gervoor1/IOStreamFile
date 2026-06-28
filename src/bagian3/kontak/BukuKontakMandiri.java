package bagian3.kontak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BukuKontakMandiri {
    // ArrayList menggunakan tipe objek KontakMandiri
    private ArrayList<KontakMandiri> daftar = new ArrayList<>();
    private String namaBerkas;

    public BukuKontakMandiri(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahKontak(KontakMandiri kontak) {
        daftar.add(kontak);
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Kontak ==");
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " + daftar.get(i).info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (KontakMandiri k : daftar) {
                penulis.println(k.keBaris());
            }
            System.out.println("Kontak berhasil disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    public void muatDariBerkas() {
        daftar.clear();
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length == 3) {
                    daftar.add(new KontakMandiri(bagian[0], bagian[1], bagian[2]));
                }
            }
            System.out.println("Kontak berhasil dimuat dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat berkas atau berkas belum ada.");
        }
    }

    public int jumlahKontak() {
        return daftar.size();
    }

    // SOAL 1: Mencari kontak berdasarkan nama
    public void cariKontak(String nama) {
        boolean ditemukan = false;
        for (KontakMandiri k : daftar) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Kontak Ditemukan -> " + k.info());
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Pesan: Kontak dengan nama '" + nama + "' tidak ditemukan.");
        }
    }

    // SOAL 3: Menghapus kontak berdasarkan nama & autosave
    public void hapusKontak(String nama) {
        boolean berhasilHapus = false;
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).getNama().equalsIgnoreCase(nama)) {
                daftar.remove(i);
                System.out.println("Kontak '" + nama + "' berhasil dihapus dari daftar.");
                berhasilHapus = true;
                break;
            }
        }
        
        if (berhasilHapus) {
            simpanKeBerkas(); 
        } else {
            System.out.println("Gagal menghapus: Kontak '" + nama + "' tidak ditemukan.");
        }
    }
}