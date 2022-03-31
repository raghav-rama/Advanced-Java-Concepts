package com.company.topcoder;
import java.util.Scanner;

public class RangeFinder {

    public int getRange(int[] x) {
        int largest=x[0];
        int smallest=x[0];
        for(int i=1;i<x.length;++i){
            if(largest<x[i])
                largest=x[i];
            if(smallest>x[i])
                smallest=x[i];
        }
        return largest-smallest;
    }
}
