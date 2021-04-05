package pl.mariaandrejczuk.packageapp;

public class Package<V> {
    private V value;

    public Package(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void send() {
        System.out.println("Send package.");
        System.out.println(value);
    }

    public void receive() {
        System.out.println("Receive package.");
        System.out.println(value);
    }
}
