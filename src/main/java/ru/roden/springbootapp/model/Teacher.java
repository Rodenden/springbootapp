package ru.roden.springbootapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name, surname;
    private Integer bornYear;
    private String photoURL;
    private Integer rating;

    public Teacher() {
    }

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname =surname;
    }
}
