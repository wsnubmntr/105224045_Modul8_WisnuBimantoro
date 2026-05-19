public class EWallet extends Pembayaran implements Keamanan {

    // atribut private
    private String nomorHP;

    // constructor
    public EWallet(String namaPembayar, double nominal, String nomorHP) {

        // memanggil constructor parent
        super(namaPembayar, nominal);

        this.nomorHP = nomorHP;
    }

    // implementasi autentikasi
    @Override
    public boolean autentikasi() {

        System.out.println("Autentikasi E-Wallet berhasil!");

        return true;
    }

    // implementasi proses pembayaran
    @Override
    public void prosesPembayaran() {

        // e-wallet tidak ada biaya admin
        System.out.println("Biaya Admin   : Rp0");
        System.out.println("Total Tagihan : Rp" + nominal);
    }
}