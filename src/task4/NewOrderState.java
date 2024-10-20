package task4;

public class NewOrderState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order has been paid.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped until it's paid.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered until it's paid and shipped.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order has been cancelled.");
        order.setState(new CancelledOrderState());
    }
}
