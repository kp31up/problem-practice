package misc;

import static org.junit.jupiter.api.Assertions.*;

class TxnBigDecimalTest {
  Sales sales = new Sales();
    @Test
    void calcCommNegative() {
        assertThrows(IllegalArgumentException.class, () -> sales.calcCommOpt("-5000"));
    }

    @ParameterizedTest
    @MethodSource("getParams")
    void calcAllComm(String exp, String amt) {
        assertEquals(exp, sales.calcCommOpt(amt));
    }

    private static Stream<Arguments> getParams(){
        return Stream.of(
                Arguments.arguments("0.00", "05000"),
                Arguments.arguments("150.00", "15000"),
                Arguments.arguments("500.00", "25000"),
                Arguments.arguments("2250.00", "75000")
        );
    }
}
