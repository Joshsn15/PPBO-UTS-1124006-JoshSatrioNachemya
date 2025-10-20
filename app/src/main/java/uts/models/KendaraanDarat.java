package uts.models;

public class KendaraanDarat extends Kendaraan {
    private BahanBakar bahanBakar;
    private int kapasitasOrang;
    private String nama;
    private int jumlahRoda;

    public KendaraanDarat(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda){
        super(bahanBakar,kapasitasOrang,nama);
        this.jumlahRoda = jumlahRoda;
    }

   
    public int getJumlahRoda(){
        return this.jumlahRoda;
    }


    @Override
    public String getDetails() {
        return "";
    }
}
