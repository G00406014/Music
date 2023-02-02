package ie.atu.productv6;

import java.text.NumberFormat;
import java.util.Locale;

public class Horse extends Animal{



    private String dam;
    private String sire;
    private int height;


    public Horse() {
        dam = "";
        height = 0;
        sire = "";
        count++;
    }


    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getdam() {
        return dam;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getSire() {
        return sire;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getheight() {
        return height;
    }




    public String getPriceFormatted() {
        Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GR").build();
        NumberFormat currency = NumberFormat.getCurrencyInstance(cLocale);
        return currency.format(price);
    }

    public String toString() {
        return dam + " and " + sire;
    }

    public static int getCount() {
        return count;
    }
}
