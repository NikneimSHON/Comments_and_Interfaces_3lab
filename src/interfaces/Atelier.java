package interfaces;

import java.util.ArrayList;

public class Atelier {
    public static void dressWomen(ArrayList<Clothes> clothesArray) {
        System.out.println("Одежда для женщин:");
        for (Clothes clothing : clothesArray) {
            if (clothing instanceof WomenClothing) {
                System.out.println("Тип одежды: " + clothing.getClass().getSimpleName());
                System.out.println("Размер: " + clothing.getClothesSize().getDescription() + " " + clothing.getClothesSize() );
                System.out.println("Стоимость: " + clothing.getPrice());
                System.out.println("Цвет: " + clothing.getColour());
                ((WomenClothing) clothing).dressWomen();
                System.out.println();
            }
        }
    }

    public static void dressMen(ArrayList<Clothes> clothesArray) {
        System.out.println("Одежда для мужчин:");
        for (Clothes clothing : clothesArray) {
            if (clothing instanceof MensClothing) {
                System.out.println("Тип одежды: " + clothing.getClass().getSimpleName());
                System.out.println("Размер: " + clothing.getClothesSize());
                System.out.println("Стоимость: " + clothing.getPrice());
                System.out.println("Цвет: " + clothing.getColour());
                ((MensClothing) clothing).dressMen();
                System.out.println();
            }
        }
    }
}