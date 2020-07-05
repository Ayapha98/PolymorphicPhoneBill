package BillActionImplements;

public class PhoneCall implements BillAction {
    double callPrice;

    public PhoneCall(double price){

    }

    @Override
    public double totalCost() {
        return callPrice;
    }
}
