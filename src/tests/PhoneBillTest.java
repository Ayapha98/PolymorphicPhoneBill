package tests;

import billactions.DataBundle;
import billactions.PhoneCall;
import billactions.SMSBundle;
import phonebill.PhoneBill;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBillTest {
    @Test
    public void shouldTestPhoneBillAcceptForAPhoneCall() {
        PhoneBill callBill = new PhoneBill();
        callBill.accept(new PhoneCall(8.00));
        double cost = callBill.total();
        assertEquals(8.00, cost, 0.001);

    }
    @Test
    public void shouldTestPhoneBillAcceptForDataBundle(){
        PhoneBill dataBill = new PhoneBill();
        dataBill.accept(new DataBundle(1200));
        double cost = dataBill.total();
        assertEquals(420, cost, 0.001);
    }
    @Test
    public void shouldTestPhoneBillAcceptForSMSBundle(){
        PhoneBill smsBill = new PhoneBill();
        smsBill.accept(new SMSBundle(7,0.68));
        double cost = smsBill.total();
        assertEquals(4.76, cost, 0.001);
    }
    @Test
    public void shouldCheckPhoneBillTotalMethod() {
        PhoneBill bill = new PhoneBill();
        bill.accept(new PhoneCall(18.50));
        bill.accept(new PhoneCall(75.50));
        bill.accept(new PhoneCall(20.50));
        bill.accept(new DataBundle(1600));
        bill.accept(new DataBundle(300));
        bill.accept(new DataBundle(200));
        bill.accept(new SMSBundle(5,0.50));
        bill.accept(new SMSBundle(60,0.50));
        bill.accept(new SMSBundle(7,0.50));
        double cost = bill.total();
        assertEquals(1085.50, cost, 0.001);
    }
}
