package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {



        //Task17 задать произвольное число и вывести его в бухгалтерском формате т.е.20 023 143

        int ber = 1;
        int ber1 = 45678980;
        int randomNumber = ber + (int) (Math.random() * ber1);
        System.out.printf("% ,8d%n", randomNumber);//d- десятичное.%d-определяет одну десятичную.n - символ новой строки


     /*   int num=12334433;
        StringBuilder result=new StringBuilder();
        int count=0;

        while (num>0){
            int lastDigit=num%10;//lastDigit равен остатку от деления num на 10
            num=num/10;//num равен num делить на 10
            result.insert(0,lastDigit);//insert-вставляет символы в строку

            String result1+= lastDigit;
            count++;
            if (count==3){
                result=" " +result;
                count=0;
            }
        }*/




        //Task17 задать произвольное число и вывести его в бухгалтерском формате т.е.20 023 143


        int number = 20023143;
        System.out.printf("% ,8d%n", number);//d- десятичное.%d-определяет одну десятичную.n - символ новой строки


        //Task16 для целых чисел ,которые делятся на7 в диапазоне от 1 до100 ,вывести на экран"Hope!"


        int s = 1;

        while (s < 100) {

            if (s % 7 == 0) {
                System.out.println("Hope!" + s);
            }
            s++;
        }


//Task 14(1)
//

        int x = 789382344;
        int y = 0;
        int sum0 = 0;
        while (x != 0) {

            y = x % 10;
            sum0 += y;
            x /= 10;

        }
        System.out.println(sum0 + 5);


        //Task14 посчитать сумму цифр числа 7893823445 с помощью цикла do while


        int f = 789382344;
        int g = 0;
        int sum3 = 0;
        do {
            g = f % 10;
            sum3 += g;
            f /= 10;
        } while (f != 0);
        System.out.println(sum3 + 5);


        //Task12 вычислить факториал целых чисел от 0 до 10

        int a = 1;
        int sum = 1;
        while (a <= 10) {

            sum *= a;
            a++;

        }
        System.out.println(sum);


        //Task13 вычислить произведение чисел от 1 до 25

        int b = 1;
        int sum1 = 0;
        do {

            sum1 = b * b;
            b++;

            System.out.println(sum1);
        }

        while (b <= 25);

        System.out.println(sum1);


        //Task15 -найти среди чисел от 50 до 70 второе число простое и завершить цикл с помощью break

        int counter = 0;//счетчик простых чисел
        for (int i = 50; i < 70; i++) {//i=50;i<70=true;инкремент +1
            if (isPrime(i)) {//если в методе isPrime i true
                System.out.println("Prime" + counter + i);//тогда выводим простое число, №его,№i
                counter++;//счетчик прибавляет 1
                if (counter == 2) {//если счетчик равен 2
                    System.out.println(i);//выводим значение переменной i
                    break;//и останавливаем цикл
                }
            }
        }
    }

    static boolean isPrime(int number) {     //cоздаём статический метод ,который будет возвращать булево число

        for (int i = (int) Math.sqrt(number); i > 2; i--) {//обязательное условие i больше
            if (number % i == 0) {//если остаток от деления числа на i равен 0 -это не простое число
                return false;// дальше не проверяется
            }
        }
        return true;//простое и передается в counter как первое число простое
    }
}



