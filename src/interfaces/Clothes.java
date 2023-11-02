package interfaces;

public abstract class Clothes {
    private ClothesSize clothesSize;
    private int price;
    private String colour;

    public Clothes(ClothesSize clothes,int price,String colour){
        this.clothesSize = clothes;
        this.price = price;
        this.colour = colour;
    }

    public ClothesSize getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(ClothesSize clothesSize) {
        this.clothesSize = clothesSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}