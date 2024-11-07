package ClassExercises;

public class Exercise03 {

    public static void main(String[] args) {
        //Skapa program som läser in antal timmar, beräknar och skriver ut hur mycket det blir omvandlat till minuter resp sekunder

        //Skriv in antal timmar
        int timmar = 40;

        //Antal minuter per timme
        int minuter = 60;

        //Antal sekunder per minut
        int sekunder = 60;

        //Hur många sekunder på en timme
        int SpT = minuter * sekunder;

        //Hur många minuter på inmatade timmar
        int MpT = timmar * minuter;

        //Hur många sekunder på inmatade timmar
        int result = SpT * timmar;

        System.out.println("Det är " + result + " sekunder och " + MpT + " minuter på " + timmar + " timmar");


    }
}
