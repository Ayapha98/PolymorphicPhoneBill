package PhoneBill;

import BillActionImplements.BillAction;

public class PhoneBill {

    private double total;

    public void accept (BillAction billAction){
        total += billAction.totalCost();
    }

    public double total(){
        return this.total;
    }
}
