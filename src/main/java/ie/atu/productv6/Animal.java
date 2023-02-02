package ie.atu.productv6;
import java.text.NumberFormat;

public class Animal {

        private String breed;
        private String colour;
        private int age;
        private double price;
        protected int count = 0;

        public Animal() {
            this.breed = "";
            this.age = 0;
            this.price = 0;
        }
        public Animal(String type, int age, String breed, Double price) {
            this.breed = breed;
            this.age = age;
            this.price = price;
        }

        public void setBreed(String code ) {
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public String getColour() {
            return colour;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getPriceFormatted() {
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            return currency.format(price);
        }

        @Override
        public String toString() {
            return;

        }


