package com.rpg.arena;

// abstract class
public abstract class Karakter implements AksiBertarung {

    // atribut protected
    protected String nama;
    protected int hp;
    protected int baseDamage;
    protected boolean isDefending;

    // constructor
    public Karakter(String nama, int hp, int baseDamage) {

        this.nama = nama;
        this.hp = hp;
        this.baseDamage = baseDamage;

        // default false
        this.isDefending = false;
    }

    // getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public boolean isDefending() {
        return isDefending;
    }

    public void setDefending(boolean defending) {
        isDefending = defending;
    }

    // menerima damage
    public void terimaDamage(int damage) {

        // jika sedang bertahan
        if (isDefending) {

            damage = damage / 2;

            System.out.println(nama + " berhasil menahan sebagian damage!");

            // reset defend
            isDefending = false;
        }

        hp -= damage;

        // hp minimal 0
        if (hp < 0) {
            hp = 0;
        }

        System.out.println(nama + " menerima damage sebesar " + damage);
    }

    // abstract method
    public abstract void tampilkanStatus();
}

/*
PENJELASAN KODE

Class Karakter merupakan abstract class yang menjadi
parent class untuk Pahlawan dan Monster.

Class ini juga mengimplementasikan interface AksiBertarung.

Atribut pada class ini menggunakan access modifier protected
agar dapat digunakan langsung oleh subclass.

Atribut yang dimiliki:
1. nama
   menyimpan nama karakter.

2. hp
   menyimpan jumlah health point karakter.

3. baseDamage
   menyimpan damage dasar karakter.

4. isDefending
   digunakan untuk mengecek apakah karakter sedang bertahan.

Constructor digunakan untuk mengisi data awal karakter.

Class ini memiliki getter dan setter
untuk menerapkan encapsulation.

Method terimaDamage() digunakan untuk mengurangi HP karakter.

Jika karakter sedang dalam mode defend:
- damage hanya diterima setengahnya.
- status defend akan kembali menjadi false.

Jika HP kurang dari 0,
maka HP akan diatur menjadi 0 agar tidak minus.

Method tampilkanStatus() dibuat abstract
karena setiap subclass memiliki tampilan status berbeda.

Karena class ini abstract,
object tidak bisa dibuat langsung dari class Karakter.
*/