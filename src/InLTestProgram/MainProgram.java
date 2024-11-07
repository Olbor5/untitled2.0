package InLTestProgram;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextCounter textCounter = new TextCounter();
        System.out.println("Skriv in text rad för rad (skriv 'stop' för att avsluta):");

        // Läser in rader tills användaren skriver "stop"
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            textCounter.addLine(line);
        }

        // Skriver ut resultatet
        System.out.println("Antal rader (exklusive 'stop'): " + textCounter.getLineCount());
        System.out.println("Antal tecken: " + textCounter.getCharCount());
    }
}
