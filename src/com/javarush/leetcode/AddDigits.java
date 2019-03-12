package com.javarush.leetcode;
//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//Example:
//Input: 38
//Output: 2
//Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
//             Since 2 has only one digit, return it.

import org.junit.Assert;
import org.junit.Test;

public class AddDigits {
    public int addDigits(int input) {
        if (input < 0) {
            return 0;
        }
        while (input >= 10) {
            input = sumDigits(input);
        }

        return input;
    }

    int sumDigits(int number) {
        /*
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = (number / 100) % 10;
        int d = number / 1000 % 10;
        int e = number / 10000 % 10;
        return a + b + c + d + e;
*/
        int sum = 0;
        while (number != 0) {  //123
            sum = sum + number % 10;  //1.0+123%10=3   2. 3+12%10=5  3. 5+1%10=6
            number = number / 10;   //1.123/10=12   2.12/10=1  3. 1/10=0
        }
        return sum; //6

    }

    @Test
    public void test1() {
        Assert.assertEquals(2, addDigits(38));
    }

    @Test
    public void test2() {
        Assert.assertEquals(7, addDigits(385));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, addDigits(0));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, addDigits(-12));
    }

    @Test
    public void test5() {
        Assert.assertEquals(7, addDigits(7));
    }

    @Test
    public void test6() {
        Assert.assertEquals(2, addDigits(708538619));
    }
}
