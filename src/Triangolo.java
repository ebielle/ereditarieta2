public class Triangolo extends Forma {

    private int base = 0;
    private int altezza = 0;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea() {
        return (base * altezza) / 2;
    }

}
