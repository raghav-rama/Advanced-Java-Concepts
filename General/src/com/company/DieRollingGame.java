package com.company;

public class DieRollingGame {
    public double winChance(int n, int total) {
        int temp = total;
        int temp_n=n;
        int favourableOutcomes=0;
        int quotient, remainder;
        int counter=0;
        while(favourableOutcomes<total) {
            while (temp != 0 && temp_n > 0) {
                quotient = temp / temp_n;
                remainder = temp % temp_n;
                favourableOutcomes += quotient;
                temp = remainder;
                --temp_n;
            }
            if(favourableOutcomes==total)
                ++counter;
            else if(favourableOutcomes>total)
                continue;
        }
        return 0;
    }
}