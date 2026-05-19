package com.rpg.entitas;

import com.rpg.arena.Karakter;

// class monster
public class Monster extends Karakter {

    // atribut tambahan
    private String jenisMonster;

    // constructor
    public Monster(String nama,
                   int hp,
                   int baseDamage,
                   String jenisMonster) {

        super(nama, hp, baseDamage);

        this.jenisMonster = jenisMonster;
    }

    // override serang
    @Override
    public int serang() {

        return baseDamage;
    }

    // override bertahan
    @Override
    public void bertahan() {

        hp += 10;

        System.out.println(nama + " memulihkan HP sebesar 10!");
    }

    // override gunakan item
    @Override
    public void gunakanItem() {

        System.out.println(nama + " tidak memiliki item.");
    }

    // override tampil status
    @Override
    public void tampilkanStatus() {

        System.out.println("===== STATUS MONSTER =====");
        System.out.println("Nama   : " + nama);
        System.out.println("Jenis  : " + jenisMonster);
        System.out.println("HP     : " + hp);
    }
}

/*
PENJELASAN KODE

Class Monster merupakan turunan dari class Karakter.

Class ini digunakan untuk membuat musuh di dalam game.

Monster memiliki atribut tambahan:
jenisMonster

Atribut ini digunakan untuk menyimpan tipe monster,
misalnya Goblin, Orc, atau Dragon.

Constructor digunakan untuk mengisi:
- nama monster
- hp
- base damage
- jenis monster

Method serang() dioverride dari class Karakter.
Damage monster hanya menggunakan nilai baseDamage biasa.

Method bertahan() pada monster berbeda dengan pahlawan.
Saat monster bertahan,
monster akan memulihkan HP sebesar 10.

Method gunakanItem() tetap dioverride
walaupun monster tidak memiliki item.

Method tampilkanStatus() digunakan untuk menampilkan:
- nama monster
- jenis monster
- hp monster

Class ini termasuk contoh penerapan inheritance
dan method overriding pada Java.
*/