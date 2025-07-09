package org.example.arrays;

public class CheckArrayIsSortedRotated {

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(isSortedRotated(arr));
    }
    static boolean isSortedRotated(int[] arr)
    {
        int count = 0;

        for (int i = 0; i <arr.length ; i++) {
            int next = (i+1)%arr.length;

            if(arr[i]>arr[next]){
                count++;
            }
        }
        return count<=1;
    }

    
}
