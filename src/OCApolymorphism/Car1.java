package OCApolymorphism;

public class Car1 implements ForSale{
    public int stickerPrice;
    public double managerPrice;

    public Car1(int stickerPrice){
        this.stickerPrice = stickerPrice;
    }
    public void setManagerPrice(double discountRate){
        this.managerPrice = stickerPrice * discountRate;
    }

}
