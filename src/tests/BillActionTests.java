package tests;

import billactions.DataBundle;
import billactions.PhoneCall;
import billactions.SMSBundle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillActionTests {
    @Test
    public void BillActionTotalsSmsBundleCostTest(){
        SMSBundle smsBundle = new SMSBundle(10,2.30);
        double cost = smsBundle.totalCost();
        assertEquals(23.0, cost, 0.001);
    }
    @Test
    public void BillActionTotalsDataBundleTest(){
        DataBundle dataBundle = new DataBundle(3650);
        double cost = dataBundle.totalCost();
        assertEquals(1277.5, cost, 0.001);
    }

    @Test
    public void BillActionTotalsPhoneCallCostTest(){
        PhoneCall phoneCall = new PhoneCall(6.55);
        double cost = phoneCall.totalCost();
        assertEquals(6.55, cost, 0.001);
    }
}
