package ClassExercises;

public class Exercise29 {

    public static void main(String[] args) {

        //Läs in timmar avgång
        int deph = 11;
        //Läs in minuter avgång
        int depm = 41;
        //Läs in timmar körtid
        int driveh = 3;
        //Läs in minuter körtid
        int drivem = 47;

        //Räkna timmar
        int arrivalh = deph + driveh;

        //Räkna minuter
        int arrivalm = depm + drivem;
        //Om arrivalm > 59 minska med 60 samt öka arrivalh med 1
        if (arrivalm > 59) {
            arrivalm -= 60;
            arrivalh += 1;
        }

        //Kontrollera om ny dag
        if (arrivalh > 23) {
            arrivalh -= 24;
            arrivalh++;
        }
        System.out.println("We arrive at: " + arrivalh + ":" + arrivalm);
    }
}
