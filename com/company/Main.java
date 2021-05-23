package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {


        //Task17 задать произвольное число и вывести его в бухгалтерском формате т.е.20 023 143

int ber=1;
int ber1=45678980;
        int randomNumber = ber+(int)(Math.random()*ber1);
        System.out.printf("% ,8d%n", randomNumber);//d- десятичное.%d-определяет одну десятичную.n - символ новой строки





        //Task17 задать произвольное число и вывести его в бухгалтерском формате т.е.20 023 143


        int number1 = (int)Math.random() +78965123;
        System.out.printf("% ,8d%n", number1);//d- десятичное.%d-определяет одну десятичную.n - символ новой строки



//Task15

        int k = 50;
        int sum7 = 0;
        while (k <= 70) {
            if (k % 2 != 0) {
                System.out.println(k);
            }

            k++;
            if (k == 55) {
                break;
            }
        }


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
    }
}



