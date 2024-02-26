package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening{


    public RekeningSyariah(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningSyariah(Nasabah nasabah) {
        super(nasabah);
    }

    public void penyetoran(int jumlah) {
        int totalTarik = jumlah;
        if(jumlah > 100000) {
            totalTarik = jumlah + 1000;
            super.penyetoran(totalTarik);
        }
        super.penyetoran(totalTarik);
    }
    public void sedekah(int jumlah){
        super.penarikan(jumlah);
    }
}
