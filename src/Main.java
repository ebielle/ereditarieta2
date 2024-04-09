public class Main {
    public static void main(String[] args) {

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        System.out.println("L'area è: " + forma.calcolaArea(0, 0));
        System.out.println("L'area è: " + rettangolo.calcolaArea(2, 3));

    }
}