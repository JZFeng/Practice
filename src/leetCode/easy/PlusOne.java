package leetCode.easy;
/*
 Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list. 
 */
public class PlusOne
{

    public static void main(String[] args)
    {
        int[] digits = { 9, 9,9 };
        int[] results = plusOne(digits);
        for (int i : results)
        {
            System.out.println(i);
        }

    }

    public static int[] plusOne(int[] digits)
    {
        int i = digits.length - 1;
        int overflow = 0; // 用来表示是否overflow了
        // 从尾到头加
        while (i >= 0)
        {
            if (digits[i] + 1 > 9)
            { // 加完大于9的情况
                digits[i] = 0;
                overflow = 1;
                i--;
            }
            else
            { // 加完小于10的情况
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        // 这种情况是当前位数不够用，就必须新开数组，
        // 处理首位
        if (overflow > 0)
        {
            int[] newDigits = new int[digits.length + 1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }
}
