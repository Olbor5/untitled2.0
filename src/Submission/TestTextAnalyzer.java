package Submission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestTextAnalyzer {

    @Test

    public void testCountOneRow() {

        //Skapa ett objekt av TextAnalyzer
        TextAnalyzer analyzer = new TextAnalyzer();

        //1. Skickar in "Hej" (som göra en insättning)
        analyzer.analyzeText("Hej");

        //3. Hämtar rows (som att hämta antalet rader i vår kontoutdrag)
        int actual = analyzer.getRows();
        int expected = 1;

        //4. Kontrollerar att rows = 1
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testCountTwoRows() {

        //Skapa ett objekt av TextAnalyzer
        TextAnalyzer analyzer = new TextAnalyzer();

        //1. Skickar in "Hej" (som göra en insättning)
        analyzer.analyzeText("Hej");
        analyzer.analyzeText("Hejsan");

        //3. Hämtar rows (som att hämta antalet rader i vår kontoutdrag)
        int actual = analyzer.getRows();
        int expected = 2;

        //4. Kontrollerar att rows = 1
        Assertions.assertEquals(expected, actual);

    }

}
