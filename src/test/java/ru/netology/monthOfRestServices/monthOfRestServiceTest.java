package ru.netology.monthOfRestServices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class monthOfRestServiceTest{
    @Test
    public void calculatingOfMonthOfRest(){
        monthOfRestService service = new monthOfRestService();
        int expected = 3;
        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;

        int actual = service.calculator(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
