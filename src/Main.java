public class Main {
    public static void main(String[] args) {
       System.out.println("Домашнее задание 1");
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
            }
        
    }
}
