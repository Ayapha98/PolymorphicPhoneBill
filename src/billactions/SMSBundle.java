package billactions;

public class SMSBundle implements BillAction {
    int qty;
    double smsPrice;

    public SMSBundle(int qty, double smsPrice){

        if (qty <0 && smsPrice<0){
            throw new IllegalArgumentException("Quantity and smsPrice cannot be less than zero");
        }
        this.qty = qty;
        this.smsPrice = smsPrice;

    }

    @Override
    public double totalCost() {
        return qty*smsPrice;
    }
}
