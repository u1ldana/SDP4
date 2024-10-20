package task4;

public class CancelledOrderState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is cancelled. Cannot pay for it.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is cancelled. Cannot ship it.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is cancelled. Cannot deliver it.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
