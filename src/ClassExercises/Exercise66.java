package ClassExercises;

public class Exercise66 {

    public static void main(String[] args) {
        //I en array finns ett personnummer

        //Skapa en array av char
        char[] ssn = {'8', '0', '1', '2', '3', '1', '-', '1', '2', '3', '4'};

        if (ssn[6] == '-') {
            System.out.println("Bindestreck finns på rätt position");
        } else {
            System.out.println("Bindestreck saknas!");
        }


    }


}
