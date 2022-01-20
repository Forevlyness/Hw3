package com.company;

public class Main {

    public static void main(String[] args) {
	double[] num = {12.3, 324.4, -23.3, 12.4, - 312.4, 3.3};
    double count = 0;
    double sum = 0;
    boolean firstNegativNum = false;
        for (double nums : num) {
            if (nums < 0) {
                firstNegativNum = true;
            }
            if (firstNegativNum) {
                if (nums > 0) {
                    count++;
                    sum += nums;
                }
            }
        }
        System.out.println(sum/count);
    }
}
