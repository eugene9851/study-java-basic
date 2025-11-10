package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요: ");
    int n = scanner.nextInt();
    scanner.nextLine();

    ProductOrder[] orders = new ProductOrder[n];
    for(int i=0; i<orders.length; i++) {
      System.out.println((i+1) + "번째 주문의 상품명을 입력하세요: ");

      System.out.print("상품명: ");
      String productName = scanner.nextLine();

      System.out.print("가격: ");
      int price = scanner.nextInt();
      scanner.nextLine();

      System.out.print("수량: ");
      int quantity = scanner.nextInt();
      scanner.nextLine();

      orders[i] = createOrder(productName, price, quantity);
    }
    scanner.close();
    printOrders(orders, getTotalAmount(orders));    
  }

  static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder order = new ProductOrder();
    order.productName = productName;
    order.price = price;
    order.quantity = quantity;
    return order;
  }

  static void printOrders(ProductOrder[] orders, int totalAmount) {
    for(ProductOrder order : orders) {
      System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
    }
    System.out.println("총 금액: " + totalAmount);
  }

  static int getTotalAmount(ProductOrder[] orders) {
    int totalAmount = 0;
    for(ProductOrder order : orders) {
      totalAmount += order.price * order.quantity;
    }
    return totalAmount;
  }
}
