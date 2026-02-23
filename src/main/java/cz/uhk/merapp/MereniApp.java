package cz.uhk.merapp;

import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.Zlomek;

public class MereniApp {
    static void main() {
        var mereni = new Mereni();
        mereni.pridani(new Zlomek(12,7));
        mereni.pridani(new Zlomek(22,5));
        mereni.pridani(new Zlomek(37,9));
        mereni.pridani(new Zlomek(65,10));
        mereni.pridani(new Zlomek(73,18));
        mereni.pridani(10);
        mereni.pridani(12.8);
        mereni.pridani(15e3);
        mereni.pridani(10235);
        mereni.pridani(-15.4);
        IO.println("Soucet je %g".formatted(mereni.secist().doubleValue()));
        IO.println("Prumer je %g".formatted(mereni.prumer().doubleValue()));
        IO.println("Maximum je %g".formatted(mereni.max().doubleValue()));
        IO.println("Minimum je %g".formatted(mereni.min().doubleValue()));

        for (int i =0; i< mereni.size(); i++) {
            Number m = mereni.get(i);
            IO.println(m);
        }
    }
}
