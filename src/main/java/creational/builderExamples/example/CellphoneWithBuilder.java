package creational.builderExamples.example;

import creational.builderExamples.classicBuilder.House;

public class CellphoneWithBuilder {

    private String model;
    private String size;
    private boolean touch;
    private String batteryLife;
    private String color;


    private CellphoneWithBuilder(Builder builder) {
        this.model = builder.model;
        this.size = builder.size;
        this.touch = builder.touch;
        this.batteryLife = builder.batteryLife;
        this.color = builder.color;
    }

    public static class Builder {
        private String model;
        private String size;
        private boolean touch;
        private String batteryLife;
        private String color;

        public CellphoneWithBuilder.Builder model (String model) {
            this.model = model;
            return this;
        }

        public CellphoneWithBuilder.Builder size (String size) {
            this.size = size;
            return this;
        }

        public CellphoneWithBuilder.Builder touch (boolean touch) {
            this.touch = touch;
            return this;
        }

        public CellphoneWithBuilder.Builder batteryLife (String batteryLife) {
            this.batteryLife = batteryLife;
            return this;
        }

        public CellphoneWithBuilder.Builder color (String color) {
            this.color = color;
            return this;
        }

        public CellphoneWithBuilder build(){
            return new CellphoneWithBuilder(this);
        }
    }
}
