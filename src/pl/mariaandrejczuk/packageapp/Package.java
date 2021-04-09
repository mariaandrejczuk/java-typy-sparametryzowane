package pl.mariaandrejczuk.packageapp;

public class Package<V> implements Operation<V> {
    private V value;

    public Package(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean send() {
        System.out.println("Send package.");
        System.out.println(value);
        return true;
    }

    @Override
    public V receive() {
        System.out.println("Receive package.");
        System.out.println(value);
        return value;
    }
}
