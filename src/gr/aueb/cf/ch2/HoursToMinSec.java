package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απο τον χρήστη ένα ακέραιο που
 * αντιστοιχεί σε ώρες (hours). Μετατρέπει
 * σε λεπτά και δευτερόλεπτα και τα εκτυπώνει.
 */


public class HoursToMinSec {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int  HOURS_TO_MINUTES = 60;
        final int   HOURS_TO_SECONDS = 3600;
        int inputhours = 0;
        int minutes = 0;
        int seconds = 0;

        // Input - Data Binding
        System.out.println("Παρακαλώ εισάγετε τον αριθμό των ωρών");
        inputhours = scanner.nextInt();

        // Εντολές επεξεργασίας
        minutes = inputhours * HOURS_TO_MINUTES;
        seconds = inputhours * HOURS_TO_SECONDS;

        // Εκτύπωση αποτελέσματος
        System.out.printf("Ώρες: %d, Λεπτά: %d, Δευτερόλεπτα: %d\n" , inputhours, minutes, seconds);
    }
}
