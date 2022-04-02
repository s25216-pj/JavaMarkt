package pl.pjatk.javamarkt;

public class Discount300plus implements ICanCalculateSpecialOffer{

    @Override
    public boolean canCalculate(Cart cart) {
        CartService cartService = new CartService();
        return cartService.getSumOfCart(cart) > 300;
//        return cart.getTotalPrice() > 300;
    }

    @Override
    public void calculateOffer(Cart cart) {
        for(Product product: cart.getProducts()){
            product.setDiscountPrice(0.95 * product.getPrice());
        }
    }
}
