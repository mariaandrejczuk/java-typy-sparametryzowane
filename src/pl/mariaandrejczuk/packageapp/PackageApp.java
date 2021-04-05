package pl.mariaandrejczuk.packageapp;

import java.util.Scanner;

public class PackageApp {
    public static void main(String[] args) {
        System.out.println("--------Package App--------");
        Scanner scanner = new Scanner(System.in, "UTF-8");

        int option;
        do{
            System.out.println("1 - send package");
            System.out.println("2 - receive package");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    displaySubMenu();
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch(option){
                        case 1:
                            System.out.print("Brand: ");
                            String brand = scanner.nextLine();
                            System.out.print("Size: ");
                            int size = scanner.nextInt();
                            Shoes shoes = new Shoes(brand, size);
                            ShoesPackage shoesPackage = new ShoesPackage(shoes);
                            shoesPackage.send();
                        case 2:
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Weight: ");
                            double weight = scanner.nextDouble();
                            Flour flour = new Flour(name, weight);
                            FlourPackage flourPackage = new FlourPackage(flour);
                            flourPackage.send();
                    }
                    break;
            }

        }while(option!= -1);
    }
    private static void displaySubMenu(){
        System.out.println("1 - shoes");
        System.out.println("2 - flour");
    }

}

