package ClassExercises;

public class Exercise71 {

    public static void main(String[] args) {

        //En array med 50st tal
        int[] numbers = {9, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Ta reda på hur många tal som är större än det första talet

        //Skapa räknare för antalet "stora tal"
        int counter = 0;

        //Vilket är det första talet
        int first = numbers[0];

        //Jämföra om ett tal är större än det första talet
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > first) {
                //öka räknare med
                counter++;
            }
        }

        System.out.print(counter);
    }

}
