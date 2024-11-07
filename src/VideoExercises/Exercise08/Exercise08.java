package VideoExercises.Exercise08;

public class Exercise08 {

    public static void main(String[] args) {

        Spellchecker spell = new Spellchecker();

        if (spell.isLetter('a')) {
            System.out.println("a is a letter!");

        }


        if (spell.isLetter('z')) {
            System.out.println("z is a letter!");

        }
        if (spell.isLetter('J')) {
            System.out.println("J is a letter!");


        }

    }
}