package RectangelExercise;

public class Rectangle {

    private int width;
    private int height;

    //Konstruktor
    public Rectangle(int myWidth, int myHeight) {
        width = myWidth;
        height = myHeight;

    }

    //Metod med return
    public int calculateArea() {
        return width * height;

    }

    public int calculatePerimeter() {
        return width * 2 + height * 2;
    }

    /*public boolean isSquare() {
        //om width och height är lika returnera true, annars returnera false
        if (width == height) {
            return true;
            else{
                return false;

            }
        }
    } */
}
