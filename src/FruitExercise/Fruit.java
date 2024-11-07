package FruitExercise;

public class Fruit {

    //Skapa ett attribut
    //En text som heter color
    private String color;

    //Skapa konstruktor

    public Fruit(String myColor) {
        color = myColor;

    }

    //Skapa en metod som skriver ut färgen på frukten

    public void printColor() {

        System.out.println("The color of this fruit is " + color);
    }

}
