package com.rplbo.bangunabstrak;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        PersegiPanjang pp = new PersegiPanjang(3,4);
        System.out.println("L:"+pp.luas());
        System.out.println("K:"+pp.keliling());

//        Persegi p = new Persegi(5);
//        System.out.println(p.keliling());
//        System.out.println(p.luas());
    }
}
