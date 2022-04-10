package com.company;

public class UniqueElement {
    public static void main(String[] args) {
        int[] a={3,3,4,4,8,4,1,8,1,2,1,3,8};
        System.out.println(findUnique(a));
    }
    static int findUnique(int[] arr) {
        int i,j=0;
        outer:
        for(i = 0; i<arr.length; ++i) {
            if(j == arr.length)
                return arr[i-1];
            for (j = 0; j < arr.length; ++j)
                if (arr[i] == arr[j] & j != i)
                    continue outer;
        }
        return -1;
    }
}