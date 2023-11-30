package homeworks.hw20;

public class Calculator {

    public static void price(Burger bg) {
        Integer sum = 0;
        Integer ingrPrice = 0;
        for (int i = 0; i < bg.getIngr().size(); i++) {
            ingrPrice += BurgersEnum.getIngredientPrice(bg.getIngr().get(i));
        }

        sum = BurgersEnum.getSizePrice(bg.getSize()) + BurgersEnum.getMeatPrice(bg.getMeat()) + ingrPrice;
        System.out.println("Стоимость бургера: " + sum);
    }
}
