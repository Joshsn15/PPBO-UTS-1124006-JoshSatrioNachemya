package uts.models;

public class Truk extends KendaraanDarat implements Kargoable {

    public Truk(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda) {
        super(BahanBakar.DIESEL, 3, nama, jumlahRoda);
    }

    @Override
    public String getDetails() {
        return "Truk " + getNama() + " , Kapasitas Orang " + getKapasitasOrang() + ", Jumlah Roda " + getJumlahRoda();
    }

    @Override
    public void loadKargo() {
        System.out.println("Mengisi kargo dari Truk . . . .");
    }

    @Override
    public void unloadKargo() {
        System.out.println("Mengeluarkan isi kargo dari Truk . . . .");

    }

}
