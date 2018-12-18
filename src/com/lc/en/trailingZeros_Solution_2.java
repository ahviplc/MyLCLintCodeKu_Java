package com.lc.en;

import java.math.BigDecimal;

/**
 * int类型的输出 n只能支持到12，在12-33的数值会得到错误的输出值可能正数可能负数，34及以上输出0.
 *
 * long类型的输出 n只能支持到20，在20-65的数值会得到错误的输出值可能正数可能负数，36及以上输出0.
 */
public class trailingZeros_Solution_2 {

    // java

    /* 2.尾部的零-设计一个算法，计算出n阶乘中尾部零的个数
     * @param n: A long integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long count = 0;
        while (n != 0) {
            n = n / 5;
            count += n;
        }
        return count;
    }


    /**
     * 算阶乘
     *
     * @param number
     * @return 备注:如果过大就丢精度了，long类型的输出 n只能支持到20
     */
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }


    /**
     * 算阶乘
     *
     * @param number
     * @return 备注:如果过大就丢精度了，int类型的输出 n只能支持到12
     */
    public static int factorialByInt(int number) {
        if (number <= 1)
            return 1;
        else
            return number * factorialByInt(number - 1);
    }


    /**
     * BigDecimal的递归方法，其它两种方式把int替换成BigDecimal处理也等价
     *
     * @param n
     * @return 备注:如果过大也可以
     */
    public static BigDecimal factBig(int n) {

        if (n == 1 || n == 0) {
            return BigDecimal.valueOf(1);
        } else {
            return BigDecimal.valueOf(n).multiply(factBig(n - 1));
        }

    }


    public static void main(String[] args) {
        //最后有几个零
        System.out.println(trailingZeros(12));
        System.out.println(trailingZeros(20));
        System.out.println(trailingZeros(25));
        //int阶乘
        System.out.println(factorialByInt(12));//int类型的输出 n只能支持到12
        System.out.println(factorialByInt(13));//int类型的输出 n只能支持到12
        //long阶乘
        System.out.println(factorial(20));//long类型的输出 n只能支持到20
        System.out.println(factorial(21));//long类型的输出 n只能支持到20
        //递归阶乘
        System.out.println(factBig(12));//n的值可以很大了，不受int和long的长度限制了。
        System.out.println(factBig(13));//n的值可以很大了，不受int和long的长度限制了。
        System.out.println(factBig(20));
        System.out.println(factBig(21));
        System.out.println(factBig(25));
    }


}
