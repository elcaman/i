package ru.netology.monthOfRestServices;

public class monthOfRestService{
    public int calculator(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            //System.out.print("Месяц: " + month + ". Денег: " + money);

            if (money >= threshold) {
                count++;
                money = (money - expense) / 3;

                //System.out.println("Ура отпуск. Потратил: " + expense + ", после отдыха осталось: " + money);
            } else {
                money = money + income - expense;

                //System.out.println("Работа. Потратил: " + expense + ", Заработал " + income);
            }
        }
        return count;
    }
}