public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte byteNum = 1;
        short shortNum = 2;
        int intNum = 3;
        long longNum = 4L;
        float floatNum = 5.6f;
        double doubleNum = 7.8;
        char charNum = 99;
        boolean boolNum = 10 > 2;

        // Задача 2
        double boxersWeight1 = 78.2;
        double boxersWeight2 = 82.7;
        double totalWeight = boxersWeight1 + boxersWeight2;
        double differenceWeight = boxersWeight2 - boxersWeight1;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

        // Задача 3
        int bananasCount = 5;
        int milkCount = 200;
        int icecreamCount = 2;
        int eggsCount = 4;
        int bananasGram = bananasCount * 80;
        int milkGram = milkCount / 100 * 105;
        int icecreamGram = icecreamCount * 100;
        int eggsGram = eggsCount * 70;
        float breakfastWeightGram = bananasGram + milkGram + icecreamGram + eggsGram; // Общий вес завтрака в граммах
        float breakfastWeightKilogram = breakfastWeightGram / 1000; // Общий вес завтрака в килограммах
        System.out.println("Общий вес завтрака в граммах = " + breakfastWeightGram);
        System.out.println("Общий вес завтрака в килограммах = " + breakfastWeightKilogram);

        // Задача 4
        int kg = 7;
        int diet1 = 250;
        int diet2 = 500;
        int kgPerGr = kg * 1000;
        int dayDiet1 = kgPerGr / diet1;
        int dayDiet2 = kgPerGr / diet2;
        int averDays = (dayDiet1 + dayDiet2) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, на это уйдет " + dayDiet1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, на это уйдет " + dayDiet2 + " дней");
        System.out.println("Чтобы добиться результата похудения, в среднем может потребоваться " + averDays + " дней");

        // Задача 5
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        int percentMasha = salaryMasha * 10 / 100; // 10% от текущей зарплаты Маши
        int percentDenis = salaryDenis * 10 / 100; // 10% от текущей зарплаты Дениса
        int percentKristina = salaryKristina * 10 / 100; // 10% от текущей зарплаты Кристины
        int newSalaryMasha = salaryMasha + percentMasha; // Зарплата Маши после повышения на 10%
        int newSalaryDenis = salaryDenis + percentDenis; // Зарплата Дениса после повышения на 10%
        int newSalaryKristina = salaryKristina + percentKristina; // Зарплата Кристины после повышения на 10%
        int salaryDifYarMasha = (newSalaryMasha - salaryMasha) * 12; // Маша, разницу между годовым доходом до и после повышения
        int salaryDifYarDenis = (newSalaryDenis - salaryDenis) * 12; // Денис, разницу между годовым доходом до и после повышения
        int salaryDifYarKristina = (newSalaryKristina - salaryKristina) * 12; // Кристина, разницу между годовым доходом до и после повышения
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryDifYarMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDifYarDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryDifYarKristina + " рублей.");

    }
}