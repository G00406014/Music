package ie.atu.productv4;

import java.text.NumberFormat;
import java.util.Locale;

public class Horse {



    private String breed;
    private String colour;
    private double age;
    private double price;
    protected static int count = 0;

    public Horse() {
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
        return currency.format(price);
    }

    public String toString() {
        return breed + " and " + age;
    }

    public static int getCount() {
        return count;
    }
}
