package problems.misc;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TxnBigDecimal {

    private int txnId;
    private BigDecimal amount;

    public TxnBigDecimal(int txnId, BigDecimal amount) {
        this.amount = amount;
        this.txnId = txnId;
    }

    public static void main(String[] args) {


        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            BigDecimal amt = new BigDecimal(sc.nextDouble());
            BigDecimal fee;
            if (amt.compareTo(BigDecimal.valueOf(10000)) > 0) {
                fee = amt.multiply(BigDecimal.valueOf(0.02));
            } else if (amt.compareTo(BigDecimal.ONE) > 0 && amt.compareTo(BigDecimal.valueOf(10000)) < 0) {
                fee = amt.multiply(BigDecimal.valueOf(0.01));
            } else{
                throw new RuntimeException("Invalid amount!");
            }
            System.out.println("Total fee: "+ (amt.add(fee)));
        } catch (RuntimeException e) {
            System.out.println("Exception: "+ e);
        }

        sc.close();



        List<Integer> sal = Arrays.asList(1000,500,200,4000,3300,1000);
        System.out.println(sal
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList()));
    }
}
