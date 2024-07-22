/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alekseynesterov
 */
public class Viewer {

    private String nickname;

    private int age;

    private int numberViews;

    private final ArrayList<Cinema> films = new ArrayList<>();

    public Viewer(String nickname, int age, List<Cinema> films) {
        this.nickname = (nickname != null && !nickname.isEmpty()) ? nickname : "noname";
        this.age = age > 0 ? age : 0;
        if (films != null && !films.isEmpty()) {
            for (Cinema film : films) {
                if (film != null) {
                    this.films.add(film);
                }
            }
        }
        this.numberViews = this.films.size();

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = (nickname != null && !nickname.isEmpty()) ? nickname : "noname";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age > 0 ? age : 0;
    }

    public int getNumberViews() {
        return numberViews;

    }

    @Override
    public String toString() {
        return "Viewer{" + "nickname=" + nickname + ", age=" + age + ", numberViews=" + numberViews + ", films=" + films + '}';
    }

    public ArrayList<Cinema> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Cinema> films) {
        if (films != null && !films.isEmpty()) {
            for (Cinema film : films) {
                if (film != null) {
                    this.films.add(film);
                }
            }
        }
        this.numberViews = this.films.size();
    }

    public void setFilms(Cinema film) {
        if (film != null) {
            this.films.add(film);
        }
        this.numberViews = this.films.size();
    }

}
