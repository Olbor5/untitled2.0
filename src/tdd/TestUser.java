package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUser {

    @Test
    public void testCreateUser() {
        User myUser = new User("Hej", "Tjena");

    }

    @Test
    public void testGetUserName() {
        User myUser = new User("Hej", "Tjena");
        //Hämta userName ifrån objektet myUser
        String userName = myUser.getUserName();

        //Kontrollera att userName är "Hej"
        assertEquals(userName, "Hej");

    }

    @Test
    public void testGetNormalUserName() {
        User myUser = new User("Staffan", "Tjena");
        //Hämta userName ifrån objektet myUser
        String userName = myUser.getUserName();

        //Kontrollera att userName är "Hej"
        assertEquals(userName, "Staffan");

    }

    @Test
    public void testGetPasswordName() {
        User myUser = new User("Staffan", "Tjena");
        //Hämta password ifrån objektet myUser
        String actual = myUser.getPassword();
        String expected = "Tjena";

        //Kontrollera att passwowrd är "Tjena"
        assertEquals(actual, "Tjena");

    }


}
