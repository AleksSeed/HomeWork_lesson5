public class Main {
    public static void main(String[] args) {
   /*     System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");  //Так удобнее смотрится
        }

        System.out.println("\n\nЗадание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");  //Так удобнее смотрится
        }

        System.out.println("\n\nЗадание 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");  //Так удобнее смотрится
            }
        }

        System.out.println("\n\nЗадание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");  //Так удобнее смотрится
        }


        System.out.println("\n\nДомашнее задание 2");
        System.out.println("Задание 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("\nЗадание 2");
        for (int i = 0; i < 100; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3");
        for (int i = 1; i < 600; i = i * 2){
            System.out.print(i + " ");
        }

        System.out.println("\n\nДомашнее задание 3");
        System.out.println("Задание 1");{
            int salary = 29000;
            int total = 0;
            for (int i = 1; i <=12; i++) {
                total = total + salary;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }

        System.out.println("\nЗадание 2");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }*/


        System.out.println("\nДомашнее задание - 1");
        System.out.println("Задание 1");
        {
            int salary = 15000;
            int total = 0;
            int i = 0;
            while (total < 2459000) {
                i = i + 1;
                total = (total + total / 100) + salary;
            }
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\nЗадание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();   //перевод каретки на новую строку
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3");
        int naselenieStraniy = 12000000;
        i = 1;
        while (i <= 10) {
            naselenieStraniy = naselenieStraniy + ((naselenieStraniy / 1000) * (17 - 8));
            System.out.println("Год " + i + ", численность населения составляет " + naselenieStraniy);
            i = i + 1;
        }

        System.out.println("\nДомашнее задание - 2");
        System.out.println("Задание 1");
        int total = 15000;
        int m = 0;
        while (total < 12000000) {
            m = m + 1;
            total = total + ((total / 100) * 7);
        }
        System.out.println("Василий накопил " + total + " рублей за " + m + " месяцев");

        System.out.println("\nЗадание 2");
        m = 0;
        total = 15000;
        while (total < 12000000) {
            m = m + 1;
            total = total + ((total / 100) * 7);
            if (m % 6 == 0) {
                System.out.println("Василий накопил " + total + " рублей за " + m + " месяцев");
            }
        }

        System.out.println("\nЗадание 3");
        m = 0;
        total = 15000;
        while (m < (9 * 12)) {
            m = m + 1;
            total = total + ((total / 100) * 7);
            if (m % 6 == 0) {
                System.out.println("Василий накопил " + total + " рублей за " + m + " месяцев");
            }
        }

        System.out.println("\nЗадание 4");
        int friday = 1;
        for (int day = 1; day <= 31; day++) {
            if (day == friday) {
                for (day = friday; day <= 31; day = day + 7) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                }
            }
        }

        System.out.println("\nДомашнее задание - 3");
        System.out.println("Задание 1");
        i = 0;
        do {
            i = i + 79;
            if (i > 1822) { System.out.println(i);
            }
        } while (i < 2022) ;

        System.out.println("\nЗадание 2");
        for (i = 1; i <= 10; i++){
            System.out.println("2*" + i + "=" + 2*i);
        }

    }
}