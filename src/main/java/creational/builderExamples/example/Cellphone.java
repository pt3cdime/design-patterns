package creational.builderExamples.example;

public class Cellphone {
    private String model;
    private String size;
    private boolean touch;
    private String batteryLife;
    private String color;

    public Cellphone(String model, String size, boolean touch, String batteryLife, String color) {
        this.model = model;
        this.size = size;
        this.touch = touch;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public Cellphone(String model, String size, boolean touch, String batteryLife) {
        this.model = model;
        this.size = size;
        this.touch = touch;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public Cellphone(String model, String size, boolean touch) {
        this.model = model;
        this.size = size;
        this.touch = touch;
    }
}
