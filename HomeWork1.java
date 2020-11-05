package ru.geekbrains.j_one.lesson_1.homework;

public class HomeWork1 {
    //1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    //где a, b, c, d – целочисленные входные параметры этого метода;
    public static void main(String [] args) {
        System.out.println("Задание 1");
         int a;
         int b;
         int c;
         int d;
             a=6;
             b=8;
             c=9;
             d=2;
            double result = a * (b + (c / d));
            System.out.println(result);
    }
    //2. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean taskTwo(int a, int b) {
        System.out.println("Задание 2");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    //3. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void taskThree(int a) {
        System.out.println("Задание 3");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    //4. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    static boolean taskFour(int a) {
        System.out.println("Задание 4");
        if (a < 0) return true;
        return false;
    }

    //5. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void taskFive(String name) {
        System.out.println("Задание 5");
        System.out.println("Привет, " + name + "!");
    }

    //6. * Написать метод, который определяет является ли год високосным, и выводит сообщение
    //в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    //– високосный.
    static void taskSex(int year) {
        System.out.println("Задание 6");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}
