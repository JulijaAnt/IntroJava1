package com.company;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import static java.time.Duration.parse;
import java.time.ZonedDateTime;

public class Lesson2103 {
    public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);{

            //ask a user to enter sides of the right-angeled triangle.
            //find the area of the triangle
    System.out.println("Please enter a base ");
    double a = scanner.nextDouble();
    System.out.println("Please enter a hight");
    double b = scanner.nextDouble();
    double h = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    System.out.println("Hypotenuse equal to:  " + h);

    double s = ((a*b)/2);
    System.out.println("Area of triangle is: " + s);

    //write a program to return fibonacci sequence up to a length specified
            //by a user. Example: how many fibonacci numbers you want to display....

        System.out.println("Please enter the max number for calculation ");
        int t = scanner.nextInt();

        int[] febnu  = new int[t];
        febnu [0] = 0;
        febnu[1] = 1;
        for (int k = 2; k < t; k++) {
            febnu[k] = (febnu[k-1] + febnu [k-2]);
        }
        System.out.println(Arrays.toString(febnu));

// Find whether a year entered by user is long year.
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a year:");
            long year = scan.nextLong();
            if(year % 4 == 0 && year % 100 != 0 ||year % 400 == 0){
                System.out.println(year + " Long year");
            }else{
                System.out.println(year + " Not a long year");
            }

            //dateStart = 09:29:58;
            //dateStop = 10:31:48;
            //long diff = getTime(dateStart) - getTime(dateStop);
            //long diffHours = diff / (60 * 60 * 1000) % 24;
            //System.out.print(diffHours + " hours, ");



            //Task 1 write a programm to get year an months between two dates.
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate startDate = LocalDate.parse("28.01.2009", formatter);
            LocalDate endDate = LocalDate.parse("05.03.2013", formatter);
            Period period = Period.between(startDate, endDate);
            System.out.println("Years in the period: " + period.getYears());
            System.out.println("Months in the period: " + period.getMonths());

            //Task 2 Write a program to calculate the difference between two dates in days.


            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date1 = dateFormat.parse("15.05.2018");
            Date date2 = dateFormat.parse("17.05.2018");
            System.out.println("Start date: " + date1);
            System.out.println("End date : " + date2);
            long milliseconds = date2.getTime() - date1.getTime();
            System.out.println("Difference between the dates in milliseconds: " + milliseconds);
            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
            System.out.println("Difference between the dates in days " + days);

            // Write a program that returns the number or amount of hours between two (o'clock) times entered by the user.

            System.out.print("Enter the start hour: ");
            String userStart = scanner.nextLine(); // 5:00 AM

            System.out.print("Enter the end hour: ");
            String userEnd = scanner.nextLine(); // 8:00 AM

            // Get the value of the hours
            int startHour = Integer.parseInt(userStart.split(":")[0]);
            int endHour = Integer.parseInt(userEnd.split(":")[0]);

            // If a time entered is in the morning assign it 12 else assign it 24
            // to make it easy to compare numerically.
            int amPmOne = userStart.split(" ")[1].equals("AM") ? 12 : 24;
            int amPmTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;

            // subtract and find out the difference
            int difference =(endHour+amPmTwo) - (startHour+amPmOne);
            if (amPmOne < amPmTwo && startHour > endHour) difference +=12;


            System.out.println(difference == 0 ? "No time has passed." : difference + " hours");

        }

    }}



