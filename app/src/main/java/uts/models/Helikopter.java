package uts.models;

public class Helikopter extends KendaraanTerbang {
    private int jumlahBaling;

    public Helikopter(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahBaling) {
        super(BahanBakar.AVTUR, kapasitasOrang, nama);
        this.jumlahBaling = jumlahBaling;
    }

    public int getJumlahBaling() {
        return this.jumlahBaling;
    }

   @Override
    public String getDetails(){
        return "Hellikopter " + getNama() + " , Kapasitas Orang " + getKapasitasOrang() + ", Jumlah Baling-baling " + getJumlahBaling();
    }
}
