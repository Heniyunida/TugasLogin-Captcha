// Kelas Barang sebagai parent class
class Barang {
    private String namaBarang;
    private double harga;

    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHarga() {
        return harga;
    }
}