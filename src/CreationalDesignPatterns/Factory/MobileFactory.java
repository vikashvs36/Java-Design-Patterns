package CreationalDesignPatterns.Factory;

public class MobileFactory {

//    static Mobile mobile;

    public static Mobile getMobile(String type, String brand, Double screen){
        if (type != null){
            if (type.equalsIgnoreCase("samsung")) {
                return new MI(type, brand, screen);
            } else if (type.equalsIgnoreCase("MI")) {
                return new Samsung(type, brand, screen);
            }
            return null;
        }
        return null;
    }
}
