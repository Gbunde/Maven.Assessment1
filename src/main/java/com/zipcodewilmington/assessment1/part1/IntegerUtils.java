package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

        return n;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer product;

        for (int number = 0; number <= n; number++) {
            product = number * number;

            return product;
        }

        /**
         * @param val integer value input by client
         * @return integer with identical digits in the reverse order
         */
        public static Integer reverseDigits (int val) {
            Integer dig = val;
            if (dig > 0) {
                reverseDigits(dig / 10);
                reverseDigits += (dig % 10) * val;
                val *= 10;
            }
            return reverseDigits;
        }

    }

    private static void reverseDigits(int i) {

    }


}
