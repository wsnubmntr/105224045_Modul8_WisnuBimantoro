public class KartuKredit extends Pembayaran implements Keamanan {

    // atribut private
    private String nomorKartu;

    // constructor
    public KartuKredit(String namaPembayar, double nominal, String nomorKartu) {

        // memanggil constructor parent
        super(namaPembayar, nominal);

        this.nomorKartu = nomorKartu;
    }

    // implementasi autentikasi
    @Override
    public boolean autentikasi() {

        System.out.println("Autentikasi PIN Kartu Kredit berhasil!");

        return true;
    }

    // implementasi proses pembayaran
    @Override
    public void prosesPembayaran() {

        // menghitung biaya admin 2%
        double admin = nominal * 0.02;

        // total pembayaran
        double total = nominal + admin;

        System.out.println("Biaya Admin   : Rp" + admin);
        System.out.println("Total Tagihan : Rp" + total);
    }
}