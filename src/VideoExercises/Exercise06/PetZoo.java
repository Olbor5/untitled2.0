package VideoExercises.Exercise06;

public class PetZoo {

    public static void main(String[] args) {

        Pet dog = new Pet("Doggo");
        Pet cat = new Pet("Kalle");
        Pet bird = new Pet("Birdy");

        /*dog.printName();
        cat.printName();
        bird.printName(); */

        String dogName = dog.getName();
        String catName = cat.getName();
        String birdName = bird.getName();

        for(int i=0;i<2;i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(birdName);
        }

    }

}