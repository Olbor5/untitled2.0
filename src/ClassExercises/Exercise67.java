package ClassExercises;

public class Exercise67 {

    public static void main(String[] args) {

        //Om den näst sista siffran är jämn i ett personnummer är det en kvinna, om ojämn en man. Avgör om personen i föregående uppgift är man eller kvinna

        char[] ssn = {'8', '0', '1', '2', '3', '1', '-', '1', '2', '3', '4'};

        if (ssn[9]%2==0) {
            System.out.println("Personen är en kvinna");
        } else {
            System.out.println("Personen är en man");
        }





    }
}
