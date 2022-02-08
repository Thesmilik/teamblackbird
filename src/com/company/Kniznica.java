package com.company;

public class Kniznica {

    public String zoznamKnih[];


    public Kniznica(String[] zoznamKnih) {
        this.zoznamKnih = zoznamKnih;
    }
    public void show() {
        for (int i = 0; i == zoznamKnih.length; i++) {
            System.out.println(zoznamKnih);
        }
    }
    public void add(String[] zoznamKnih) {
        this.zoznamKnih = zoznamKnih;
    }
}

