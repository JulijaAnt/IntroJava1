package com.company;

public class Strin {
    public static void main(String[] args) {

        String regularString = "Physician";
        int counter = 0;
        for (int i = 0; i < regularString.length(); i++) {
            System.out.println(regularString.charAt(i));
            if ('A' == regularString.charAt(i) || 'E' == regularString.charAt(i) || 'I' == regularString.charAt(i) || 'O' == regularString.charAt(i) || 'U' == regularString.charAt(i) || 'a' == regularString.charAt(i) || 'e' == regularString.charAt(i) || 'i' == regularString.charAt(i) || 'o' == regularString.charAt(i) || 'u' == regularString.charAt(i)){
                counter++;

            }
            System.out.println("Result is" + counter);
        }
    }
}