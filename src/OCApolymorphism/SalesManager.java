package OCApolymorphism;

public class SalesManager {
    /*public static void setCarManagerPrice(Car1 car){
        car.setManagerPrice(car.stickerPrice * 0.75);
    }

    public static void setTruckManagerPrice(Truck2 truck){
        truck.setManagerPrice(truck.stickerPrice * 0.9);
    }

    public static void setPartManagerPrice(Part3 part){
        part.setManagerPrice(part.stickerPrice * 0.8);
    }*/

    public static void setManagerPrice(ForSale item){
        item.setManagerPrice(0.75);
    }

    public static void setManagerPrice(ForSale[] items){
        for(ForSale item:items){
            item.setManagerPrice(0.75);
        }
    }

}
