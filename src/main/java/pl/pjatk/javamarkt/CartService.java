package pl.pjatk.javamarkt;
        ;

        import java.util.ArrayList;
        import java.util.List;

public class CartService {

    public Product getCheapestOne(List<Product> products) {
        Product temporaryProduct = new Product();
        temporaryProduct.setPrice(999999);
        for (Product product : products) {
            if (product.getPrice() <= temporaryProduct.getPrice()) {
                temporaryProduct = product;
            }
        }
        return temporaryProduct;
    }

    public Product getExpensiveOne(List<Product> products) {
        Product temporaryProduct = new Product();
        temporaryProduct.setPrice(0);
        for (Product product : products) {
            if (product.getPrice() >= temporaryProduct.getPrice()) {
                temporaryProduct = product;
            }
        }
        return temporaryProduct;
    }

    public Product[] sortProductsByName(Product[] products) {
        return products;
    }

    public static Product[] sortProductsByPrice(List<Product> products) {

        return products.toArray(new Product[0]);
    }
    public static double getSumOfCart(Cart cart) {
        double totalPrice = 0;
        for (Product product : cart.getProducts()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public static List<Product> getnCheapestOne(List<Product> products, int n) {
        sortProductsByPrice(products);
        List<Product> temporaryList = new ArrayList();
        for (int i = 0; i <= n - 1; i++) {
            temporaryList.add(products.get(i));
        }
        return temporaryList;
    }
    public static List<Product> getnExpensiveOne(List<Product> products, int n) {
        sortProductsByPrice(products);
        List<Product> temporaryList = new ArrayList();
        for (int i = products.size() - 1; i >= products.size() - n; i--){
            temporaryList.add(products.get(i));
        }
        return temporaryList;
    }
}
