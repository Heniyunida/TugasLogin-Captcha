// Kelas Penjualan sebagai child class yang mengimplementasikan interface HitungTotal
class Penjualan extends Barang implements HitungTotal {
    private String noFaktur;
    private String namaPelanggan;
    private String nomorHP;
    private String alamat;
    private String kodeBarang;
    private int jumlahBeli;
    private String Kasir;

    public Penjualan(String noFaktur, String namaPelanggan, String nomorHP, String alamat,
            String kodeBarang, String namaBarang, double harga, int jumlahBeli, String Kasir) {
        super(namaBarang, harga);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
        this.kodeBarang = kodeBarang;
        this.jumlahBeli = jumlahBeli;
        this.Kasir = Kasir;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public String getKasir(){
        return Kasir;
    }

    // Implementasi dari interface HitungTotal
    @Override
    public double hitungTotalBayar(final double harga, final int jumlah) {
        return harga * jumlah;
    }

    public void setCashier(String kasir2) {
    }

    public String getCashier() {
        return null;
    }
}