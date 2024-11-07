package RectangelExercise;

public class Circle {

    //Attribut
    private int radius;

    //Konstruktor som tar in radien som ett attribut
    public Circle(int radius) {
        this.radius = radius;

    }

    //Metod för arean
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    //Metod för omkretsen
    public double calculateCircumference() {
        return 2*3.14*radius;
    }

    //Lägg til en metod för isBiggerThan
    public boolean isBiggerThan(Circle circle) {

        double area = circle.calculateArea();
        double myArea = 3.14*radius*radius;

        if (myArea > area) {
            return true;
        } else {
            return false;
        }




    }



}
