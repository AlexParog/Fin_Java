import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class UserTest {
    private User user;
    private User user1;
    private User user2;

    @BeforeEach
    public void setUp() throws Exception {
        user = new User("Александр", 20, Sex.MALE);
        user1 = new User("Антон", 19, Sex.MALE);
        user2 = new User("Влада", 19, Sex.FEMALE);
    }

    @AfterEach
    public void endTest(){
        User.allUsers.clear();
    }

    @Test
    public void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersNotNull() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsersMale() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersMaleNotnull() {

        List<User> expected = User.getAllUsers(Sex.MALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsersFemale() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsersFemaleNotNull() {

        List<User> expected = User.getAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsersMale() {
        int expected = User.getHowManyUsers(Sex.MALE);

        int actual = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsersFemale() {
        int expected = User.getHowManyUsers(Sex.FEMALE);

        int actual = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();

        int actual = 58;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsersMale() {
        int expected = User.getAllAgeUsers(Sex.MALE);

        int actual = 39;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsersFemale() {
        int expected = User.getAllAgeUsers(Sex.FEMALE);

        int actual = 19;

        Assert.assertEquals(expected, actual);
    }
}