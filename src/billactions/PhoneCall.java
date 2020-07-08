package billactions;

public class PhoneCall implements BillAction {
    double price;

    public PhoneCall(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can not be less than zero");
        }
        this.price = price;
    }

    @Override
    public double totalCost() {
        return price;
    }
}
