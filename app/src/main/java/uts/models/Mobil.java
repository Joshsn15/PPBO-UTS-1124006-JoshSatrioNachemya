package uts.models;

public class Mobil extends KendaraanDarat {
    
    public Mobil(BahanBakar bahanBakar, int kapasitasOrang, String nama, int jumlahRoda){
        super(bahanBakar,kapasitasOrang,nama,4);
    }

    @Override
    public String getDetails(){
        return "Mobil " + getNama() + " , Kapasitas Orang " + getKapasitasOrang() + ", Jumlah Roda " + getJumlahRoda();
    }
}
