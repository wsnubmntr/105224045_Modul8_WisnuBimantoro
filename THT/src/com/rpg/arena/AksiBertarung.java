package com.rpg.arena;

// interface aksi bertarung
public interface AksiBertarung {

    // method serang
    int serang();

    // method bertahan
    void bertahan();

    // method gunakan item
    void gunakanItem();
}

/*
PENJELASAN KODE

Interface AksiBertarung digunakan sebagai aturan dasar
untuk semua karakter yang bisa bertarung di dalam game.

Di dalam interface ini terdapat 3 method:
1. serang()
   digunakan untuk menyerang lawan dan menghasilkan damage.

2. bertahan()
   digunakan saat karakter memilih mode bertahan.

3. gunakanItem()
   digunakan untuk memakai item seperti potion atau heal.

Karena ini adalah interface,
maka method di dalamnya tidak memiliki isi/body.

Class yang mengimplementasikan interface ini wajib
mengisi semua method tersebut.

Pada program ini, class Karakter mengimplementasikan
interface AksiBertarung sehingga semua turunannya
seperti Pahlawan dan Monster harus memiliki fitur bertarung.
*/