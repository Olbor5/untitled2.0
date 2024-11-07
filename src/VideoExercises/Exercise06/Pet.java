package VideoExercises.Exercise06;

public class Pet {

    private String name;               //Attribut

    public Pet(String petName) {      //Konstruktor
        name = petName;

    }

    //Skapa en ny metod i klassen Pet som skriver ut attributet name
    public void printName() {

        System.out.println("The name of the pet is " + name);
    }

    public String getName() {
        return name;
    }


}
