package model;

import java.time.LocalDate;

public class Category {
    private Long id;
    private String name;
    private LocalDate create;
    private LocalDate update;

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", create=" + create +
                ", update=" + update +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreate(LocalDate create) {
        this.create = create;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreate() {
        return create;
    }

    public LocalDate getUpdate() {
        return update;
    }
}
