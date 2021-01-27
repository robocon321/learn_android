package com.example.learnandroid.utils;

public class Course {
    private String name;
    private int price;
    private int image;

    public Course(String name, int price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", image=" + image +
                '}';
    }
}
