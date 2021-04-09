package pl.mariaandrejczuk.packageapp;

public class Flour extends Product {
    private String name;
    private double weight;

    public Flour(double price, String name, double weight) {
        super(price);
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Flour{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
