import instruments.Drumkit;
import instruments.Guitar;
import instruments.Piano;
import instruments.Trumpet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    private static Shop shop;
    private static Scanner scan = new Scanner(System.in);
    private static boolean exit = false;

    public static void main(String[] args) {
        setup();
        loop();
        System.out.println("Bye!");
    }

    private static void setup() {
        scan = new Scanner(System.in);
        System.out.println("Welcome! What would you like your shop to be called?");
        String name = scan.nextLine();
        System.out.println("Cool! Your shop will be called " + name);
        System.out.println("You can't have a shop without stumping up some capital though! How much money do you have on you?");
        int money = (int) (scan.nextDouble() * 100);
        shop = new Shop(name, money);
    }

    public static void loop() {
        while (!exit) {
            System.out.println("Welcome to " + shop.getName() + ", the shop!");
            System.out.println("What do you want to do?");
            System.out.println("1. Purchase stock");
            System.out.println("2. Check money in the till");
            System.out.println("3. How much money could you make if you sold everything?");
            System.out.println("9. Leave");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    purchase();
                    break;
                case 2:
                    System.out.println("There's " + currency(shop.getTill()) + " left in the till.");
                    break;
                case 3:
                    System.out.println("You stand to make: " + currency(shop.potentialProfit()));
                    break;
                case 9:
                    exit = true;
                    break;
            }
        }
    }

    public static void purchase() {
        String colour;
        String brand;
        int bought;
        int sell;
        System.out.println("Would you like to purchase:");
        System.out.println("1.  A piano?");
        System.out.println("2.  A guitar?");
        System.out.println("3.  A drumkit?");
        System.out.println("4.  A trumpet?");
        System.out.println("Type a number...");
        int choice = scan.nextInt();
        System.out.println("You chose: " + choice);
        scan.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Cool! A piano. There's loads to choose from!");
                System.out.println("What colour do you want?");
                colour = scan.nextLine();
                System.out.println(colour + ", awesome. What brand is it?");
                brand = scan.nextLine();
                System.out.println(brand + "! Nice choice! How many keys does it have?");
                int keys = scan.nextInt();
                System.out.println("OK, and how many pedals?");
                int pedals = scan.nextInt();
                System.out.println("Alright! How much do you want to buy it for? It's up to you! £__.__");
                bought = (int) (scan.nextDouble() * 100);
                if (bought > shop.getTill()) {
                    System.out.println("Uh oh! You can't afford that!");
                    break;
                }
                System.out.println("Great price! How much do you want to sell it for? It's up to you! £__.__");
                sell = (int) (scan.nextDouble() * 100);
                Piano piano = new Piano(colour, brand, bought, sell, keys, pedals);
                shop.buy(piano);
                System.out.println("Thanks for purchasing a piano!");
                break;
            case 2:
                System.out.println("A guitar? Ok then!");
                System.out.println("What colour is it?");
                colour = scan.nextLine();
                System.out.println("Nice! What brand is it?");
                brand = scan.nextLine();
                System.out.println("Great choice! Is it an electric guitar? true/false");
                boolean electric = scan.nextBoolean();
                System.out.println("How many strings does it have?");
                int strings = scan.nextInt();
                System.out.println("How much are you going to pay for it? £__.__");
                bought = (int) (scan.nextDouble() * 100);
                if (bought > shop.getTill()) {
                    System.out.println("Uh oh! You can't afford that!");
                    break;
                }
                System.out.println("Great price! How much do you want to sell it for? It's up to you! £__.__");
                sell = (int) (scan.nextDouble() * 100);
                Guitar guitar = new Guitar(strings, electric, colour, brand, bought, sell);
                shop.buy(guitar);
                System.out.println("Congrats! You bought a guitar!");
                break;
            case 3:
                System.out.println("DRUMS");
                System.out.println("What colour is it?");
                colour = scan.nextLine();
                System.out.println("Nice! What brand is it?");
                brand = scan.nextLine();
                System.out.println("How many drums are in the kit?");
                int drums = scan.nextInt();
                System.out.println("Neat, and how many cymbals?");
                int cymbals = scan.nextInt();
                System.out.println("How much are you going to pay for it? £__.__");
                bought = (int) (scan.nextDouble() * 100);
                if (bought > shop.getTill()) {
                    System.out.println("Uh oh! You can't afford that!");
                    break;
                }
                System.out.println("Great price! How much do you want to sell it for? It's up to you! £__.__");
                sell = (int) (scan.nextDouble() * 100);
                Drumkit drumkit = new Drumkit(colour, brand, bought, sell, drums, cymbals);
                shop.buy(drumkit);
                System.out.println("I hope you won't annoy the neighbours! You bought a drumkit!");
                break;
            case 4:
                System.out.println("A trumpet eh? Good call");
                System.out.println("It's probably gold, but just in case: What colour is it?");
                colour = scan.nextLine();
                System.out.println("Cool! What brand is it?");
                brand = scan.nextLine();
                System.out.println("How much are you going to pay for it? £__.__");
                bought = (int) (scan.nextDouble() * 100);
                if (bought > shop.getTill()) {
                    System.out.println("Uh oh! You can't afford that!");
                    break;
                }
                System.out.println("Great price! How much do you want to sell it for? It's up to you! £__.__");
                sell = (int) (scan.nextDouble() * 100);
                Trumpet trumpet = new Trumpet(colour, brand, bought, sell);
                shop.buy(trumpet);
                System.out.println("I hope you enjoy your new trumpet");
                break;
            default:
                System.out.println("Hmm, I don't understand.");
                break;
        }
    }

    public static String currency(int input) {
        double figure = (double)input / 100;
        return String.format("£%s", figure);
    }
}

