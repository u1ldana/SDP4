package task4;

public class PaidOrderState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order has been shipped.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered until it's shipped.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order has been cancelled.");
        order.setState(new CancelledOrderState());
    }
}
