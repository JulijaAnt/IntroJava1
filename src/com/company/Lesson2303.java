package com.company;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import static java.time.Duration.parse;
import java.time.ZonedDateTime;

public class Lesson2303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1 write a program that takes in the weigh and hight of 5 people from the user and returns
        //the average BMI of the group
     //   int[] weight = new int[5];
     //  int[] hight = new int[5];
  //   double[] result = new double[5];
     // double sum = 0;
     // for (int j = 0; j < 5; j++) {
        //  System.out.println("Enter a weight:");
        //  weight[j] = scanner.nextInt();
         // System.out.println("Enter a hight:");
         // hight[j] = scanner.nextInt();
        //  result[j] = weight[j] / (Math.pow(hight[j]/100, 2));
        //  sum += result[j];
          //System.out.println(Arrays.toString(result));
      //} //System.out.println("Average BMI for the group : " + sum / 5 * 1000);

//Task 2 Given a string from the user return the character and count of the character that occurs
        //the most in the string

        //System.out.println("Please enter a word:");
        // String text = scanner.next();
        // char letters [] = new char[text.length()];
        //int count = 0;
        //int maximum []= new int [0];
        //  for (int i = 0; i < text.length(); i++) {
        //  letters[i] = text.toLowerCase().charAt(i);
        //   if (letters[i] == letters[i + 1]) {
        //   count++;
        //    if (maximum < count[i]) {
        //       maximum = count[i];

        // Task 3 receive a year, month and a day from the user separately.
        //the year should be 4 digit number
        //assume the date is correct
        //determine whether the date is a magic date
        //magic date is: day * month -- 1 dugun number and eqel
        System.out.println("Please enter a year:");
        int year = scanner.nextInt();
        int yearlast = year % 10;
        int yearlasttwo = year % 100;
        int yearlast3 = year % 1000;
        System.out.println("Please enter a month:");
        int month = scanner.nextInt();
        System.out.println("Please enter a day:");
        int day = scanner.nextInt();
        if (9 >= month * day && month * day == yearlast)
            System.out.println("The date is magic date:");
        if (9 < month * day && month * day < 99 && month * day == yearlasttwo) {
        System.out.println("The date is magic date:");
        if (month * day > 99 && month * day == yearlast3)
            System.out.println("The date is magic date:");
    }else{

        System.out.println("The date is not magic date:");








                }}}