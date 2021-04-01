package model;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private Long id;
    private String name;
    private String description;
    private LocalDate dateOfCompletion;
    private String performed;
    private User user;
    private List<Task> categories;


    public Task(Long id, String name, String description, LocalDate dateOfCompletion, String performed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateOfCompletion = dateOfCompletion;
        this.performed = performed;
    }

    public Task(Long id) {
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateOfCompletion=" + dateOfCompletion +
                ", performed='" + performed + '\'' +
                ", user=" + user +
                ", categories=" + categories +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateOfCompletion(LocalDate dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }

    public void setPerformed(String performed) {
        this.performed = performed;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCategories(List<Task> categories) {
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateOfCompletion() {
        return dateOfCompletion;
    }

    public String getPerformed() {
        return performed;
    }

    public User getUser() {
        return user;
    }

    public List<Task> getCategories() {
        return categories;
    }
}
