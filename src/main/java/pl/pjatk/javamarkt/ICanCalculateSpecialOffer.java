package pl.pjatk.javamarkt;

public interface ICanCalculateSpecialOffer {
    boolean canCalculate(Cart cart);

    void calculateOffer(Cart cart);

}
