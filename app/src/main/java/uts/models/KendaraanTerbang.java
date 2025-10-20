package uts.models;

public class KendaraanTerbang extends Kendaraan {
    private BahanBakar bahanBakar;
    private int kapasitasOrang;
    private String nama;
    public KendaraanTerbang(BahanBakar bahanBakar, int kapasitasOrang, String nama){
        super(bahanBakar,kapasitasOrang,nama);
        
    }

   

    @Override
    public String getDetails() {
        return "";
    }
}
