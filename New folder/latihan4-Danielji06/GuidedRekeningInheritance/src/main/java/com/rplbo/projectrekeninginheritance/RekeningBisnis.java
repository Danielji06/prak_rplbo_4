package com.rplbo.projectrekeninginheritance;

public class RekeningBisnis extends Rekening {

    public RekeningBisnis(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningBisnis(Nasabah nasabah) {
        super(nasabah);
    }

    @Override
    public void penyetoran(int jumlah) {
        if(jumlah > 0) {
            int totalSetoran = jumlah + bunga(jumlah);
            super.penyetoran(totalSetoran);
        }
    }

    private int bunga(int jumlah) {
        return (int) BUNGA_SETOR * jumlah;
    }
}

