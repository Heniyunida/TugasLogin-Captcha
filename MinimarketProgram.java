import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MinimarketProgram {

    public static void main(String[] args) {

    String username = "HeniYunida";
    String sandi =  "123Heni";

    Scanner input = new Scanner(System.in);

    System.out.println("Login ");
    System.out.println("Username :");
    String user = input.nextLine();
    System.out.println("Password :");
    String san = input.nextLine();


    if((user.equals(username)) && (san.equals(sandi) ))    
    {
        Scanner cp = new Scanner(System.in);
       String captcha="NjKiB";
       
       System.out.println("captcha");
       System.out.println("Kode   : NjKlB");
       System.out.println("Input  :");
       String ansCaptcha = cp.nextLine();

       if (ansCaptcha.equalsIgnoreCase(captcha))
       {

        Scanner scanner = new Scanner(System.in);
        
        try {
            // Input data
            System.out.print("No. Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("No. HP: ");
            String nomorHP = scanner.nextLine();

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            scanner.nextLine(); // Membersihkan newline

            System.out.print("Kasir: ");
            String kasir = scanner.nextLine();

            // Membuat objek Penjualan
            Penjualan penjualan = new Penjualan(noFaktur, namaPelanggan, nomorHP, alamat,
                    kodeBarang, namaBarang, hargaBarang, jumlahBeli, kasir);

            // Menampilkan hasil penjualan
            displayTransaction(penjualan);

            // Menutup scanner
            scanner.close();

            

        } catch (java.util.InputMismatchException e) {
            System.out.println("Input tidak valid. Pastikan memasukkan jenis data yang benar.");
        }
    }
    else 
            {
          System.out.println("salah");
            }
    

    




    }
    else 
            {
          System.out.println("Password atau Username salah");
            }
    }

    // Method untuk menampilkan transaksi
    private static void displayTransaction(Penjualan penjualan) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        System.out.println("HENIMART");
        System.out.println("Tanggal   : " + dateFormat.format(new Date(0)));
        System.out.println("Waktu     : " + timeFormat.format(new Date(0)));
        System.out.println("========================");
        System.out.println("DATA PELANGGAN");
        System.out.println("---------------------");
        System.out.println("Nama Pelanggan : " + penjualan.getNamaPelanggan());
        System.out.println("No. HP         : " + penjualan.getNomorHP());
        System.out.println("Alamat         : " + penjualan.getAlamat());
        System.out.println("++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------");
        System.out.println("Kode Barang    : " + penjualan.getKodeBarang());
        System.out.println("Nama Barang    : " + penjualan.getNamaBarang());
        System.out.println("Harga Barang   : " + String.format("%.2f", penjualan.getHarga()));
        System.out.println("Jumlah Beli    : " + penjualan.getJumlahBeli());
        System.out.println("TOTAL BAYAR    : " +
                String.format("%.2f", penjualan.hitungTotalBayar(penjualan.getHarga(), penjualan.getJumlahBeli())));
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir          : "+ penjualan.getKasir());
     
            
    }
    
}