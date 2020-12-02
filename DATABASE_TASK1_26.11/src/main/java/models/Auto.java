package models;

import javax.persistence.*;

@Entity
@Table(name="autos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String model;

    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Auto(){}

    public  Auto(String model, String color){
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", user=" + user +
                '}';
    }
}
