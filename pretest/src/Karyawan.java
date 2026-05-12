// abstract class
public abstract class Karyawan {

    // atribut nama menggunakan protected
    protected String nama;

    // constructor
    public Karyawan(String nama) {
        this.nama = nama;
    }

    // abstract method
    public abstract double hitungGaji();
}