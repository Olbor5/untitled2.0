package Exercise09;

import CalcExercise.Calculator01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExercise {

    @Test
    public void firstTestCase() {

        String text = "some text"; //Testdata som vi skapar
        int actual = text.length(); //Använder en metod och får ut ett resultat som sparas i actual
        int expected = 9; //Lägger det förväntade värdet i expected

        assertEquals(expected, actual);
    }

    @Test
    public void add() {

        //Arrange
        Calculator01 calc = new Calculator01(2,3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);

    }


}
