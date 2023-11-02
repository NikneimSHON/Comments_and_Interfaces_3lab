package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Clothes> clothes = new ArrayList<>();
        clothes.add(new Shirt(ClothesSize.S,13,"RED"));
        clothes.add(new Skirt(ClothesSize.L,30,"Black"));
        clothes.add(new Tie(ClothesSize.XXS,15,"YELLOW"));
        clothes.add(new Trousers(ClothesSize.XS,35,"BLUE"));
        Atelier.dressMen(clothes);
        System.out.println("----------------------");
        Atelier.dressWomen(clothes);

    }
}