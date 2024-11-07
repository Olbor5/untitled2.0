package RectangelExercise;

import java.util.Scanner;

public class MainRectangle {

    public static void main(String[] args) {

    Circle myCircle = new Circle(8);

    Circle yourCircle = new Circle(7);

    if(myCircle.isBiggerThan(yourCircle)) {
        System.out.println("My circle is bigger!");
    }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        int width = scan.nextInt();
        System.out.println("Enter the height of the rectangle:");
        int height = scan.nextInt();
        Rectangle myRectangle = new Rectangle(width, height);

        System.out.println("Area is: " + myRectangle.calculateArea());
        System.out.println("Perimeter is: " + myRectangle.calculatePerimeter());

    }




}

