package com.company;

import java.util.Scanner;

public class Celendare {
    public static void main(String[] args) {



        nextDay(3,5,2009);

    }
        static void nextDay(int day, int month, int year) {

            int maxDaysMonth = 0;
            boolean daysInAMonth = false;
            int nextDay = day;
            int nextYear = year;
            int nextMonth = month;
            String[] namesMonth = {"январь", "февраль", "март"};
            int[] daysMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31};
//for(int j=1;j<daysMonth.length;j++){


            if (day < daysMonth[month]) {
                System.out.println(daysMonth[month]);
                nextDay++;
            }
            if (day == daysMonth[month]) {
                nextDay = 1;
                nextMonth++;
            }


            if (month == daysMonth[month]) {
                nextMonth++;
            }

            if (month == 12 && day == 31) {
                nextDay = 1;
                nextYear++;

                if (month == 12 && day == 31) {

                    nextMonth = 1;

                }


            }System.out.println(nextDay + " " + nextMonth + " " + nextYear);



        }


}

