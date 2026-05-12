public class Main {

    public static void main(String[] args) {

        // membuat object Programmer
        Programmer p1 = new Programmer("Lukman", 8500000);

        // menampilkan data
        System.out.println("Nama Programmer : " + p1.nama);
        System.out.println("Total Gaji      : Rp" + p1.hitungGaji());
    }
}