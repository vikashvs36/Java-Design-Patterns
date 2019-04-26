package CreationalDesignPatterns.Factory;

public class MI implements Mobile {

    private String name;
    private String brand;
    private Double screen;

    public MI() {
    }

    public MI(String name, String brand, Double screen) {
        this.name = name;
        this.brand = brand;
        this.screen = screen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getScreen() {
        return screen;
    }

    public void setScreen(Double screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "MI{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", screen=" + screen +
                '}';
    }
}
