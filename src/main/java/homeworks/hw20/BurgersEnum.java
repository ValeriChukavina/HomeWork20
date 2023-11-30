package homeworks.hw20;

import java.util.HashMap;

public class BurgersEnum {
    private static final Integer SMALLPRICE = 10;
    private static final Integer MEDIUMPRICE = 20;
    private static final Integer LARGEPRICE = 30;
    private static final Integer BEEFPRICE = 20;
    private static final Integer CHICKENPRICE = 20;
    private static final Integer FISHPRICE = 15;
    private static final Integer INGREDIENTPRICE = 5;



    public enum BurgerSize {
        SMALL, MEDIUM, LARGE;
    }

    public static Integer getSizePrice(String bs) {
        HashMap<String, Integer> sizePrice = new HashMap<>();
        sizePrice.put(String.valueOf(BurgerSize.SMALL), SMALLPRICE);
        sizePrice.put(String.valueOf(BurgerSize.MEDIUM), MEDIUMPRICE);
        sizePrice.put(String.valueOf(BurgerSize.LARGE), LARGEPRICE);
        return sizePrice.get(bs);
    }


    public enum MeatType {
        BEEF, CHICKEN, FISH
    }
    public static Integer getMeatPrice(String mt) {
        HashMap<String, Integer> meatPrice = new HashMap<>();
        meatPrice.put(String.valueOf(MeatType.BEEF), BEEFPRICE);
        meatPrice.put(String.valueOf(MeatType.CHICKEN), CHICKENPRICE);
        meatPrice.put(String.valueOf(MeatType.FISH), FISHPRICE);
        return meatPrice.get(mt);
    }
    public enum Ingredient {
        CHEESE, TOMATO, LETTUCE
    }
    public static Integer getIngredientPrice(String ing) {
        return INGREDIENTPRICE;
    }
}
