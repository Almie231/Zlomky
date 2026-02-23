package cz.uhk.zlomky;

public class Main {
    static void main() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(1, 2);

        var soucet = a.plus(b);
        IO.println("Soucet je %s".formatted(soucet.zkratit()));
        var rozdil = a.minus(b);
        IO.println("Rozdil je %s".formatted(rozdil.zkratit()));
        var soucin = a.krat(b);
        IO.println("Soucin je %s".formatted(soucin.zkratit()));
        var podil = a.deleno(b);
        IO.println("Podil je %s".formatted(podil.zkratit()));

        Zlomek[] pole = new Zlomek[]{
                new Zlomek(1, 2),
                new Zlomek(3, 4),
                new Zlomek(6, 5),
                new Zlomek(4, 3),
                new Zlomek(7, 8),
                new Zlomek(13, 10),
        };
        Zlomek prumer = prumer(pole);
        IO.println("Prumer je %s".formatted(prumer.zkratit()));

        Zlomek cele_cislo = new Zlomek (1,5);
        var soucetZ = cele_cislo.plus(10);
        IO.println("Soucet je %s".formatted(soucetZ.zkratit()));
        int celecislo = prumer.intValue();
        IO.println("Zlomek na cele cislo je : %d".formatted(celecislo));
    }

    private static Zlomek prumer(Zlomek[] pole) {
        var soucet = new Zlomek(0,1);
        for (var z : pole) {
            soucet = soucet.plus(z);
        }
        var pocet = new Zlomek(pole.length, 1);
        return soucet.deleno(pocet);
    }
}
