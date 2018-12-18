package com.lc.en;

public class a_plus_b_problem {

    // java

    /* A + B 问题-给出两个整数 a 和 b , 求他们的和。
     * @param : An integer
     * @param : An integer
     * @return: The sum of a and b
     */
    public static int aplusb(int a, int b) {

        int sum_without_carry, carry;

        sum_without_carry = a ^ b; //没有进位的和
        carry = (a & b) << 1; //进位
        if (carry == 0)
            return sum_without_carry;
        else
            return aplusb(sum_without_carry, carry);
    }


    public static void main(String[] args) {
        System.out.println(aplusb(0, 1));
    }

}
