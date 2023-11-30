package homeworks.hw20;

import homeworks.hw20.Burger;
import homeworks.hw20.BurgersEnum;
import homeworks.hw20.Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean correctChoice = false;
        String size = "";
        String meat = "";

        while (!correctChoice) {
            System.out.println("Введите размер бургера:");
            System.out.println("1 - " + BurgersEnum.BurgerSize.SMALL);
            System.out.println("2 - " + BurgersEnum.BurgerSize.MEDIUM);
            System.out.println("3 - " + BurgersEnum.BurgerSize.LARGE);
            int choice = scan.nextInt();
            if (choice == 1 | choice == 2 | choice == 3) correctChoice = !correctChoice;
            switch (choice) {
                case 1:
                    size = String.valueOf(BurgersEnum.BurgerSize.SMALL);
                    break;
                case 2:
                    size = String.valueOf(BurgersEnum.BurgerSize.MEDIUM);
                    break;
                case 3:
                    size = String.valueOf(BurgersEnum.BurgerSize.LARGE);
                    break;
                default:
                    System.out.println("ГЛАЗА ОТКРОЙ, СУКА");
                    break;
            }
        }

        correctChoice = !correctChoice;
        while (!correctChoice) {
            System.out.println("Введите тип начинки бургера:");
            System.out.println("1 - " + BurgersEnum.MeatType.BEEF);
            System.out.println("2 - " + BurgersEnum.MeatType.CHICKEN);
            System.out.println("3 - " + BurgersEnum.MeatType.FISH);
            int choice = scan.nextInt();
            if (choice == 1 | choice == 2 | choice == 3) correctChoice = !correctChoice;
            switch (choice) {
                case 1:
                    meat = String.valueOf(BurgersEnum.MeatType.BEEF);
                    break;
                case 2:
                    meat = String.valueOf(BurgersEnum.MeatType.CHICKEN);
                    break;
                case 3:
                    meat = String.valueOf(BurgersEnum.MeatType.FISH);
                    break;
                default:
                    System.out.println("ГЛАЗА ОТКРОЙ, СУКА");
                    break;
            }
        }

        ArrayList<String> ingr = new ArrayList<>();
        correctChoice = !correctChoice;
        while (!correctChoice) {
            boolean completed = false;
            while (!completed) {
                System.out.println("Введите ингредиенты: ");
                System.out.println("1 - " + BurgersEnum.Ingredient.CHEESE);
                System.out.println("2 - " + BurgersEnum.Ingredient.TOMATO);
                System.out.println("3 - " + BurgersEnum.Ingredient.LETTUCE);
                System.out.println("4 - ГОТОВО, создать заказ");
                System.out.println("Выбранные ингредиенты: " + ingr.toString());
                int choice = scan.nextInt();
                if (choice == 1 | choice == 2 | choice == 3 | choice == 4) correctChoice = !correctChoice;
                switch (choice) {
                    case 1:
                        ingr.add(String.valueOf(BurgersEnum.Ingredient.CHEESE));
                        break;
                    case 2:
                        ingr.add(String.valueOf(BurgersEnum.Ingredient.TOMATO));
                        break;
                    case 3:
                        ingr.add(String.valueOf(BurgersEnum.Ingredient.LETTUCE));
                        break;
                    case 4:
                        completed = true;
                        break;
                    default:
                        System.out.println("ГЛАЗА ОТКРОЙ, СУКА");
                        break;
                }
            }
        }
        Burger burger = new Burger(size, meat, ingr);
        Calculator.price(burger);
    }
}