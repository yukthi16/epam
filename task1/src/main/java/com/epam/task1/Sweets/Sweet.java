package com.epam.task1.Sweets;

import com.epam.task1.chocolates.Chocolate;

public class Sweet {
	private String name;
    private float price;
    private float weight;

    public Sweet(String name, float price, float weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chocolate \n" +
                "Name= " + name + '\n' +
                "Price= " + price + '\n' +
                "Weight= " + weight + '\n';
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int compareTo(Sweet o) {
        return (int) (this.getPrice() - o.getPrice());
    }
}
