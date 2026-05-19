public class Main {

    public static void main(String[] args) {

        // object pengiriman darat
        PengirimanDarat darat = new PengirimanDarat(
                "DRT-001",
                50,
                100,
                "Tronton"
        );

        // object pengiriman udara
        PengirimanUdara udara = new PengirimanUdara(
                "UDR-999",
                10,
                800,
                "GA-123",
                5000000
        );

        // update status
        darat.updateStatus("Sedang di jalan tol Cipali");
        udara.updateStatus("Transit di Bandara Soekarno-Hatta");

        // array polymorphism
        LayananPengiriman[] daftarPengiriman = {darat, udara};

        // looping
        for (LayananPengiriman lp : daftarPengiriman) {

            System.out.println("======================================");

            // cetak resi
            lp.cetakResi();

            // cek lokasi menggunakan casting polymorphism
            if (lp instanceof LacakKargo) {

                LacakKargo lk = (LacakKargo) lp;

                System.out.println("Status Lokasi : "
                        + lk.cekLokasiTerakhir());
            }

            // hitung ongkir dasar
            double totalTagihan = lp.hitungOngkosKirim();

            System.out.println("Ongkos Kirim  : Rp" + totalTagihan);

            // cek apakah memiliki asuransi
            if (lp instanceof Asuransi) {

                Asuransi as = (Asuransi) lp;

                // cetak polis
                as.cetakPolis();

                // khusus PengirimanUdara
                PengirimanUdara pu = (PengirimanUdara) lp;

                // hitung premi
                double premi = as.hitungPremi(pu.getNilaiBarang());

                System.out.println("Premi Asuransi: Rp" + premi);

                // total akhir
                totalTagihan += premi;
            }

            System.out.println("Total Tagihan : Rp" + totalTagihan);

            System.out.println("======================================");
            System.out.println();
        }
    }
}