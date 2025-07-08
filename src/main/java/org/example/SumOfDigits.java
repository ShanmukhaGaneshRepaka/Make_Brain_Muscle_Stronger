package org.example;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sumOfDigits(12345);
        System.out.println(sum);
    }
    static int sumOfDigits(int n)
    {
        if(n%10==n)return n;

return n%10+sumOfDigits(n/10);
    }
}
