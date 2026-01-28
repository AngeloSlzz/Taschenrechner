import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {

        double zahl1;
        double zahl2;
        double zahl3;
        String rechenoperation;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        zahl1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Rechenoperation eingeben: ");
        rechenoperation = scanner.nextLine();

        System.out.print("Zweite Zahl eingeben: ");
        zahl2 = scanner.nextDouble();

        if (rechenoperation.equals("+")) {
            zahl3 = zahl2 + zahl1;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equalsIgnoreCase("plus")) {
            zahl3 = zahl2 + zahl1;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equalsIgnoreCase("addition")) {
            zahl3 = zahl2 + zahl1;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equals("-")) {
            zahl3 = zahl1 - zahl2;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equalsIgnoreCase("minus")) {
            zahl3 = zahl1 - zahl2;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equalsIgnoreCase("subtraktion")) {
            zahl3 = zahl1 - zahl2;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equals("*")) {
            zahl3 = zahl1 * zahl2;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equalsIgnoreCase("mal")) {
            zahl3 = zahl1 * zahl2;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equalsIgnoreCase("multiplikation")) {
            zahl3 = zahl1 * zahl2;
            System.out.println("Das Ergebnis ist " + zahl3);
        } else if (rechenoperation.equals("/")) {
            if (zahl2 == 0) {
                System.out.println("Nicht durch 0 teilen!");
            } else {
                zahl3 = zahl1 / zahl2;
                System.out.println("Das Ergebnis ist " + zahl3);
            }
        } else if (rechenoperation.equalsIgnoreCase("geteilt durch")) {
            if (zahl2 == 0) {
                System.out.println("Nicht durch 0 teilen!");
            } else {
                zahl3 = zahl1 / zahl2;
                System.out.println("Das Ergebnis ist " + zahl3);
            }
        } else if (rechenoperation.equalsIgnoreCase("division")) {
            if (zahl2 == 0) {
                System.out.println("Nicht durch 0 teilen!");
            } else {
                zahl3 = zahl1 / zahl2;
                System.out.println("Das Ergebnis ist " + zahl3);
            }
        } else {
            System.out.println("Keine valide Rechenoperation");
        }

        scanner.close();
    }
}