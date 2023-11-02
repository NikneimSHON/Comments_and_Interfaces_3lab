package interfaces;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(ClothesSize clothes, int price, String colour) {
        super(clothes, price, colour);
    }
    @Override
    public void dressWomen() {

    }
}