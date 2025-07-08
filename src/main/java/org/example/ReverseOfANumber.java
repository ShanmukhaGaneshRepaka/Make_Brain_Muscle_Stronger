package org.example;

public class ReverseOfANumber {
    public static void main(String[] args) {
        System.out.println(rev(123));
    }
    static int rev(int num)
    {
        int reverse=0;
        return helper(num,reverse);
    }

    static int helper(int num, int reverse) {
       if(num==0)return reverse;
        int rem=num%10;
        reverse=reverse*10+rem;

        return helper(num/10,reverse);
    }
}
