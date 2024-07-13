package ru.netology.monthOfRestServices;

public class Main {
    public static void main(String[] args) {
        monthOfRestService service = new monthOfRestService();

        int count = service.calculator(10000, 3000, 20000);

        System.out.println(count);
    }
}