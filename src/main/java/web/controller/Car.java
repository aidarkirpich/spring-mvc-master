package web.controller;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Car {
    private String model;
    private int probeg;
    private int price;

    public Car () {}

    public Car(String model, int probeg, int price) {
        this.model = model;
        this.probeg = probeg;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
