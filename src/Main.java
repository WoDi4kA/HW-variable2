//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte int1 = 55;
        short int2 = 6000;
        int int3 = 789000;
        long int4 = 982381793L;
        float float1 = 7.2121f;
        double float2 = 321.213321;
        System.out.println("Значение переменной с типом byte = " + int1);
        System.out.println("Значение переменной с типом short = " + int2);
        System.out.println("Значение переменной с типом int = " + int3);
        System.out.println("Значение переменной с типом long = " + int4);
        System.out.println("Значение переменной с типом float = " + float1);
        System.out.println("Значение переменной с типом double = " + float2);
        System.out.println();


        float first = 27.12f;
        long second = 987_678_965_549L;
        float third = 2.786f;
        short fourth= 569;
        short fifth = -159;
        short sixth = 27897;
        byte seveth = 67;


        byte luPav = 23;
        byte anSer = 27;
        byte ecAnd = 30;
        short total = 480;
        int answer  = total / (luPav + anSer + ecAnd);
        System.out.println("На каждого ученика расчитанно " + answer + " листов бумаги");
        System.out.println();


        byte performance = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200; // при месяце в 30 дней

        int general1 = (time1 / 2) * performance;
        int general2 = (time2 / 2) * performance;
        int general3 = (time3 / 2) * performance;
        int general4 = (time4 / 2) * performance;
        System.out.println("За " + time1 + " минут машина произвела " + general1 +  " штук бутылок");
        System.out.println("За " + time2 + " минут машина произвела " + general2 +  " штук бутылок");
        System.out.println("За " + time3 + " минут машина произвела " + general3 +  " штук бутылок");
        System.out.println("За " + time4 + " минут машина произвела " + general4 +  " штук бутылок");
        System.out.println();


        byte totalColor = 120;
        int whiteColor;
        int brownColor;
        int countClasses = totalColor / (2 + 4);
        whiteColor = 2 * countClasses;
        brownColor = 4 * countClasses;
        System.out.println("В школе, где " + countClasses + " классов, нужно " + whiteColor +  " банок белой краски и " + brownColor + " банок коричневой краски");
        System.out.println();


        short weightBanan = 80;
        short weightMilk = 105;
        short weightIcecream = 100;
        short weightEgg = 70;
        int totalWeight = (5 * weightBanan) + (2 * weightMilk) + (2 * weightIcecream) + (4 * weightEgg);
        System.out.println("Вес завтрака - " + totalWeight + " г");
        float totalWeightKg = totalWeight / 1000f;
        System.out.println("Вес завтрака - " + totalWeightKg + " кг");
        System.out.println();


        short totalTarget = 7000;
        short firstWeight = 250;
        short secondWeight = 500;
        short middleWeight = (250 + 500) / 2;
        System.out.println("Теряя по " + firstWeight + " грамм спортсмену понадобиться - " + (totalTarget / firstWeight) + " дней");
        System.out.println("Теряя по " + secondWeight + " грамм спортсмену понадобиться - " + (totalTarget / secondWeight) + " дней");
        System.out.println("Теряя по " + middleWeight + " грамм спортсмену понадобиться - " + (totalTarget / middleWeight) + " дней");
        System.out.println();



        float mashaSalary = 67760;
        float denisSalary = 83690;
        float kristinaSalary = 76230;
        float changeMasha = mashaSalary / 100 * 10;
        float changeDenis = denisSalary / 100 * 10;
        float changeKristina = kristinaSalary / 100 * 10;
        float mashaSalary2 = mashaSalary + changeMasha;
        float denisSalary2 = denisSalary + changeDenis;
        float kristinaSalary2 = kristinaSalary + changeKristina;
        float yearSalaryMasha = mashaSalary * 12;
        float yearSalaryDenis = denisSalary * 12;
        float yearSalaryKristina = kristinaSalary * 12;
        float yearSalaryMasha2 = mashaSalary2 * 12;
        float yearSalaryDenis2 = denisSalary2 * 12;
        float yearSalaryKristina2 = kristinaSalary2 * 12;
        System.out.println("Маша теперь получает " + mashaSalary2 + " рублей.Годовой доход вырос на " + (yearSalaryMasha2 - yearSalaryMasha) + " рублей");
        System.out.println("Денис теперь получает " + denisSalary2 + " рублей.Годовой доход вырос на " + (yearSalaryDenis2 - yearSalaryDenis) + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalary2 + " рублей.Годовой доход вырос на " + (yearSalaryKristina2 - yearSalaryKristina) + " рублей");

    }
}