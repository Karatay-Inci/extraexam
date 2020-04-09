package OCA;

public class A3AfterMethod {
    public static void main(String[] args) {
        printDistricts(5,"Austin");
        printDistricts(10,"Houston");
        printDistricts(15,"Phoenix");

        System.out.println(getCityDetails("Austin"));
    }
    public static void printDistricts(int maxDistrictCount, String cityName){
        System.out.println("My city :" + cityName);
        for (int i = 1; i <maxDistrictCount ; i++) {
            System.out.println("District: "+ i);
        }
    }
    public static String getCityDetails(String cityName){
        String zipCode = getZipCode(cityName);
        String state = getStateName(cityName);

        return zipCode + " " + state;
    }
    public static String getZipCode(String cityName){
        System.out.println("Zip Code:");
        return "12345";
    }
    public static String getStateName(String cityName){
        System.out.println("State Name:");
        return "NY";
    }



}
