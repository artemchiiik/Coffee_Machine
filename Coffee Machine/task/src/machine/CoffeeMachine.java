package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hasMachine = {400, 540, 120, 9, 550};
        //showHasMachine(hasMachine);
        boolean flag = true;

        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String doAction = scanner.next();

            switch (doAction) {
                case ("buy"): {
                    buy(hasMachine);
                    System.out.println();
                    break;
                }
                case ("fill"): {
                    fill(hasMachine);
                    break;
                }
                case ("take"): {
                    take(hasMachine);
                    break;
                }
                case ("remaining"): {
                    showHasMachine(hasMachine);
                    break;
                }
                case ("exit"): {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void showHasMachine(int[] hasMachine) {
        System.out.println("The coffee machine has:");
        System.out.println(hasMachine[0] + " ml of water");
        System.out.println(hasMachine[1] + " ml of milk");
        System.out.println(hasMachine[2] + " g of coffee beans");
        System.out.println(hasMachine[3] + " disposable cups");
        System.out.println("$" + hasMachine[4] + " of money");
        System.out.println();
    }

    public static void buy(int[] hasMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String whatCoffee = scanner.next();

        switch (whatCoffee){
            case ("1"):{
                int water = 250;
                int milk = 0;
                int coffee = 16;
                int cups = 1;
                int price = 4;
                if (hasMachine[0] >= water && hasMachine[2] >= coffee && hasMachine[3] >= cups) {
                    changeResours(hasMachine, water, milk, coffee, cups, price);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else {
                    String strRes;
                    if (hasMachine[0] < water){
                        strRes = "Sorry, not enough water!";
                        if (hasMachine[2] < coffee){
                            strRes = "Sorry, not enough water, coffee!";
                            if (hasMachine[3] < cups){
                                strRes = "Sorry, not enough water, coffee, disposable cups!";
                            }
                        }
                    }
                    else if (hasMachine[2] < coffee){
                        strRes = "Sorry, not enough coffee!";
                        if (hasMachine[3] < cups) {
                            strRes = "Sorry, not enough coffee, disposable cups!";
                        }
                    }
                    else strRes = "Sorry, not enough disposable cups!";

                    System.out.println(strRes);
                }
                break;
            }
            case ("2"):{
                int water = 350;
                int milk = 75;
                int coffee = 20;
                int cups = 1;
                int price = 7;
                if (hasMachine[0] >= water && hasMachine[1] >= milk && hasMachine[2] >= coffee && hasMachine[3] >= cups) {
                    changeResours(hasMachine, water, milk, coffee, cups, price);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else {
                    String strRes;
                    if (hasMachine[0] < water){
                        strRes = "Sorry, not enough water!";
                        if (hasMachine[1] < milk) {
                            strRes = "Sorry, not enough water, milk!";
                            if (hasMachine[2] < coffee) {
                                strRes = "Sorry, not enough water, milk, coffee!";
                                if (hasMachine[3] < cups) {
                                    strRes = "Sorry, not enough water, milk, coffee, disposable cups!";
                                }
                            }
                        }

                    }
                    else if (hasMachine[1] < milk){
                        strRes = "Sorry, not enough milk!";
                        if (hasMachine[2] < coffee){
                            strRes = "Sorry, not enough milk, coffee!";
                            if (hasMachine[3] < cups) {
                                strRes = "Sorry, not enough milk, coffee, disposable cups!";
                            }
                        }
                    }
                    else if (hasMachine[2] < coffee){
                        strRes = "Sorry, not enough coffee!";
                        if (hasMachine[3] < cups) {
                            strRes = "Sorry, not enough coffee, disposable cups!";
                        }
                    }
                    else strRes = "Sorry, not enough disposable cups!";

                    System.out.println(strRes);
                }
                break;
            }
            case ("3"):{
                int water = 200;
                int milk = 100;
                int coffee = 12;
                int cups = 1;
                int price = 6;
                if (hasMachine[0] >= water && hasMachine[1] >= milk && hasMachine[2] >= coffee && hasMachine[3] >= cups) {
                    changeResours(hasMachine, water, milk, coffee, cups, price);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else {
                    String strRes;
                    if (hasMachine[0] < water){
                        strRes = "Sorry, not enough water!";
                        if (hasMachine[1] < milk) {
                            strRes = "Sorry, not enough water, milk!";
                            if (hasMachine[2] < coffee) {
                                strRes = "Sorry, not enough water, milk, coffee!";
                                if (hasMachine[3] < cups) {
                                    strRes = "Sorry, not enough water, milk, coffee, disposable cups!";
                                }
                            }
                        }

                    }
                    else if (hasMachine[1] < milk){
                        strRes = "Sorry, not enough milk!";
                        if (hasMachine[2] < coffee){
                            strRes = "Sorry, not enough milk, coffee!";
                            if (hasMachine[3] < cups) {
                                strRes = "Sorry, not enough milk, coffee, disposable cups!";
                            }
                        }
                    }
                    else if (hasMachine[2] < coffee){
                        strRes = "Sorry, not enough coffee!";
                        if (hasMachine[3] < cups) {
                            strRes = "Sorry, not enough coffee, disposable cups!";
                        }
                    }
                    else strRes = "Sorry, not enough disposable cups!";

                    System.out.println(strRes);
                }
                break;
            }
            case ("back"):{
                break;
            }
        }
    }

    public static void fill(int[] hasMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int waterAdd = scanner.nextInt();
        hasMachine[0] += waterAdd;
        System.out.println("Write how many ml of milk you want to add:");
        int milkAdd = scanner.nextInt();
        hasMachine[1] += milkAdd;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeAdd = scanner.nextInt();
        hasMachine[2] += coffeeAdd;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cupsAdd = scanner.nextInt();
        hasMachine[3] += cupsAdd;

    }

    public static void take(int[] hasMachine) {
        System.out.println("I gave you $" + hasMachine[4]);
        hasMachine[4] = 0;
        System.out.println();
    }

    public static void changeResours(int[] hasMachine, int water, int milk, int coffee, int cups, int price) {
        hasMachine[0] -= water;
        hasMachine[1] -= milk;
        hasMachine[2] -= coffee;
        hasMachine[3] -= cups;
        hasMachine[4] += price;
    }

    }

