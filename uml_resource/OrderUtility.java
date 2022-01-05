public class OrderUtility {
  public static double calculateAverageOrderTotal(Order[] order) {
    if (order == null) {
      return 0;
    }

    double sum = 0;
    for (Order o : order) {
      sum += o.calculateTotal();
    }
    int numOrders = order.length;

    return sum / numOrders;
  }
}
