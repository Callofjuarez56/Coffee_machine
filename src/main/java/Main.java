import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("_________________________");
        System.out.println("Starting to make a coffee");
        System.out.println("_________________________");


       System.out.println("Write how many cups of coffee you will need: ");
       Scanner scan = new Scanner(System.in);
       System.out.println("Add milliliters of water: ");
       int water = scan.nextInt();
       System.out.println("Add milliliters of milk: ");
       int milk = scan.nextInt();
       System.out.println("Add a gram of coffee beans: ");
       int coffee = scan.nextInt();
       System.out.println("How many cups of coffee do you want: ");
       // int rg = scan.nextInt();
       //System.out.println("How many cups of coffee do you want: ");
       int Cups = scan.nextInt();
       System.out.println("you entered : " + Cups);
       water = 200 * Cups;
       milk = 50 * Cups;
       int Coffee_Beans = 15 * Cups;


       System.out.println("For cups of coffee you will need:");
       System.out.println(water  + "ml of water");
       System.out.println(milk + "ml of milk");
       System.out.println(Coffee_Beans + "g of coffee beans");
       int water_recommended = 200;
       int milk_recommended = 50;
       int coffee_recommended = 15;
       boolean result;
       int min;
       int k1 = water/water_recommended;
       int k2 = milk/milk_recommended;
       int k3 = coffee/coffee_recommended;
       //System.out.println(k1);
       //System.out.println(k2);
       //System.out.println(k3);

         min = k1;
         if (k2 < min)
         {
             min = k2;
         }
           else if(k3 < min)
           {
             min = k3;
           }

       int difference;
       System.out.println("How many cups of coffee you will need: ");
       int rg = scan.nextInt();
       difference = min - rg;
       System.out.println("Write how many ml of water the coffee machine has: " +  water);
       System.out.println("Write how many ml of milk the coffee machine has: " + milk);
       System.out.println("Write how many grams of coffee beans the coffee machine has: " + coffee);
       System.out.println("Write how many cups of coffee you will need: " + rg);
       System.out.println("Write the difference: "+ difference);

        if (min < rg)
          {
              System.out.println("No, I can make only "+min+" cup(s) of coffee");
          }
        else if(min <= 0){
            System.out.println("No, I can make only 0 cup(s) of coffee");

        }else if (difference == 0){
            System.out.println("Yes, I can make that amount of coffee");

        }
        else if (difference > 0){
            System.out.println("Yes, I can make that amount of coffee (and even " + difference + " more than that)");
        }


        Scanner scanner = new Scanner(System.in);
        water = 400;
        milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
        int k = 0;
        while (k == 0) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The coffee machine has:");
                        System.out.println(water - 250 + " of water");
                        water = water - 250;
                        System.out.println(milk + " of milk");
                        System.out.println(coffeeBeans - 16 + " of coffee beans");
                        coffeeBeans -= 16;
                        System.out.println(disposableCups - 1 + " of disposable cups");
                        disposableCups -= 1;
                        System.out.println(money + 4 + " of money");
                        money += 4;
                        break;
                    case 2:
                        if (water < 350 )
                        {
                            System.out.println("Sorry, not enough water!");
                            break;
                        }
                        else {
                            System.out.println("The coffee machine has:");
                            System.out.println(water - 350 + " of water");
                            water = water - 350;
                            System.out.println(milk - 75 + " of milk");
                            milk -= 75;
                            System.out.println(coffeeBeans - 20 + " of coffee beans");
                            coffeeBeans -= 20;
                            System.out.println(disposableCups - 1 + " of disposable cups");
                            disposableCups -= 1;
                            System.out.println(money + 7 + " of money");
                            money -= 7;
                            action = "";
                            break;}
                    case 3:
                        System.out.println("The coffee machine has:");
                        System.out.println(water - 200 + " of water");
                        System.out.println(milk - 100 + " of milk");
                        System.out.println(coffeeBeans - 12 + " of coffee beans");
                        System.out.println(disposableCups - 1 + " of disposable cups");
                        System.out.println(money + 6 + " of money");
                        break;
                    default:
                        break;
                }
            }
            if (action.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                int addWater = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int addMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int addCoffee = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int addCups = scanner.nextInt();

                System.out.println("The coffee machine has:");
                System.out.println(water + addWater + " of water");
                System.out.println(milk + addMilk + " of milk");
                System.out.println(coffeeBeans + addCoffee + " of coffee beans");
                System.out.println(disposableCups + addCups + " of disposable cups");
                System.out.println(money + " of money");

            }
            if (action.equals("take")) {
                System.out.println("I gave you $" + money);

                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffeeBeans + " of coffee beans");
                System.out.println(disposableCups + " of disposable cups");
                System.out.println(0 + " of money");
            }
            if (action.equals("remaining")) {

                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffeeBeans + " of coffee beans");
                System.out.println(disposableCups + " of disposable cups");
                System.out.println(money + " of money");
            }
            if (action.equals("exit")) {
                k++;
            }

        }
    }

}


