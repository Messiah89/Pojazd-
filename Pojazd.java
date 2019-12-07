package com.company;

class Pojazd {

    int rokProdukcji;
    String rodzajSilnika;
    String kolor;
    String masa;

    void uruchomiSilnik() {
        System.out.println("Silnik uruchomiono");
    }
}

class Kołowe extends Pojazd {
    String rozmiarOpony;

    void uruchomiSilnik(String rodzajSilnika) {
    }
}


class Ciężarówka extends Kołowe {
    String udźwig;

    void podnieśSkrzynie() {
    }
}

class Osobowe extends Kołowe {
    int ilośćOsób;
}

class Sedan extends Osobowe {
    String model;
    String symbol;
}

class Skoda extends Sedan {

    {
        class SuperB extends Skoda {
        }
        class Octawia extends Skoda {
        }
    }

    class VW extends Sedan {
    }

    {
        class Golf extends VW {
        }
    }
}

class Pickup extends Osobowe {
}


class Szynowe extends Pojazd {
    void uruchomiSilnik() {
        System.out.println("uruchomiono silnik pojazdu szynowego");

    }
}
class Pociąg extends Szynowe {
    static String Właściciel("P.K.P.");
}

class Gąsienicowe extends Pojazd {
    String moc;

    void uruchomiSilnik() {
        super.uruchomiSilnik();

            System.out.println("Jest to pojazd gąsienicowy");

    }
}


class Czołg extends Gąsienicowe {
}

class Spychacz extends Gąsienicowe {
}



