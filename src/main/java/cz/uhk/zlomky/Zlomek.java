package cz.uhk.zlomky;

public class Zlomek extends Number {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {}

    @Override
    public int intValue() {
        return (int)longValue();
    }

    @Override
    public long longValue() {
        return Math.round(doubleValue());
    }

    @Override
    public float floatValue() {
        return citatel/(float)jmenovatel;
    }

    @Override
    public double doubleValue() {
        return citatel/(double)jmenovatel;
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }


    //"Getter"
    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    //"Setter"
    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", citatel, jmenovatel);
    }


    public Zlomek zkratit() {
        int delitel = nsd(citatel, jmenovatel); //vypocet nejmensiho spolecneho delitele
        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }

    /**
     * vypocet nejmensiho spolecneho delitele cisel A a B
     *
     * @param a citatel
     * @param b jmenovatel
     * @return
     */
    private int nsd(int a, int b) {
        if (a < b) {
            var temp = a;
            a = b;
            b = temp;
        }
        int zbytek = 0;
        do {
            zbytek = a % b;
            a = b;
            b = zbytek;
        } while (zbytek != 0);
        return a;
    }

    /**
     * Metoda pro scitani 2 zlomku
     *
     * @param b druhy zlomek
     * @return vraci novy zlomek = soucet zlomku
     */

    public Zlomek plus(Zlomek b) {
        int jm = jmenovatel * b.jmenovatel;
        int cit = citatel * b.jmenovatel + b.citatel * jmenovatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek minus(Zlomek b) {
        int jm = jmenovatel * b.jmenovatel;
        int cit = citatel * b.jmenovatel - b.citatel * jmenovatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek krat(Zlomek b) {
        int jm = jmenovatel * b.jmenovatel;
        int cit = citatel * b.citatel;

        return new Zlomek(cit, jm);
    }

    public Zlomek deleno(Zlomek b) {
        int jm = jmenovatel * b.citatel;
        int cit = citatel * b.jmenovatel;

        return new Zlomek(cit,jm);
    }
    //pretizene plus pro pricteni celeho cisla
    public Zlomek plus(int cislo){
        int cit = citatel + jmenovatel * cislo;
        return new Zlomek(cit, jmenovatel);
    }

}
