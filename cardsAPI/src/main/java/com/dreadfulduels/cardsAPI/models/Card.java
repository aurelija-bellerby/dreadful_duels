package com.dreadfulduels.cardsAPI.models;

import jakarta.persistence.*;
// card model
@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int attack;
    private int defence;
    private String description;
    private String imgUrl;

    public Card(String name, int attack, int defence, String description, String imgUrl) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public Card (){
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
