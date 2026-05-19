package com.rpg.entitas;

import com.rpg.arena.Karakter;

// class Pahlawan
public class Pahlawan extends Karakter {

    // atribut private
    private int mana;
    private int level;

    // constructor
    public Pahlawan(String nama,
                     int hp,
                     int baseDamage,
                     int mana,
                     int level) {

        super(nama, hp, baseDamage);

        this.mana = mana;
        this.level = level;
    }

    // getter setter
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // override serang
    @Override
    public int serang() {

        return baseDamage * level;
    }

    // overloading serang skill
    public int serang(String namaSkill, int manaCost) {

        // cek mana cukup
        if (mana >= manaCost) {

            mana -= manaCost;

            System.out.println(nama +
                    " menggunakan skill " + namaSkill);

            return baseDamage * level * 2;
        }

        else {

            System.out.println("Mana tidak cukup!");

            return 0;
        }
    }

    // override bertahan
    @Override
    public void bertahan() {

        isDefending = true;

        System.out.println(nama + " bersiaga dan bertahan!");
    }

    // gunakan item heal
    @Override
    public void gunakanItem() {

        hp += 30;

        System.out.println(nama + " menggunakan potion dan memulihkan HP!");
    }

    // tampil status
    @Override
    public void tampilkanStatus() {

        System.out.println("===== STATUS PAHLAWAN =====");
        System.out.println("Nama  : " + nama);
        System.out.println("HP    : " + hp);
        System.out.println("Mana  : " + mana);
        System.out.println("Level : " + level);
    }
}

/*
PENJELASAN KODE

Class Pahlawan merupakan turunan dari class Karakter.
Karena mewarisi Karakter, maka Pahlawan otomatis memiliki atribut:
nama, hp, baseDamage, dan isDefending.

Pada class ini ditambahkan atribut baru yaitu:
1. mana
   digunakan untuk memakai skill.

2. level
   digunakan untuk memperbesar damage serangan.

Constructor digunakan untuk mengisi data awal object
saat object Pahlawan dibuat.

Method serang() dioverride dari class Karakter.
Damage yang dihasilkan adalah:
baseDamage * level

Class ini juga menerapkan method overloading pada serang().
Versi kedua memiliki parameter:
- nama skill
- mana cost

Jika mana cukup:
- mana akan dikurangi,
- lalu hero menghasilkan damage lebih besar.

Jika mana tidak cukup:
- program menampilkan pesan gagal,
- damage menjadi 0.

Method bertahan() digunakan untuk mengaktifkan mode defend.
Saat defend aktif, damage yang diterima akan menjadi setengah
di method terimaDamage() milik class Karakter.

Method gunakanItem() digunakan untuk memulihkan HP hero.

Method tampilkanStatus() digunakan untuk menampilkan
status lengkap hero seperti HP, Mana, dan Level.
*/