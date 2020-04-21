package OCApolymorphism;

public class Part3 implements ForSale{
    public int stickerPrice;
    public double managerPrice;

    public Part3(int stickerPrice){
        this.stickerPrice = stickerPrice;
    }
    public void setManagerPrice(double discountRate){
        this.managerPrice = stickerPrice * discountRate;
    }

}
