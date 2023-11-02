package interfaces;

public enum ClothesSize {
    XXS (32),
    XS (34),
    S (36),
    M (38),
    L (40);
    private int euroSize;

    ClothesSize(int euroSize){
        this.euroSize = euroSize;
    }
    public String getDescription(){
        if(this == XXS){
            return "Детский размер";
        }
        else{
            return "Взрослый размер";
        }
    }
}
