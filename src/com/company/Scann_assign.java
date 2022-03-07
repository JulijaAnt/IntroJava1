package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Scann_assign {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first statement:");
        String firstStatement = scanner.next();
        System.out.println("Please enter second statement:");
        String secondStatement = scanner.next();
    int length1 = firstStatement.length();
    int length2 = secondStatement.length();
            if (length1 == length2){
        System.out.println("Sentences are equal");
    }           else {
                System.out.println("Sentences are not equal");
            }{
                System.out.println("Please enter a statement:");
                String Statement = scanner.next();
                String newText = Statement.substring(1, Statement.length() - 1);
                System.out.println(newText);


            System.out.println("Please enter a word:");
            String Word1= scanner.next();
            String reversedword = "";
            for (int i = Word1.length() - 1; i < -1; i--) {
                reversedword += Word1.charAt(i);
            }
                System.out.println(reversedword.toUpperCase());


            System.out.println("Please enter a word:");
            String word= scanner.next();
            System.out.println("Please enter a letter:");
            String l= scanner.next();
            System.out.println("Please enter a number:");
            int c = scanner.nextInt();
            int index = word.indexOf(l);
            String resu = "";
            String result = "";
            for (int k = 0; k < c; ++k) {
                result += l;
                String substr1 = word.substring(index);
                String substr2 = word.substring(0,index);
                resu = substr2 + result + substr1;

            }

            System.out.println(resu);
            scanner.close();
}}}

