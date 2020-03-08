package main.java.com.jiker.keju.utils;

import java.math.BigDecimal;

public class MathUtils {
    /**
     * 默认的除法精确度，
     */
    private static final int DEF_DIV_SCALE = 0;


    public static BigDecimal add(BigDecimal v1, BigDecimal v2) {
        if (null == v1) {
            v1 = BigDecimal.ZERO;
        }
        if (null == v2) {
            v2 = BigDecimal.ZERO;
        }
        return v1.add(v2).setScale(BigDecimal.ROUND_HALF_UP);
    }
    public static BigDecimal subtract(BigDecimal v1, BigDecimal v2) {
        if (null == v1) {
            v1 = BigDecimal.ZERO;
        }
        if (null == v2) {
            v2 = BigDecimal.ZERO;
        }
        return v1.subtract(v2).setScale(BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal multiply(BigDecimal v1, BigDecimal v2) {
        if (null == v1) {
            v1 = BigDecimal.ONE;
        }
        if (null == v2) {
            v2 = BigDecimal.ONE;
        }
        return v1.multiply(v2).setScale(0, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal divide(BigDecimal v1, BigDecimal v2) {
        return v1.divide(v2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP);
    }
}