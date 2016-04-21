package com.networked.interviewquestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sathishv on 4/19/16.
 */
public class PerfectNumber {

    public static boolean checkPerfectNumber(int i) {

        int sum = 0;
        for (int j = 1; j<i; j++) {
            if (0 == i % j) {
                sum += j;
            }
        }
        return (sum == i);
    }

    public static List<Integer> getPerfectNumberList(int i) {
        List<Integer> numberList = new ArrayList<Integer>();
        //int sum = 0;
        for (int j = 1; j <= i; j++) {
            if (checkPerfectNumber(j)) {
                numberList.add(j);
            }
        }

        return numberList;
    }
}
