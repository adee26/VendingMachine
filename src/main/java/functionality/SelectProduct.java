package functionality;

import vendingMachine.Product;

import java.util.List;
import java.util.Scanner;

public class SelectProduct {
    public static Product chooseProduct(List<Product> productsList){
        Scanner scanner = new Scanner(System.in);
        int productNumber = scanner.nextInt();
        for(Product product : productsList){
            if(product.getOrderNumber() == productNumber){
                return product;
            }
        }

        return null;
    }

    public static void displayProduct(Product product){
        System.out.println("Your selection is: " + product.getOrderNumber() + ". " + product.getName() + " - " +
                product.getPrice() + "ron");
        System.out.println("========================================");
    }
}
