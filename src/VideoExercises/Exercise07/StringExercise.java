package VideoExercises.Exercise07;

import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {

        //Läs in en String (scan.nextLine())

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        if (text.equals("ägg")) {
            System.out.println("Ägg är knasigt!");

        } else {
            //Använd en for-loop och skriv ut tecknen för tecknen innehållet i Stringen

            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));

            }
        }

        }

    }

