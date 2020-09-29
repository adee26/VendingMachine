import com.fasterxml.jackson.databind.ObjectMapper;
import functionality.Checkout;
import functionality.InstertCoins;
import functionality.SelectProduct;
import functionality.ShowMenu;
import vendingMachine.CurrentMoney;
import vendingMachine.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //Json

        ObjectMapper objectMapper = new ObjectMapper();

        //Creating products
        Product product1 = new Product();
        product1.setOrderNumber(1);
        product1.setName("Coca-Cola");
        product1.setPrice(2.5);
        objectMapper.writeValue(new File("target/products.json"), product1);

        Product product2 = new Product();
        product2.setOrderNumber(2);
        product2.setName("Still Water");
        product2.setPrice(2.5);

        Product product3 = new Product();
        product3.setName("Sparkling Water");
        product3.setOrderNumber(3);
        product3.setPrice(2.5);

        Product product4 = new Product();
        product4.setOrderNumber(4);
        product4.setName("Bounty Chocolate");
        product4.setPrice(3);

        Product product5 = new Product();
        product5.setOrderNumber(5);
        product5.setName("Mars Chocolate");
        product5.setPrice(3);

        Product product6 = new Product();
        product6.setOrderNumber(6);
        product6.setName("Snickers Chocolate");
        product6.setPrice(3);

        Product product7 = new Product();
        product7.setOrderNumber(7);
        product7.setName("Chips");
        product7.setPrice(4);

        Product product8 = new Product();
        product8.setOrderNumber(8);
        product8.setName("Ham Sandwich");
        product8.setPrice(5);

        Product product9 = new Product();
        product9.setOrderNumber(9);
        product9.setName("Chicken Sandwich");
        product9.setPrice(7.5);

        //creating productsList
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);

        //showing menu
        ShowMenu.showMenu(productList);

        //choosing product
        Product chosenProduct = SelectProduct.chooseProduct(productList);

        //display product
        SelectProduct.displayProduct(chosenProduct);

        //insert coins
        CurrentMoney currentMoney = new CurrentMoney();
        InstertCoins.insertCoins(currentMoney);

        //purchase product
        Checkout.checkout(currentMoney, chosenProduct);

    }
}
