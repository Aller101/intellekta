/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta;

/**
 *
 * @author alekseynesterov
 */
public class Viewer {

    private String nickname;

    private int age;

    private int numberViews;

    public Viewer(String nickname, int age, int numberViews) {
        this.nickname = (nickname != null && !nickname.isEmpty()) ?  nickname : "noname";
        this.age = age > 0 ? age : 0;
        this.numberViews = numberViews > 0 ? numberViews : 0;
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

    public void setNumberViews(int numberViews) {
        this.numberViews = numberViews > 0 ? numberViews : 0;
    }
    
    @Override
    public String toString() {
        return "Viewer{" + "nickname=" + nickname + ", age=" + age + ", numberViews=" + numberViews + '}';
    }
    
    

}
