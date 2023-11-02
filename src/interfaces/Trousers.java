package interfaces;

public class Trousers extends Clothes implements MensClothing,WomenClothing{
    public Trousers(ClothesSize clothes, int price, String colour) {
        super(clothes, price, colour);
    }
    @Override
    public void dressMen() {

    }

    @Override
    public void dressWomen() {

    }
}