package VideoExercises;

public class Exercise03 {

    public static void main(String[] args) {

        int day = 1;

        while (day <= 31) {
            System.out.println(day + " January");
            day = day + 1;
        }
        System.out.println();
        System.out.println();
        System.out.println("Numbers 1-100");

        /*Skriv ut alla tal från 1-100 */

        int number = 1;
        while (number <= 100) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        System.out.println();
        System.out.println("Even numbers 1-100");
        /*Skriv ut alla jämna tal från 1-100*/

        int even = 2;
        while (even <= 100) {
            System.out.print(even + " ");
            even += 2;

        }

        /*Skriv ut alla fibonnaci-tal mellan 1-100*/

        System.out.println();
        System.out.println();
        System.out.println("Fibonacci numbers 1-100");

        int first = 1;

        System.out.print(first + " ");

        int second = 1;

        while (second <= 100) {
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second = third;

        }
    }
}
