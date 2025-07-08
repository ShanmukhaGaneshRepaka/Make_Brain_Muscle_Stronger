package org.example;

import org.w3c.dom.ls.LSOutput;

public class Nto1 {
    public static void main(String[] args) {
NtoOne(10);
    }
    static void NtoOne(int n)
    {
        if(n<=0)return;
        System.out.print(n+" ");
        NtoOne(n-1);
    }
}
