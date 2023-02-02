package ie.atu.productv6;

import java.text.NumberFormat;
import java.util.Locale;

public class Tv {

    private String manufacture;
    private String code;
    private String description;
    private String size;
    private double price;
    protected static int count = 0;

    public Tv() {
        description = "";
        code = "";
        manufacture = "";
        price = 0.0;
        size = "";
        count++;
    }


    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getArtist() {
        return manufacture;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getPriceFormatted() {
        Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GR").build();
        NumberFormat currency = NumberFormat.getCurrencyInstance(cLocale);
        return currency.format(price);
    }

    public String toString() {
        return description + " by " + manufacture;
    }

    public static int getCount() {
        return count;
    }
}

