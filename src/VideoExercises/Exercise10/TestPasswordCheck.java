package VideoExercises.Exercise10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testSendingText() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);


    }

}
