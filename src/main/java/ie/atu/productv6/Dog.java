package ie.atu.productv6;

import java.text.NumberFormat;
import java.util.Locale;


public class Dog extends Animal {


    private String breed;
    private String colour;
    private double age;
    private double price;
    protected static int count = 0;

    public Dog() {
        colour = "";
        age = 0.0;
        breed = "";
        count++;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }



    public String getPriceFormatted() {
        Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GR").build();
        NumberFormat currency = NumberFormat.getCurrencyInstance(cLocale);
        return currency.format(age);
    }

    public String toString() {
        return breed + " and " + age;
    }

    public static int getCount() {
        return count;
    }
}
