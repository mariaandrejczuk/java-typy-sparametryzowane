package pl.mariaandrejczuk.infoapp;

public class Person <T extends Number, C>{
    private String name;
    private String surname;
    private T indentifier;
    private C postalcode;

    public Person(String name, String surname, T indentifier) {
        this.name = name;
        this.surname = surname;
        this.indentifier = indentifier;
    }

    public Person(String name, String surname, T indentifier, C postalcode) {
        this.name = name;
        this.surname = surname;
        this.indentifier = indentifier;
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", indentifier=" + indentifier +
                ", postalcode=" + postalcode +
                '}';
    }
}
