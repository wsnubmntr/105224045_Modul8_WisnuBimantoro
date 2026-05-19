public abstract class LayananPengiriman {

    // atribut protected
    protected String noResi;
    protected double beratBarang;
    protected double jarakTempuh;

    // constructor
    public LayananPengiriman(String noResi, double beratBarang, double jarakTempuh) {

        this.noResi = noResi;
        this.beratBarang = beratBarang;
        this.jarakTempuh = jarakTempuh;
    }

    // method concrete
    public void cetakResi() {

        System.out.println("Nomor Resi   : " + noResi);
        System.out.println("Berat Barang : " + beratBarang + " kg");
        System.out.println("Jarak Tempuh : " + jarakTempuh + " km");
    }

    // abstract method
    public abstract double hitungOngkosKirim();
}