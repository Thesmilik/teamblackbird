package com.company;

public class Main {

    public static void main(String[] args) {
        Kniha k1 = new Kniha();
        Kniha k2 = new Kniha();

        k1.nazov = "Meciarova vlada";
        k1.autor = "Jozef Iliankoevicis";
        k1.nazov();
        k1.autor();


        k2.nazov = "Nic neviem z programovania";
        k2.autor = "Patrik Sramko";
        k2.nazov();
        k2.autor();
        k2.chodNaStranu( 10);
        k2.pocetStran = 60;
        k2.zobrazStranu();

        Kniha[] pole = new Kniha[10];
        pole[0] = new Kniha();
        pole[1] = new Kniha();
        pole[3] = new Kniha();

        pole[0].nazov = "xd";
        pole[0].autor = "asdf";
        pole[0].pocetStran = 50;
        pole[0].chodNaStranu(12);
        pole[0].zobrazStranu();




    }
}
