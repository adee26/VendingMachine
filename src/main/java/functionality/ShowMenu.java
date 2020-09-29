package functionality;
import vendingMachine.Product;
import java.util.List;

public class ShowMenu {
    public static void showMenu(List<Product> productsList){
        System.out.println("Hello! Today you can choose from the following products: ");
        System.out.println("========================================");
        for(Product product: productsList){
            System.out.println(product.getOrderNumber() + ". " + product.getName() + " - " + product.getPrice() + " ron");
        }
        System.out.println("========================================");
        System.out.println("Please choose the number of your product: ");
    }
}
