//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int month = 1;
        int salary = 15000;
        int total = 0;
        while (total < 2459000) {
            total += salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int iI = 10; iI >= 1; iI--) {
            System.out.print(iI + " ");
        }
        System.out.println("Задача 3");
        int people = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 10;
        for (int y = 1; y <= year; y++) {
            int newBirths = people * birthRate / 1000;
            int deaths = people * deathRate / 1000;
            people = people + newBirths - deaths;
            System.out.println("Год " + y + ", численность населения составляет " + people);
        }
        System.out.println("Задача 4,5");
        int dowmPayment = 15000;
        int finalAmount = 12000000;
        int monthO = 0;
        double monthPercent = 1.07;
        while (dowmPayment < finalAmount) {
            dowmPayment *= monthPercent;
            monthO++;
            if (monthO % 6 == 0) {
                System.out.println("Месяц " + monthO + ", сумма накоплений равна " + dowmPayment + " рублей.");
            }
        }
        System.out.println("Задача 6");
        int vitaliySavings = 15000;
        int accumulationMonth = 9 * 12;
        double monthlyPercent = 0.07;
        int monthV = 1;
        while (monthV <= accumulationMonth) {
            vitaliySavings *= (1 + monthlyPercent);
            if (monthV % 6 == 0) {
                System.out.println("Месяц " + monthV + ": накполено " + vitaliySavings + " рублей");
            }
            monthV++;
        }
        System.out.println("Задача 7");
        int firstFriday = 5;
        for (int day = firstFriday; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-ое число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 8");
        int cometPeriod = 79;
        int startYear = 2025 - 200;
        int endYear = 2025 + 100;
        for (int yearC = startYear; yearC < endYear; yearC++) {
            if (yearC % cometPeriod == 0) {
                System.out.println(yearC);
            }
        }
    }
}