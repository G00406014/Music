package ie.atu.productv4;

import java.text.NumberFormat;
import java.util.Locale;

public class music {


    private String artist;
    private String code;
    private String description;
    private String label;
    private double price;
    protected static int count = 0;

    public music() {
        description = "";
        code = "";
        artist = "";
        price = 0.0;
        label = "";
        count++;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
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

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getPriceFormatted() {
        Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GR").build();
        NumberFormat currency = NumberFormat.getCurrencyInstance(cLocale);
        return currency.format(price);
    }

    public String toString() {
        return description + " by " + artist;
    }

    public static int getCount() {
        return count;
    }
}
