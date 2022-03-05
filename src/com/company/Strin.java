package com.company;

public class Strin {
    public static void main(String[] args) {

        String regularString1 = "Physician";
        int counter1 = 0;
        for (int i = 0; i < regularString1.length(); i++) {
            System.out.println(regularString1.charAt(i));
            if ('A' == regularString1.charAt(i) || 'E' == regularString1.charAt(i) || 'I' == regularString1.charAt(i) || 'O' == regularString1.charAt(i) || 'U' == regularString1.charAt(i) || 'a' == regularString1.charAt(i) || 'e' == regularString1.charAt(i) || 'i' == regularString1.charAt(i) || 'o' == regularString1.charAt(i) || 'u' == regularString1.charAt(i)){
                counter1++;
            }
            System.out.println("Result is" + counter1);
        }
        String regularString2 = "Aerodynamics";
        int counter2 = 0;
        for (int i = 0; i < regularString2.length(); i++) {
            System.out.println(regularString2.charAt(i));
            if ('A' == regularString2.charAt(i) || 'E' == regularString2.charAt(i) || 'I' == regularString2.charAt(i) || 'O' == regularString2.charAt(i) || 'U' == regularString2.charAt(i) || 'a' == regularString2.charAt(i) || 'e' == regularString2.charAt(i) || 'i' == regularString2.charAt(i) || 'o' == regularString2.charAt(i) || 'u' == regularString2.charAt(i)) {
                counter2++;
            }
            System.out.println("Result is" + counter2);
        }
        {
            String regularString = "I am going to the beach";
            int counter = 0;
            for (int j = 0; j < regularString.length(); j++) {
                System.out.println(regularString.toLowerCase().charAt(j));
                if ('a' == regularString.charAt(j)) {
                    counter++;
                }
            }
            System.out.println("The number of times 'a' appeared is " + counter);

        //Write a program to compare two strings by their length and return output that tells the use rif the strings are equal or not.
            String regularString3 = "I will think about it tomorrow";
            String regularString4 = "Tomorrow never comes";
            int length1 = regularString3.length();
            int length2 = regularString4.length();
            if (length1 == length2){
            System.out.println("Sentences are equal");
        }           else {
                System.out.println("Sentences are not equal");
            }
            //Task 2. Write a programm to remove the first an the last letters of a string, e.g. hello becomse ell

            int length3 = (regularString3.length() - 1);
            String newText = regularString3.substring(1, regularString3.length() - 1);
            System.out.println(newText);

            //Write a programm to reverse a string nd capitalize all the letters, e.g. hello becomes OLLEH
                String regularString5 = "HELLO", nstr="";
            System.out.println(regularString5.toLowerCase());
            char ch;
            for (int z = 0; z < regularString5.length(); z++) {
                ch = regularString5.charAt(z);
                nstr = ch + nstr;
            }
                System.out.println(nstr);
// Write a program that ads as many ' r' to ' burp' by using a variable to regulate.e.g. if the variable is 4, than it will return
            //an output like 'burrrrrp'

            String regularString8 = "burp";
            String l = "r";
            int c = 6;
            int index = regularString8.indexOf(l);
            String result = "";
            for (int k = 0; k < c; ++k) {
                result += l;
            System.out.println(index);
            String substr1 = regularString8.substring(index);
            System.out.println(substr1);
            String substr2 = regularString8.substring(0,index);
            System.out.println(substr2);
            String resu = substr2 + result + substr1;
            System.out.println(resu);
            }}}}