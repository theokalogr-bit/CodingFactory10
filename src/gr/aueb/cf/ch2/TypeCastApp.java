package gr.aueb.cf.ch2;

/**
 * Typecast demo
 */



public class TypeCastApp {

    public static void main(String[] args) {
        int num1 = Integer.MAX_VALUE;
        long num2 = 20L;      // type suffix

       // num1 = (int) num2;    // Typecast is Error prone
        num1 = num1 + 10;              //Overflow

        System.out.println(num1);
    }

}
