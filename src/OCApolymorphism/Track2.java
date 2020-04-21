package OCApolymorphism;

class Truck2 implements ForSale{
    public int stickerPrice;
    public double managerPrice;

    public Truck2(int stickerPrice){
        this.stickerPrice = stickerPrice;
    }
    public void setManagerPrice(double discountRate){
        this.managerPrice = stickerPrice * discountRate;
    }
}
