public abstract class Pembayaran {

    // atribut protected
    protected String namaPembayar;
    protected double nominal;

    // constructor
    public Pembayaran(String namaPembayar, double nominal) {
        this.namaPembayar = namaPembayar;
        this.nominal = nominal;
    }

    // concrete method
    public void tampilkanDetail() {
        System.out.println("Nama Pembayar : " + namaPembayar);
        System.out.println("Nominal       : Rp" + nominal);
    }

    // abstract method
    public abstract void prosesPembayaran();
}