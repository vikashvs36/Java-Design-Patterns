package CreationalDesignPatterns.Factory;

public class Samsung implements Mobile {

    private String name;
    private String brand;
    private Double screen;

    public Samsung(){}

    public Samsung(String name, String brand, Double screen) {
        this.name = name;
        this.brand = brand;
        this.screen = screen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreen(Double screen) {
        this.screen = screen;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public Double getScreen() {
        return screen;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", screen=" + screen +
                '}';
    }
}
