package com.youngchan.ClassReview.animaltest;

import java.util.Objects;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.ClassReview
 * @date 2022/11/14 17:23
 * @Description //继承  行为接口  的抽象类 动物接口
 */
public abstract class Animal implements AnimalBehavior {
    private String type ;
    private String color;
    private String breed;


    @Override
    public abstract void eat();

    @Override
    public String sayOut() {

        String s = getColor() + "的" + getBreed() + this.type;
        return s;
    }

    public Animal(String type, String color, String breed) {
        this.type = type;
        this.color = color;
        this.breed = breed;
    }

    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return type.equals(animal.type) && color.equals(animal.color) && breed.equals(animal.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, breed);
    }
}
