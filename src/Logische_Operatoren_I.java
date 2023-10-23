import java.util.Scanner;
public class Logische_Operatoren_I {
    public static void main(String[] args) {
        boolean schalter1An, schalter2An, lampeAn;
        Scanner input = new Scanner(System.in);
        System.out.print("Ist der erste Schalter an? (true/false): ");
        schalter1An = input.nextBoolean();
        System.out.print("Ist der zweite Schalter an? (true/false): ");
        schalter2An = input.nextBoolean();
        lampeAn = schalter1An ^ schalter2An; // Lampe ist an, wenn genau einer der Schalter an ist
        System.out.println("Der erste Schalter ist an? " + schalter1An);
        System.out.println("Der zweite Schalter ist an? " + schalter2An);
        System.out.println("Die Lampe ist an? " + lampeAn);
input.close();
    }
}
