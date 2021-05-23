import java.util.*;

public class User {

    public static Map<Integer, User> allUsers;
    private static int countId = 0;

    private int id;
    private String name;
    private int age;
    private Sex sex;

    public User( String name, int age, Sex sex) {
        if (allUsers == null){
            allUsers = new HashMap<>();
        }
        this.name = name;
        this.age = age;
        this.sex = sex;

        if (!hasUser()){
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }

    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User" +
                "\n id=" + id +
                "\n name=" + name + '\'' +
                "\n age=" + age +
                "\n sex=" + sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name) && sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }

    // формирует список всех пользователей
    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }

    // формирует список пользователей по полу
    public static List<User> getAllUsers(Sex sex){
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.sex == sex){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    // возвращает количество пользователей в общем списке
    public static int getHowManyUsers(){
        return allUsers.size();
    }

    // возвращает количество пользователей по признаку пола пользователя
    public static int getHowManyUsers(Sex sex){
        return getAllUsers(sex).size();
    }

    // возвращает общую сумму по возрасту пользователей
    public static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }

    // возвращает общую сумму по возрасту пользователей, учитывая признак пола
    public static int getAllAgeUsers(Sex sex){
        int countAge = 0;
        for (User user : getAllUsers(sex)){
            countAge += user.age;
        }
        return countAge;
    }

    // средний возраст всех пользователей
    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyUsers();
    }

    // средний возраст всех пользователей, учитывая признак пола
    public static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }
}
