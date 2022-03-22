package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Lesson1803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Please enter a base:");
        //double base = scanner.nextDouble();
        //System.out.println("Please enter a height:");
        // double height = scanner.nextDouble();
        // System.out.println((base * height) / 2);

        //Task 2
        //Write a programm that accepts a, b and c and allows a calculates a quadratic equation based on the user input
        //the quadratic formula is x1: (-b+squareroot(b^2 - (4*a*c))/2a, x2 = 1: (-b-squareroot(b^2 - (4*a*c))/2a

        // System.out.println("Please enter a ");
        //  double a = scanner.nextDouble();
        //  System.out.println("Please enter b");
        // double b = scanner.nextDouble();
        //  System.out.println("Please enter c");
        // double c = scanner.nextDouble();

        // double x1 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        // double x2 = (-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        // System.out.println("x1 is :" + x1 + "x2 is :" + x2);
// Home task 1
        // write a programm to find maximum product of two integers in a given array of integers. Exmple: Intput
        //numbers: {2,3,5,7,-7,5,8}, Output: 1ir is:(7.8., maximum product 56)

        System.out.print("How many numbers do you want to enter?: ");
        int[] numb = new int[scanner.nextInt()];

        for (int k = 0; k < numb.length; k++) {
            System.out.print("Enter a number: ");
            numb[k] = scanner.nextInt();
        }
        Arrays.sort(numb);
        System.out.print(Arrays.toString(numb));
        System.out.println("Pair is" + " " + (numb[numb.length - 1]) + " " + "and" + " " + (numb[numb.length - 2]) + " " + "Maximum product is " + " " + ((numb[numb.length - 1]) * (numb[numb.length - 2])));


        //Write a programm to find minimum subarray sum of the specofied size in a give array of integers.
        //Example: Input: nums={1,2,3,4,5,6,7,8,9,10}. Output:Array size:4, Subarray from 0 to 3 and sum is 10.


        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int t = 0; t < numbers.length; t++) {
            System.out.print("Enter a number: ");
            numb[t] = scanner.nextInt();
        }
        //sort the array
        Arrays.sort(numbers);
        //ask user to specify minimum size of the array.



       //System.out.print("What is the size of sub-array?:");
     //  int minSize = scanner.nextInt();
    //  int sumMinsize = 0;
    //  for (int q=0, q<minSize; q++){
      //    sumMinsize += numbers[q];
        }
      //  System.out.print("Minimum size is" + sumMinsize);

        //int minsum = 0;
//int counter = 0;
        //int y = ((numb.length)-(size)+1);
       //System.out.print(y);
//int y=3;
       // int[] sumcount = new int[3];
      //  for (int t = 0; t < numbers.length; t++) {
          //  sumcount[y] = Math.addExact(numb[t], numb[t+size-1]);
          //for (int w = 0; w <= size; w++){
         // minsum += numb[t];
            //  System.out.print(minsum);
           //   counter++;
            //  minsum = sumcount[w];
           //   if (counter>size) {
           //       continue;
              }
      // System.out.print(Arrays.toString(sumcount)); }}
