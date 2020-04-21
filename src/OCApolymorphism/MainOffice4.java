package OCApolymorphism;

public class MainOffice4 {
    public static void main(String[] args) {
         Car1 corolla = new Car1(18000);
         SalesManager.setManagerPrice(corolla);

         Part3 engine = new Part3(3500);
         SalesManager.setManagerPrice(engine);

         Truck2 peterbilt = new Truck2 (80000);
         SalesManager.setManagerPrice(peterbilt);

        /*System.out.println(corolla.managerPrice);
        System.out.println(engine.managerPrice);
        System.out.println(peterbilt.managerPrice);*/

        ForSale[] arr = new ForSale[] {corolla,engine,peterbilt};
        SalesManager.setManagerPrice(arr);
    }
}
