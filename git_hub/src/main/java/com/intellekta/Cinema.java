/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta;

/**
 *
 * @author alekseynesterov
 */
public class Cinema {

    private String name;

    private String genre;

    private double duration;

    public Cinema(String name, String genre, double duration) {
        this.name = (name != null && !name.isEmpty()) ? name : "noname";
        this.genre = (genre != null && !genre.isEmpty()) ? genre : "nogenre";
        this.duration = duration > 0 ? duration : 0;
    }

    public Cinema() {
        this.name = "noname";
        this.genre = "nogenre";
        this.duration = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name != null && !name.isEmpty()) ? name : "noname";;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = (genre != null && !genre.isEmpty()) ? genre : "nogenre";
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration > 0 ? duration : 0;;
    }

    @Override
    public String toString() {
        return "Cinema{" + "name=" + name + ", genre=" + genre + ", duration=" + duration + '}';
    }

}
