package bagian3.kontak;

public class KontakMandiri {
    // Atribut yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email;

    // Constructor
    public KontakMandiri(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() {
        return email;
    }

    // Mengubah objek menjadi satu baris teks dengan pemisah ";"
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak lengkap untuk ditampilkan
    public String info() {
        return nama + " - " + nomor + " (" + email + ")";
    }
}