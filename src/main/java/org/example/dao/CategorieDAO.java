package org.example.dao;

import org.example.model.Categorie;
import org.example.model.Person;
import org.example.model.Task;

import java.util.List;

public interface CategorieDAO {

    public void addCategorie(Categorie categorie);

    public void deleteCategorie(Long id);

    public List<Categorie> getAllCategorie();

    public void addTaskToCategorie(Task task);

    public void deleteTaskToCategorie(Long id);
}
