package com.company;

public class Kniha {

    String nazov;
    String autor;
    int pocetStran;
    int aktualnaStrana;

    public void chodNaStranu(int strana){
        aktualnaStrana = strana;
        System.out.println(aktualnaStrana);
    }
    public void zobrazStranu(){
    }
    int zistiAktualnuStranu(){
        return -1;
    }
}
