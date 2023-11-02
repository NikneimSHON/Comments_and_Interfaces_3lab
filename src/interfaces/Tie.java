package interfaces;

public class Tie extends Clothes implements MensClothing{
    public Tie(ClothesSize clothes, int price, String colour) {
        super(clothes, price, colour);
    }
    @Override
    public void dressMen() {

    }
}