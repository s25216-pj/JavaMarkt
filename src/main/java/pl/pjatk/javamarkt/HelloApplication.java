package pl.pjatk.javamarkt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HelloApplication {

    public static void main(String[] args) {
        Product product = new Product();
        product.setCode("12344");
        product.setDiscountPrice(0.0);
        product.setPrice(350.00);
        product.setName("Cukier");
        int how_many = 1;

        Product product2 = new Product("232", "mleko", 10.0, 0.0);
        Product product3 = new Product("234", "kawa", 5.0, 0.0);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList.add(new Product("111", "woda", 2.0, 0.0));
        productList.add(new Product("125", "piwo", 3.0, 0.0));

        Cart cart = new Cart();
        cart.setProducts(productList);

        System.out.println(cart.toString());

        System.out.println("Cart after discount: ");
        ICanCalculateSpecialOffer discount300Plus = new Discount300plus();
        ICanCalculateSpecialOffer freeCup = new ApplyFreeCup();
        ICanCalculateSpecialOffer thirdForFree = new ApplyDiscountThirdForFree();
        cart.applyDiscount(discount300Plus);
        cart.applyDiscount(thirdForFree);
        cart.applyDiscount(freeCup);

        System.out.println(CartService.getnCheapestOne(productList, how_many));
        System.out.println(CartService.getnExpensiveOne(productList, how_many));
    }
};
