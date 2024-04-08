public class Main {
    public static void main(String[] args) {

        Forma forma = new Forma() {
            @Override
            public int calcolaArea(int x, int y) {
                return 0;
            }
        };
        Rettangolo rettangolo = new Rettangolo();

        System.out.println("L'area è: " + forma.calcolaArea());
        System.out.println("L'area è: " + rettangolo.calcolaArea(2, 3));

    }
}