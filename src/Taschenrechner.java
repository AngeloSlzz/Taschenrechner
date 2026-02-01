import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        String rechenoperation;
        double ergebnis = 0;
        boolean validerOperator = true;

        System.out.print("Erste Zahl eingeben: ");
        num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Rechenoperatorion eingeben: ");
        rechenoperation = scanner.nextLine();

        System.out.print("Zweite Zahl eingeben: ");
        num2 = scanner.nextDouble();
        scanner.nextLine();

        switch(rechenoperation) {

            case
                "+", "plus", "Plus", "addieren", "Addition", "Addieren", "addition"
                -> ergebnis = num1 + num2;

            case
                "-", "minus", "Minus", "Subtraktion", "subtraktion", "Subtrahieren", "subtrahieren"
                -> ergebnis = num1 - num2;

            case
                "*", "mal", "Mal", "Multiplikation", "multiplikation", "Multiplizieren", "mulitplizieren"
                -> ergebnis = num1 * num2;

            case
                "/", "geteilt durch", "Geteilt durch", "Dividieren", "dividieren", "Division", "division"-> {
                if(num2 == 0) {
                    validerOperator = false;
                    ergebnis = 0;

                } else {
                    ergebnis = num1 / num2;
                }
            }

            case "^", "Hoch", "hoch" -> ergebnis = Math.pow(num1, num2);

            default -> validerOperator = false;

        } if(validerOperator) {
            System.out.println("Das Ergebnis ist " + ergebnis);

        } else {
            System.out.println("Keine valide Rechenoperation!");
        }
    }
}
