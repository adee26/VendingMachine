package functionality;

import vendingMachine.CurrentMoney;
import vendingMachine.Product;

import java.util.Scanner;

public class Checkout {
    public static void checkout(CurrentMoney currentMoney, Product product){
        System.out.println("========================================");
        System.out.println("Do you want to proceed to the checkout? Y/N ");
        Scanner scanner = new Scanner(System.in);
        char option = scanner.next().charAt(0);
        if(option == 'Y'){
            while(product.getPrice() > currentMoney.getAmount()) {
                System.out.println("Not enough money. Please introduce more money.");
                InstertCoins.insertCoins(currentMoney);
            }
            if(product.getPrice() <= currentMoney.getAmount()) {
                System.out.println("Please lift the product from the box.");
                double remainder = currentMoney.getAmount() - product.getPrice();
                System.out.println("Remaining change: " + remainder + "ron");
            }
        }else{
            System.out.println("Refunding " + currentMoney.getAmount() + "ron.");
        }
    }
}
