package com.rplbo.projectrekeninginheritance;

public class RekeningKeluarga extends Rekening{

    public RekeningKeluarga(Nasabah nasabah) {
        super(nasabah, saldo);
    }

    public RekeningKeluarga(Nasabah nasabah, int saldo) {
        super(nasabah);
    }

    public void penyetoran(int jumlah) {
        if(jumlah > 0) {
            int totalSetoran = jumlah + bunga(jumlah);
            super.penyetoran(totalSetoran);
    }

    private int bunga(int jumlah) {
        
    }

}
