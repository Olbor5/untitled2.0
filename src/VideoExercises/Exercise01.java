package VideoExercises;

public class Exercise01 {

    public static void main(String[] args) {

        //Skapa ett program som använder tre tal
        //Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen

        int number01 = 5;
        int number02 = 8;
        int number03 = 14;

        int sum = number01 + number02 + number03;
        int median = sum / 3;

        System.out.println("The sum is " + sum);
        System.out.println("The median is " + median);

        //Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel. Rektangelns sidor ska läsas in

        int height = 3;
        int width = 5;

        int area = height * width;
        int circ = height*2 + width*2;

        System.out.println(area);
        System.out.println(circ);

    }
}
