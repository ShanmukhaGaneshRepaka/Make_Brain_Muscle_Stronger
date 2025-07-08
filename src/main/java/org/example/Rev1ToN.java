package org.example;

public class Rev1ToN {
    public static void main(String[] args) {
Rev2(1);
    }
    static void Rev1(int n)
    {
        if(n==0)return;
        Rev1(n-1);

        System.out.println(n);

    }

    static void Rev2(int n)
    {
        if(n>10)return;
        Rev2(n+1);

        System.out.println(n);

    }
}
