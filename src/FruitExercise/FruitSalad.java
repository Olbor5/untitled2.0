package FruitExercise;

public class FruitSalad {

    public static void main(String[] args) {

        Fruit banana = new Fruit ("Yellow");
        Fruit apple = new Fruit ("Red");
        Fruit pear = new Fruit ("Green");

        //Anropa den nya metoden från Fruit på varje objekt

        banana.printColor();
        apple.printColor();
        pear.printColor();

    }
}
