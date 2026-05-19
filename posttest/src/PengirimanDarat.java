public class PengirimanDarat extends LayananPengiriman implements LacakKargo {

    // atribut tambahan
    private String jenisTruk;
    private String statusSaatIni;

    // constructor
    public PengirimanDarat(String noResi,
                           double beratBarang,
                           double jarakTempuh,
                           String jenisTruk) {

        // constructor parent
        super(noResi, beratBarang, jarakTempuh);

        this.jenisTruk = jenisTruk;

        // status awal
        this.statusSaatIni = "Menunggu Kurir";
    }

    // menghitung ongkos kirim
    @Override
    public double hitungOngkosKirim() {

        double total = (beratBarang * 5000) + (jarakTempuh * 2000);

        // biaya tambahan tronton
        if (jenisTruk.equalsIgnoreCase("Tronton")) {
            total += 150000;
        }

        return total;
    }

    // update status
    @Override
    public void updateStatus(String status) {
        statusSaatIni = status;
    }

    // melihat status terakhir
    @Override
    public String cekLokasiTerakhir() {
        return statusSaatIni;
    }
}