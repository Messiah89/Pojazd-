package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Osobowe Opel = new Osobowe();
        Opel.rokProdukcji = 2019;
        Opel.rodzajSilnika = "elektryczny";
        Opel.kolor = "biały";
        Opel.masa = "1200 kg";
        Opel.rozmiarOpony = "195/70 R15";
        Opel.ilośćOsób = 4;

        Osobowe BMW = new Osobowe();
        BMW.rokProdukcji = 2012;
        BMW.rodzajSilnika = "benzynowy";
        BMW.kolor = "czerwony";
        BMW.masa = "1500 kg";
        BMW.rozmiarOpony = "185/70 R16";
        BMW.ilośćOsób = 5;

        Osobowe Mercedes = new Osobowe();
        Mercedes.rokProdukcji = 2009;
        Mercedes.rodzajSilnika = "diesel";
        Mercedes.kolor = "niebieski";
        Mercedes.masa = "1800 kg";
        Mercedes.rozmiarOpony = "195/80 R17";
        Mercedes.ilośćOsób = 5;
    }
}
