package VideoExercises.Exercise07;

public class Exercise07 {

    public static void main(String[] args) {
        String myString = "some text";

        if (myString.equals("some text")) {

            System.out.println("Yes the text is the same!");
        } else {
            System.out.println("No the text is not the same");
        }

        if (myString.length() == 9) {

            System.out.println("The text is 9 characters");
        } else {
            System.out.println("The text is not 9 characters");
        }

        System.out.println(myString.charAt(3));


    }
}
