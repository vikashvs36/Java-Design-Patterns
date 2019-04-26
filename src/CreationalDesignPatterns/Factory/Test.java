package CreationalDesignPatterns.Factory;

public class Test {

    public static void main(String[] args) {
        Mobile mi=MobileFactory.getMobile("Samsung", "M30", 6.4);
        System.out.println(mi);
        Mobile samsung=MobileFactory.getMobile("Mi","View20", 6.4);
        System.out.println(samsung);
        Mobile blank=MobileFactory.getMobile(null, null, null);
        System.out.println(blank);
    }
}
