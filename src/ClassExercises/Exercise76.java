package ClassExercises;

public class Exercise76 {
    public static void main(String[] args) {
        //0   1    2   3   4   5    6    7   8   9
        int numbers[] = {10, 20, 30, 45, 80, 213, -88, 906, 5, 1666};

        int length = numbers.length;

        //Skapa en ny array med 10 positioner
        int[] reverse = new int[length];

        for (int i = 0; i < length; i++) {
            reverse[i] = numbers[length - 1 - i];
        }


        for (int i = 0; i < length; i++) {
            System.out.println(reverse[i]);
        }

    }
}
