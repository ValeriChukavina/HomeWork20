package homeworks.hw20;

import java.util.ArrayList;

public class Burger {
    private String size;
    private String meat;
    private ArrayList<String> ingr;

    public String getSize() {
        return size;
    }

    public String getMeat() {
        return meat;
    }

    public ArrayList<String> getIngr() {
        return ingr;
    }

    public Burger (String size, String meat, ArrayList<String> ingr) {
        this.size = size;
        this.meat = meat;
        this.ingr = new ArrayList<>(ingr);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", meat='" + meat + '\'' +
                ", ingr=" + ingr +
                '}';
    }
}