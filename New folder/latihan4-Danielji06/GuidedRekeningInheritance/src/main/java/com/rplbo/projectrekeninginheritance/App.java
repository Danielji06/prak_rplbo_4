package com.rplbo.projectrekeninginheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb1 = new RekeningBisnis(new Nasabah("anton","123","jl jalan"),10000);
        rb1.penyetoran(2000);
        rb1.penarikan(500);
        System.out.println(rb1.getSaldo());

        RekeningKeluarga rk1 = new RekeningKeluarga(new Nasabah("budi","124","jl jalan 2"),10000);
        rk1.penyetoran(2000);
        rk1.penarikan(500);
        System.out.println(rk1.getSaldo());

        RekeningSyariah rs1 = new RekeningSyariah(new Nasabah("gun","125","jl jalan 3"),1000000);
        rs1.penyetoran(200000);
        rs1.penarikan(110000);
        rs1.sedekah(100000);
        System.out.println(rs1.getSaldo());

        RekeningUtama ru1 = new RekeningUtama(new Nasabah("bapak","125","jl jalan 3"),5000000);
        ru1.penyetoran(1000000);
        ru1.penarikan(3500000);
        ru1.penarikan(500000);
        System.out.println(ru1.getSaldo());

        RekeningTambahan rt1 = new RekeningTambahan(new Nasabah("anak","126","jl jalan 3"),5000000);
        rt1.penyetoran(1000000);
        rt1.penarikan(600000);
        rt1.penarikan(200000);
        System.out.println(rt1.getSaldo());
    }
}
