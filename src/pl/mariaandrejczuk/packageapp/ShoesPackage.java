package pl.mariaandrejczuk.packageapp;

public class ShoesPackage {
    private Shoes shoes;

    public ShoesPackage(Shoes shoes) {
        this.shoes = shoes;
    }

    public void send(){
        System.out.println("Send shoes.");
    }
    public void receive(){
        System.out.println("Receive shoes.");
    }
}
