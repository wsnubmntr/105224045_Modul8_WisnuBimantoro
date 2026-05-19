package com.rpg.main;

import java.util.Scanner;

import com.rpg.entitas.Pahlawan;
import com.rpg.entitas.Monster;

public class GameEngine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input nama pahlawan
        System.out.print("Masukkan nama pahlawan: ");
        String namaHero = input.nextLine();

        // membuat object pahlawan
        Pahlawan hero = new Pahlawan(
                namaHero,
                150,
                20,
                100,
                2
        );

        // array monster
        Monster[] daftarMonster = {

                new Monster("Goblin", 50, 10, "Goblin"),
                new Monster("Orc", 80, 15, "Orc"),
                new Monster("Dragon", 120, 25, "Dragon")
        };

        // looping monster
        for (Monster monster : daftarMonster) {

            System.out.println();
            System.out.println("================================");
            System.out.println("Monster muncul: " + monster.getNama());

            // battle loop
            while (hero.getHp() > 0 &&
                    monster.getHp() > 0) {

                System.out.println();
                hero.tampilkanStatus();
                monster.tampilkanStatus();

                // menu
                System.out.println();
                System.out.println("1. Serang");
                System.out.println("2. Skill");
                System.out.println("3. Bertahan / Heal");
                System.out.print("Pilih aksi: ");

                int pilihan = input.nextInt();

                int damageHero = 0;

                switch (pilihan) {

                    // serang biasa
                    case 1:

                        damageHero = hero.serang();

                        System.out.println(hero.getNama()
                                + " menyerang!");

                        monster.terimaDamage(damageHero);

                        break;

                    // skill
                    case 2:

                        damageHero =
                                hero.serang("Fire Slash", 20);

                        monster.terimaDamage(damageHero);

                        break;

                    // bertahan dan heal
                    case 3:

                        hero.bertahan();
                        hero.gunakanItem();

                        break;

                    default:

                        System.out.println("Pilihan tidak valid!");
                }

                // monster menyerang balik
                if (monster.getHp() > 0) {

                    int damageMonster = monster.serang();

                    System.out.println(monster.getNama()
                            + " menyerang balik!");

                    hero.terimaDamage(damageMonster);
                }
            }

            // cek monster kalah
            if (monster.getHp() <= 0) {

                System.out.println(monster.getNama()
                        + " berhasil dikalahkan!");
            }

            // hero kalah
            if (hero.getHp() <= 0) {

                break;
            }
        }

        System.out.println();
        System.out.println("================================");

        // ending game
        if (hero.getHp() > 0) {

            System.out.println("Selamat! "
                    + hero.getNama()
                    + " berhasil menamatkan Dungeon!");
        }

        else {

            System.out.println("Game Over...");
        }

        input.close();
    }
}

/*
PENJELASAN KODE

Class GameEngine merupakan pusat jalannya program game.

Program dimulai dengan Scanner
untuk menerima input nama pahlawan dari user.

Setelah itu dibuat object Pahlawan
dengan HP, damage, mana, dan level tertentu.

Program juga membuat Array Monster
yang berisi 3 object monster berbeda.

Array digunakan agar game memiliki mode survival,
di mana hero harus melawan monster satu per satu.

Program menggunakan nested loop:
1. for loop
   digunakan untuk mengambil monster dari array satu per satu.

2. while loop
   digunakan sebagai battle loop.
   Loop berjalan selama:
   - HP hero masih lebih dari 0
   - HP monster masih lebih dari 0

Di dalam battle loop,
player diberikan menu menggunakan switch-case:
1. Serang biasa
2. Menggunakan skill
3. Bertahan / heal

Jika player memilih serang:
- method serang() dipanggil,
- damage dikirim ke monster melalui terimaDamage().

Jika memilih skill:
- method overloading serang() dipakai,
- mana akan dikurangi,
- damage lebih besar.

Jika memilih bertahan:
- hero masuk mode defend,
- lalu memulihkan HP menggunakan item.

Setelah player selesai menyerang,
monster akan menyerang balik jika masih hidup.

Program terus berjalan sampai:
- semua monster kalah,
atau
- HP hero habis.

Di akhir program digunakan if-else:
Jika hero masih hidup setelah mengalahkan semua monster,
maka tampil pesan berhasil menamatkan dungeon.

Jika HP hero habis,
maka tampil pesan Game Over.

Class ini menerapkan banyak konsep PBO:
- inheritance
- polymorphism
- encapsulation
- abstract class
- interface
- overriding
- overloading
- array object
- nested loop
- switch-case
- scanner input
*/