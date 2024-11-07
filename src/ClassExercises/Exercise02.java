package ClassExercises;

public class Exercise02 {

    public static void main(String[] args) {
        //Spara försäljningssumman F (eller läs in den)
        int F = 19500;

        //Spara grundlönen (8000 kr)
        int G = 8000;

        //Räkna ut prestationslönen F*9/100 (F*0.09)
        int P = F * 9/100;

        //Räkna ut lönen prestationslön + grundlön
        int salary = G + P;

        //Skriv ut lönen
        System.out.println("Grundlönen är " + G + "kr");
        System.out.println("Prestationslönen är " + P + "kr");
        System.out.println("Månadslönen är " + salary  + "kr");

    }
}
