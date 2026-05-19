import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // membuat ArrayList bertipe Pembayaran
        ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();

        // membuat object kartu kredit
        Pembayaran kartu1 = new KartuKredit(
                "Budi",
                500000,
                "123456789"
        );

        // membuat object e-wallet
        Pembayaran wallet1 = new EWallet(
                "Sinta",
                250000,
                "08123456789"
        );

        // memasukkan object ke ArrayList
        daftarPembayaran.add(kartu1);
        daftarPembayaran.add(wallet1);

        // looping untuk membaca semua data
        for (Pembayaran pembayaran : daftarPembayaran) {

            System.out.println("================================");

            // menampilkan detail transaksi
            pembayaran.tampilkanDetail();

            // mengecek apakah object mengimplementasikan interface Keamanan
            if (pembayaran instanceof Keamanan) {

                // downcasting ke interface
                Keamanan aman = (Keamanan) pembayaran;

                // memanggil autentikasi
                if (aman.autentikasi()) {

                    // jika autentikasi berhasil
                    pembayaran.prosesPembayaran();
                }
            }

            System.out.println();
        }
    }
}