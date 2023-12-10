// MethodOverriding
// Main Tidak Boleh di jadikan 
// Modifier public akan membuat member dan class bisa di akses dari mana saja.
// Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
// Modifier protected akan membuat member dan class hanya bisa diakses dari
// lass itu sendiri
// Sub class atau class anak
// Package (class yang berada satu package dengannya).

public class Main {
    public static void main(String[] args){

// Membuat objek berikut dengan nilai property nya

    BangunDatar bangundatar = new BangunDatar();

    Persegi persegi = new Persegi();
    persegi.sisi = 2 ;

    Lingkaran lingkaran = new Lingkaran();
    lingkaran.r = 22;

    Segitiga segitiga = new Segitiga();
    segitiga.alas = 12;
    segitiga.tinggi = 8;

    Employee doni = new Employee();

// Memanggil method luas dan keliling

    System.out.println("----------------------------------------------");

    bangundatar.luas();
    bangundatar.keliling();

    System.out.println("----------------------------------------------");

    persegi.luas();
    persegi.keliling();

    System.out.println("----------------------------------------------");
    
    lingkaran.luas();
    lingkaran.keliling();

    System.out.println("----------------------------------------------");

    segitiga.luas();

    System.out.println("----------------------------------------------");

    doni.showInfo();

    System.out.println("----------------------------------------------");


    }
}