package com.example.tugasleaf;

public class Pot {
    String Key;
    String Nama;
    String Keterangan;
    String Harga;

    public Pot() {

    }

    public Pot(String key, String nama, String keterangan, String harga) {
        Key = key;
        Nama = nama;
        Keterangan = keterangan;
        Harga = harga;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getKey() {
        return Key;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String keterangan) {
        Keterangan = keterangan;
    }



}
