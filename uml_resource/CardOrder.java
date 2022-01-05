

public class CardOrder extends Order{
  private int numReferred;
  
  public CardOrder (String itemName, int numReferred) {
    super(itemName);
    this.numReferred = numReferred;
  }

  @Override
  public double calculateTotal () {
    double originalAmt = super.calculateTotal();
    double referredDiscount = 0.35 * numReferred;

    double maxDiscount = originalAmt * 0.3;

    double discount = maxDiscount < referredDiscount ? maxDiscount : referredDiscount;

    return originalAmt - discount;
  }
}
