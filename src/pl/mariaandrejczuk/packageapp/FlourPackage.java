package pl.mariaandrejczuk.packageapp;

public class FlourPackage {
    private Flour flour;

    public FlourPackage(Flour flour) {
        this.flour = flour;
    }
    public void send(){
        System.out.println("Send flour.");
    }
    public void receive(){
        System.out.println("Receive flour.");
    }

}

