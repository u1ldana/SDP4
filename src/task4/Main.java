package task4;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();


        order.payOrder();
        order.shipOrder();
        order.deliverOrder();
        order.cancelOrder();
    }
}
