package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    char[] name = askNameOrSurname();
        //char[] surname = askNameOrSurname();

        for (int i = 0; i < name.length; i++) {
            int counter = 0;
            for (int j = 0; j < name.length; j++) {
                if(Character.isLetter(name[j])){
                   if(Character.toLowerCase(name[i]) == Character.toLowerCase(name[j])){
                       counter++;
                   }
                }
                else{
                    System.out.println("The person names doesn't have numbers");
                }

            }
            System.out.println("The character "+ name[i] +" is "+counter);
        }

    }


    private static char[] askNameOrSurname() {
        System.out.println("Write the name");
        return new Scanner(System.in).nextLine().toCharArray();
    }


}
