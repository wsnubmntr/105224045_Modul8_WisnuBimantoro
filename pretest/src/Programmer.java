// class Programmer mewarisi Karyawan
public class Programmer extends Karyawan {

    // atribut private
    private double gajiPokok;

    // constructor
    public Programmer(String nama, double gajiPokok) {

        // memanggil constructor parent
        super(nama);

        this.gajiPokok = gajiPokok;
    }

    // implementasi abstract method
    @Override
    public double hitungGaji() {
        return gajiPokok;
    }
}