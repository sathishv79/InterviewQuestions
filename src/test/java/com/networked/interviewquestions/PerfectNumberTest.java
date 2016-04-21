package com.networked.interviewquestions;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sathishv on 4/19/16.
 */
@RunWith(JUnitParamsRunner.class)
public class PerfectNumberTest {

    @Parameters({
            "1, false",
            "6, true",
            "9, false",
            "99999, false"
    })
    @Test
    public void perfectNumberTest(int num, boolean result) {
        boolean flag = PerfectNumber.checkPerfectNumber(num);

        assertThat(flag, is(result));
    }

    @Test
    public void perfectNumberListTest() {
        List<Integer> numberList = PerfectNumber.getPerfectNumberList(100000);
        System.out.println(numberList);
    }
}