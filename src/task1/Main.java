package task1;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(90.0);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(150.0);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300.0);
    }
}

