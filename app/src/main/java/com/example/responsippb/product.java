package com.example.responsippb;

public class product {
    private int id;
    private String title;
    private String price;
    private int image;
    private String des;

    public product(int id, String title, String price, int image, String des) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.image = image;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public String getDes() {
        return des;
    }
}
