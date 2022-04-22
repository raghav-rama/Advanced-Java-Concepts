package com.company.topcoder;

import java.util.Arrays;

public class BagPacking {

    public static void main(String[] args) {
//        int[] a = {1,2,3,2,1,2,3,4,1,7};
        int[] a = {1,2,3,2,1,2,3,4,1,7,2,3,5,4,6,7,3,2,7,6,3,4,5};
        Arrays.sort(a);
        System.out.println(new BagPacking().minPay(a));
        for(int i=0;i<a.length;++i)
            System.out.print(a[i]+" ");
    }

    public int minPay(int[] bagsizes) {
        int length = bagsizes.length;
        int minPayNum = length;
//        int[] temp=bagsizes.clone();
        for(int i=length-1; i>=1; --i) {
            for(int j=bagsizes[i]-1; j>=1; --j) {
//                Arrays.sort(bagsizes);
                int foundAt = linearSearch(bagsizes, j, i);
                if(foundAt!=-1) {
                    --bagsizes[i];
                    bagsizes[foundAt] = 0;
                }
                for(int k=0;k<length;++k) {
                    System.out.print(bagsizes[k] + " ");
                }
                System.out.println("i="+i+" j="+j+" foundAt="+foundAt);
            }
//            for(int k=0;k<6;++k)
//                System.out.print(bagsizes[k]+" ");
//            System.out.println();
        }
        for(int i:bagsizes)
            if(i==0)
                --minPayNum;

        return minPayNum;
    }

//    private int binarySearch(int left, int right, int[] arr, int val) {
//        int mid=(left+right)/2;
//        if(left < right) {
//            if(val<arr[mid])
//                return binarySearch(left, mid-1, arr, val);
//            else if(val>arr[mid])
//                return binarySearch(mid+1, right, arr, val);
//            return mid;
//        }
//        else
//            return -1;
//    }

    private int linearSearch(int[] a, int val, int limit) {
        int i;
        for(i=0;i<limit; ++i)
            if(val==a[i])
                break;
        if(i<limit)
            return i;
        else return -1;
    }
//
//    private int biggestNumberIndex(int[] a) {
//        int biggest = a[0];
//        int index=0;
//        for (int i=0;i<a.length;++i)
//            if (a[i] > biggest) {
//                biggest = a[i];
//                index = i;
//            }
//        return index;
//    }
//
//    private int smallestNumberIndex(int[] a) {
//        int smallest = a[0];
//        int index=0;
//        for (int i=0;i<a.length;++i)
//            if (a[i] > smallest) {
//                smallest = a[i];
//                index = i;
//            }
//        return index;
//    }

}
