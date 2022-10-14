package aufgabe2Div;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DivBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            BigDecimal bigD1 = (sc.nextBigDecimal());
            BigDecimal bigD2 = (sc.nextBigDecimal());

            System.out.println(bigD1 + " / " + bigD2 + " = " + bigD1.divide(bigD2, 5, RoundingMode.FLOOR));
        }

    }
}
