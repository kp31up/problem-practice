package problems.misc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TxnBigDecimal {

    public String calcCommOpt(String saleAmount) {
        BigDecimal amt = new BigDecimal(saleAmount);
        if (compareAmount(amt, 0D)) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (compareAmount(amt, 10000) ){
            return getScaledComm(BigDecimal.ZERO, 0.01);
        }
        if (compareAmount(amt, 20000) ) {
            return getScaledComm(amt, 0.01);
        }
        if (compareAmount(amt, 50000) ){
            return getScaledComm(amt, 0.02);
        }
        return getScaledComm(amt, 0.03);
    }

    boolean compareAmount(BigDecimal amount, double target) {
        return amount.compareTo(BigDecimal.valueOf(target)) <0;
    }

    String getScaledComm(BigDecimal amount, double comm) {
        BigDecimal commission = amount.multiply(BigDecimal.valueOf(comm));
        return commission.setScale(2, RoundingMode.HALF_EVEN).toString();
    }
}
