package Exercise09;

public class Calculator {


    //Attribut (Om båda är int räcker 1st rad)
    private int first, second;

    //Konstruktor
    public Calculator(int first, int second) {
        this.first = first;      //Använd this.attribut för att peka ut om båda objekten är i samma "int"
        this.second = second;

    }

    public int add() {
    return first + second;

    }
}