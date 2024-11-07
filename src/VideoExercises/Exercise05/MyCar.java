package VideoExercises.Exercise05;

public class MyCar {

    public static void main(String[] args) {

        //Skapar ett nytt objekt som använder sig av klassen Car
        Car myCar = new Car();

        //Ändra på myCar genom att sätta färgen till Blue
        myCar.setColor("Blue");

        //Hämta info från myCar i detta fal bilfärgen Blue
        String color = myCar.getColor();

        System.out.println(color);

    }
}
