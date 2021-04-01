package model;

import java.time.LocalDate;
import java.util.List;

public class User {
    private Long id;
    private String login;
    private String name;
    private String surname;
    private String thirdName;
    private LocalDate birthday;
    private List<Task> tasks;

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getThirdName() {
        return thirdName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public User(Long id, String login, String name, String surname, String thirdName, LocalDate birthday) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.thirdName = thirdName;
        this.birthday = birthday;
    }
}
