public class Main {
    public static void main(String[] args) {

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5, 2);
        Triangolo triangolo = new Triangolo(4, 6);

        System.out.println("L'area è: " + forma.calcolaArea());
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());

    }
}