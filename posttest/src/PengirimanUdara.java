public class PengirimanUdara extends LayananPengiriman
        implements LacakKargo, Asuransi {

    // atribut tambahan
    private String nomorPenerbangan;
    private String statusSaatIni;
    private double nilaiBarang;

    // constructor
    public PengirimanUdara(String noResi,
                           double beratBarang,
                           double jarakTempuh,
                           String nomorPenerbangan,
                           double nilaiBarang) {

        // constructor parent
        super(noResi, beratBarang, jarakTempuh);

        this.nomorPenerbangan = nomorPenerbangan;
        this.nilaiBarang = nilaiBarang;

        // status awal
        this.statusSaatIni = "Menunggu Jadwal Penerbangan";
    }

    // menghitung ongkos kirim
    @Override
    public double hitungOngkosKirim() {

        return (beratBarang * 25000) + (jarakTempuh * 5000);
    }

    // menghitung premi asuransi
    @Override
    public double hitungPremi(double nilaiBarang) {

        return nilaiBarang * 0.03;
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

    // getter nilai barang
    public double getNilaiBarang() {
        return nilaiBarang;
    }
}