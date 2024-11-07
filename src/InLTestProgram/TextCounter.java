package InLTestProgram;

public class TextCounter {

    private int lineCount = 0;
    private int charCount = 0;

    // Metod för att uppdatera räknaren med ny text
    public void addLine(String line) {
        lineCount++;
        charCount += line.length();
    }

    // Returnerar antal rader
    public int getLineCount() {
        return lineCount;
    }

    // Returnerar antal tecken
    public int getCharCount() {
        return charCount;
    }


}
