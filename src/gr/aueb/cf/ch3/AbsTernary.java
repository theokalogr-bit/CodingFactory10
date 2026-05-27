package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο. Το πρόγραμμα υπολογίζει
 * το απόλυτο του ακεραίου. Το απόλυτο ενός ακεραίου
 * είναι θετικός αριθμός. Για παράδειγμα το απόλυτο του -5 είναι 5,
 * ενώ το απόλυτο του 5 είναι 5.
 */



public class AbsTernary {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int abs = 0;

        System.out.println("Εισάγετε έναν ακέραιο αριθμό");
        num1 = in.nextInt();

        // Επεξεργασία - Εκχώρηση υπό συνθήκη
        abs = num1 >= 0 ? num1 : -num1;

        // Εκτύπωση Αποτελεσμάτων
        System.out.println("Η απόλυτη τιμή του " + num1 + " είναι " + abs);
    }

}
