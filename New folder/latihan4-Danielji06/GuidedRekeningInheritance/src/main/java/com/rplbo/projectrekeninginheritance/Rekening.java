package com.rplbo.projectrekeninginheritance;

public class Rekening {
    private Nasabah nasabah;
    private int saldo;

    public Rekening(Nasabah nasabah, int saldo) {
        
    }

    public Rekening(Nasabah nasabah) {
        
    }

    public void penyetoran(int jumlah) {
        if (jumlah > 0)
            saldo = saldo + jumlah;
    }

    public void penarikan(int jumlah) {
        int saldoBaru = saldo - jumlah;
        if(saldoBaru > 0 && jumlah > 0)
            saldo = saldoBaru;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public int getSaldo() {
        return saldo;
    }
}

