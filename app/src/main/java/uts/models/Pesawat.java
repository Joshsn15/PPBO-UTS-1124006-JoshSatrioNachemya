package uts.models;

public class Pesawat extends KendaraanTerbang implements Kargoable {
    private boolean isTempur;
    private int jumlahRoda;
      
    public Pesawat(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahBaling, boolean isTempur, int jumlahRoda) {
        super(BahanBakar.AVTUR, kapasitasOrang, nama);
        this.jumlahRoda = jumlahRoda;
        this.isTempur = isTempur;
    }

    @Override
    public String getDetails(){
        return "Pesawat " + getNama() + " , Kapasitas Orang " + getKapasitasOrang() + ", Jumlah Roda " + this.jumlahRoda;
    }

    @Override
    public void loadKargo() {
        System.out.println("Mengisi kargo dari Pesawat . . . .");
    }

    @Override
    public void unloadKargo() {
        System.out.println("Mengeluarkan isi kargo dari Pesawat . . . .");
    
    }

}
