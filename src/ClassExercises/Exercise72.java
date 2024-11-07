package ClassExercises;

public class Exercise72 {

    public static void main(String[] args) {

        //En array med 50 tal finns
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,-18,19,20,21,22,23,24,25,1,2,3,4,5,6,7,8,9,10,11,12,-13,14,15,16,17,18,19,20,21,22,23,24,25};

        //Bestäm och skriv ut in dex för det sista negativa talet i arrayen

        for(int i=numbers.length - 1;i>=0;i--) {

            if(numbers[i]<0) {
                System.out.println(numbers[i]);
                System.out.println("Index är: " + i);
                break;
            }


        }

    }
}
