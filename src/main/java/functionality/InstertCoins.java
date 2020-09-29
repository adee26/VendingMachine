package functionality;

import vendingMachine.CurrentMoney;

import java.util.Scanner;

public class InstertCoins {
    public static void insertCoins(CurrentMoney currentMoney){
        double coinsAmount = 0;
        int billsAmount = 0;
        System.out.println("Insert money. You can pay using coins or bills");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce bills:  ");
        billsAmount = scanner.nextInt();

        System.out.println("Introduce coins: ");
        coinsAmount = scanner.nextDouble();
        coinsAmount = coinsAmount / 100;

        currentMoney.setAmount(currentMoney.getAmount() + billsAmount + coinsAmount);
        System.out.println("The amount introduced is: " + currentMoney.getAmount());

        System.out.println("Do you want to introduce more money? Y/N");
        char option = scanner.next().charAt(0);

        while(option == 'Y'){
            System.out.println("Introduce bills:  ");
            billsAmount = scanner.nextInt();

            System.out.println("Introduce coins: ");
            coinsAmount = scanner.nextInt();
            coinsAmount = coinsAmount / 100;
            currentMoney.setAmount(currentMoney.getAmount() + coinsAmount + billsAmount);
            System.out.println("The amount introduced is: " + currentMoney.getAmount());

            System.out.println("Do you want to introduce more money? Y/N");
            option = scanner.next().charAt(0);
        }

    }
}
