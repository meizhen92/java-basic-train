package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] createOrders = new ProductOrder[3];
        createOrders[0] = createOrder("두부", 2000, 2);
        createOrders[1] = createOrder("김치", 5000, 1);
        createOrders[2] = createOrder("콜라", 1500, 2);
        printOrders(createOrders);
        int total = printSumPrice(createOrders);
        System.out.println("총 결제 금액: "+total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
        }
    }

    static int printSumPrice(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
