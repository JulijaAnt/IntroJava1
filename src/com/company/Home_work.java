package com.company;

public class Home_work {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        for (i = 2; i <= 80; i++) {
            k = 0;
                for (j = 2; j <= i; j++) {
                    if (i % j == 0)
                        k++;
                }
                if (k < 2) {
                    System.out.println(i);
                }
            }
                int a = 5;
                int b = 2;
                int answer;
                char o = '+';
                if (o == '+') {
                    answer = a + b;
                    System.out.println("Answer " + answer);
                } else if (o == '-') {
                    answer = a - b;
                    System.out.println("Answer " + answer);
                } else if (o == '*') {
                    answer = a * b;
                    System.out.println("Answer " + answer);
                } else if (o == '/') {
                    answer = a / b;
                    System.out.println("Answer " + answer);
                } else {
                    System.out.println("Operation failed");
                }

            }
        }