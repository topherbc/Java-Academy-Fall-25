public class Main {
    public static void main(String[] args) {
        /**
         * Conditions: Proposition to be acted upon
         *  - Statements that explains what happens
         * Logic: Prediction of what is possible
         */

        double bankAccountValue = 10;
        int creditScore = 900;
        double carPrice = 100000;
        String firstName = "Bob";

        //I want a car
        if (bankAccountValue > carPrice) {
            System.out.println("You get a car!");
        }
        else if (creditScore > 700 || firstName.equals("Bob")) {
            System.out.println("You get a loan!");
        }

        /**
         * Comparisons
         * == to compare equality for int, double, floats
         * < greater than
         * > less than
         * <= less than or equal
         * >= greater than or equal
         *
         * .equals() or .equalsIgnoreCase() to compare Strings
         *
         * and operator &&
         * or operator ||
         * not operator !
         */

        String name = "words";
        String otherValue = "Wor";
        otherValue = otherValue + "ds";

        if (name.equalsIgnoreCase(otherValue.toLowerCase())) {
            System.out.println("Yes, it is");
        }

       int year = 2025;

        if (year > 2000) {
            if (year != 2026) {
                System.out.println("Not in the future yet");
            }
            System.out.println("Yeah!");
        }




    }
}
