package com.ibrahimkuley.model;

import java.io.Serializable;

/**
 * Created by halil on 15.08.2014.
 */
public class Ogrenci implements Serializable {

    private int id;
    private String name;
    private String firstName;
    private String gender;
    private String languages;

    public Ogrenci() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
