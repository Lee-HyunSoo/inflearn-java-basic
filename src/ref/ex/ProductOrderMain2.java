package ref.ex;


public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder order1 = createProductOrder("두부", 2000, 2);
        ProductOrder order2 = createProductOrder("김치", 5000, 1);
        ProductOrder order3 = createProductOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {order1, order2, order3};

        printProductOrder(productOrders);
    }

    static ProductOrder createProductOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printProductOrder(ProductOrder[] productOrders) {
        int totalAmount = getTotalAmount(productOrders);

        for (ProductOrder productOrder : productOrders) {
            System.out.println(
                    "상품명: " + productOrder.productName
                            + ", 가격: " + productOrder.price
                            + ", 수량: " + productOrder.quantity
            );
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
