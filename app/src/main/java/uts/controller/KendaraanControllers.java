package uts.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import uts.models.BahanBakar;
import uts.models.Helikopter;
import uts.models.Kendaraan;
import uts.models.Mobil;
import uts.models.Pesawat;
import uts.models.Truk;

public class KendaraanControllers {
    private List<Kendaraan> listKendaraan = new ArrayList<>();

    public KendaraanControllers() {
        this.listKendaraan = new ArrayList<>();
    }

    public List<Kendaraan> getListKendaraan() {
        return this.listKendaraan;
    }


    // Mobil
    public void addKendaraan(String nama, String bahanBakar, int kapasitasOrang) {
        BahanBakar bahanBakars = BahanBakar.valueOf(bahanBakar.toUpperCase());
        Mobil mobil = new Mobil(bahanBakars, kapasitasOrang, nama, 4);
        this.listKendaraan.add(mobil);
    }

    // Truk
    public void addKendaraan(String nama, int jumlahRoda) {
        Truk truk = new Truk(BahanBakar.DIESEL, 3, nama, jumlahRoda);
        this.listKendaraan.add(truk);
    }

    // Helikopter
    public void addKendaraan(String nama, int kapasitasOrang, int jumlahBaling) {
        Helikopter helikopter = new Helikopter(BahanBakar.AVTUR, kapasitasOrang, nama, jumlahBaling);
        this.listKendaraan.add(helikopter);
    }

    // Pesawat
    public void addKendaraan(String isTempur, String nama, int kapasitasOrang,int jumlahRoda) {
        boolean tempur = isTempur.equalsIgnoreCase("YES") ? true : false;

        Pesawat pesawat = new Pesawat(BahanBakar.AVTUR, kapasitasOrang, nama, kapasitasOrang, tempur, jumlahRoda);
        this.listKendaraan.add(pesawat);
    }

}
