package pl.mariaandrejczuk.infoapp;

import java.util.Scanner;

public class InfoApp {
    public static void main(String[] args) {
        System.out.println("-------- Person Info App --------");
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option = 0;
        do {
            System.out.println();
            System.out.println("1 - postalcode in letters");
            System.out.println("2 - postalcode in numbers");
            System.out.println("3 - very long postalcode");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Identifier: ");
                    int identifier = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Postalcode: ");
                    String postalcode = scanner.nextLine();

                    Person<Integer, String> person = new Person<>(name, surname, identifier, postalcode);
                    System.out.println(person);
                    System.out.println();
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Surname: ");
                    String surname1 = scanner.nextLine();
                    System.out.print("Identifier: ");
                    String identifier1 = scanner.nextLine();
                    System.out.print("Postalcode: ");
                    int postalcode1 = scanner.nextInt();
                    Person<String, Integer> person1 = new Person<>(name1, surname1, identifier1, postalcode1);
                    System.out.print(person1);
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name2 = scanner.nextLine();
                    System.out.print("Surname: ");
                    String surname2 = scanner.nextLine();
                    System.out.print("Identifier: ");
                    long identifier2 = scanner.nextLong();
                    Person<Long, Long> person2 = new Person<>(name2, surname2, identifier2);
                    System.out.print(person2);
                    break;
            }
        } while (option != 0);
    }
}
