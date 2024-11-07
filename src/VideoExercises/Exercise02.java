package VideoExercises;

public class Exercise02 {

    public static void main(String[] args) {

        /*Jämför två tal. Om det första är större än det andra skriv ut "Första talet är störst",
        samt andra talet är störst om tvärtom */

        int number01 = 13;
        int number02 = 5;

        if (number01 > number02) {
            System.out.println("Första talet är störst!");
        }

        {
            if (number02 > number01) System.out.println("Andra talet är störst!");
        }

        /* Jämför två tal. Om det första är jämt delbart med det andra
        skriv ut "Jämt delbart", annars skriv ut "Inte jämt delbart"
         */

        System.out.println();

        if (number01 % number02 == 0) {
            System.out.println("Jämt delbart!");
        }
        else {
            System.out.println("Inte jämt delbart!");
        }


    }
}
