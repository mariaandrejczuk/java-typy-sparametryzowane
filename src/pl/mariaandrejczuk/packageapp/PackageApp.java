package pl.mariaandrejczuk.packageapp;

import java.util.Scanner;

public class PackageApp {
    public static void main(String[] args) {
        System.out.println("--------Package App--------");
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Package<Shoes> shoesPackage = null;
        Package<Flour> flourPackage = null;

        int option;
        do {
            System.out.println("1 - send package");
            System.out.println("2 - receive package");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    displaySubMenu();
                    option = scanner.nextInt();
                    scanner.nextLine();

                    displaySubMenu();
                    switch (option) {
                        case 1:
                            System.out.print("Brand: ");
                            String brand = scanner.nextLine();
                            System.out.print("Size: ");
                            int size = scanner.nextInt();
                            Shoes shoes = new Shoes(brand, size);
                            //  ShoesPackage shoesPackage = new ShoesPackage(shoes);
                            //  shoesPackage.send();
                            shoesPackage = new Package<>(shoes);
                            shoesPackage.send();
                            break;
                        case 2:
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Weight: ");
                            double weight = scanner.nextDouble();
                            Flour flour = new Flour(name, weight);
                            //FlourPackage flourPackage = new FlourPackage(flour);
                            flourPackage = new Package<>(flour);
                            boolean sended = flourPackage.send();
                            break;
                    }
                    break;
                case 2:
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            Shoes shoes = shoesPackage.receive();
                            break;

                        case 2:
                            Flour flour = flourPackage.receive();
                            break;
                    }
            }

        } while (option != -1);
    }

    private static void displaySubMenu() {
        System.out.println("1 - shoes");
        System.out.println("2 - flour");
    }

}

