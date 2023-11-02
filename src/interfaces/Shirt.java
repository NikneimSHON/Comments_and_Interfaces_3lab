package interfaces;

public class Shirt extends Clothes implements WomenClothing,MensClothing{
    public Shirt(ClothesSize clothes, int price, String colour) {
        super(clothes, price, colour);
    }

    @Override
    public void dressMen(){

    }
    @Override
    public void dressWomen() {

    }
}