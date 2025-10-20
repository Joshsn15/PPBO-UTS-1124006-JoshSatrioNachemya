package uts.view;

import java.util.Collections;
import java.util.Scanner;

import uts.controller.KendaraanControllers;
import uts.models.Kendaraan;
import uts.util.CLIUtils;

public class KendaraanView {
    KendaraanControllers KendaraanControllers;

    public KendaraanView() {
        this.KendaraanControllers = new KendaraanControllers();
    }

    public void render() {
        this.printMenu();
        int menu = CLIUtils.getInt();
        while (menu != 0) {
            switch (menu) {
                case 1:
                    this.handleTambahKendaraan();
                    break;
                case 2:
                    this.handlePrintKendaraan();
                    break;
                case 3:
                    // this.handleSortKendaraan();
                    break;
                case 0:
                    return;
            }
            this.printMenu();
            menu = CLIUtils.getInt();
        }
    }

    private void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah kendaraan");
        System.out.println("2. Tampilkan semua kendaraan");
        System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
        System.out.println("0. Keluar");
    }

    private void handleTambahKendaraan() {
        System.out.println("Kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Truk");
        System.out.println("3. Helikopter");
        System.out.println("4. Pesawat");
        int tipe = CLIUtils.getInt();
        CLIUtils.getString();
        String nama = CLIUtils.askForString("Masukkan nama kendaraan: ");
        
        switch (tipe) {
            case 1: // mobil
                String bahanBakar = CLIUtils.askForString("Masukkan tipe bahan bakar (bensin,diesel,avtur) = ");
                int kapasitasOrang = CLIUtils.askForInt("Masukkan Kapasitas Orang = ");
                CLIUtils.getString();
                KendaraanControllers.addKendaraan(nama, bahanBakar, kapasitasOrang);
                break;

            case 2: // truk
                int jumlahRoda = CLIUtils.askForInt("Masukkan jumlah roda =");
                KendaraanControllers.addKendaraan(nama, jumlahRoda);
                break;
            case 3: // helikopter
                kapasitasOrang = CLIUtils.askForInt("Masukkan Kapasitas Orang = ");
                int jumlahBaling = CLIUtils.askForInt("Masukkan Jumlah Baling = ");
                CLIUtils.getString();
                KendaraanControllers.addKendaraan(nama, kapasitasOrang, jumlahBaling);
                break;
            case 4: // pesawat
                jumlahRoda = CLIUtils.askForInt("Masukkan jumlah roda =");
                kapasitasOrang = CLIUtils.askForInt("Masukkan Kapasitas Orang = ");
                CLIUtils.getString();
                String isTempur = CLIUtils.askForString("Apakah Pesawat tempur (YES/NO) = ");
                KendaraanControllers.addKendaraan(isTempur, nama, kapasitasOrang, jumlahRoda);
                break;
        }
    }

    private void handlePrintKendaraan() {
        for (Kendaraan kendaraan : KendaraanControllers.getListKendaraan()) {
            System.out.println(kendaraan.getDetails());
        }
    }

    private void handleSortKendaraan() {
        // Collections.sort(KendaraanControllers.getListKendaraan());    
    }
}