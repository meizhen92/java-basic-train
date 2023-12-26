package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // nextInt하면 줄바꿈값이 남아버림(입력 버퍼를 비우기 위한 코드)

        ProductOrder[] createOrders = new ProductOrder[n];
        for (int i=0; i<createOrders.length; i++){
            System.out.println((i+1)+"번째 주문정보를 입력하세요.");

            System.out.println("상품명: ");
            String productName = scanner.nextLine();

            System.out.println("가격: ");
            int price = scanner.nextInt();

            System.out.println("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            createOrders[i] = createOrder(productName,price,quantity);
        }
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
