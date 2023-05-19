package org.example.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameCategorie;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "categorie_task",joinColumns = @JoinColumn(name ="categorie_id"),
            inverseJoinColumns = @JoinColumn(name="task_id"))
    private List<Task> taskList = new ArrayList<>();

    public Categorie() {
    }

    public Categorie(String categorieName) {
    }

    public Categorie(Long id, String nameCategorie) {
        this.id = id;
        this.nameCategorie = nameCategorie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategorie() {
        return nameCategorie;
    }

    public void setNameCategorie(String nameCategorie) {
        this.nameCategorie = nameCategorie;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nameCategorie='" + nameCategorie + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
