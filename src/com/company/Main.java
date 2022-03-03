package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {

        char[] name = askNameOrSurname();
        char[] surname = askNameOrSurname();

        isVowelOrNot(name, surname);
        compareNameAndSurname(name, surname);
        countNumberOfConsonantsInName(name);
       /* fuseNameAndSurname(name, surname);*/
    }

    private static void isVowelOrNot(char[] name, char[] surname)throws Exception {

        for (int i = 0; i < name.length; i++) {
            char characterLoweredCase = Character.toLowerCase(name[i]);
            printWhatTypeCharIs(characterLoweredCase);

        }
    }

    private static void printWhatTypeCharIs(char characterLoweredCase) throws Exception {
        if(Character.isDigit(characterLoweredCase)) throw new Exception();

        if (characterLoweredCase != ' ') {
            if (isAVowel(characterLoweredCase)) {
                System.out.println(characterLoweredCase + " is a vowel");
            } else {
                System.out.println(characterLoweredCase + " is a consonant");
            }
        }
    }

    private static void fuseNameAndSurname(char[] name, char[] surname) {
        List<Character> charName = new ArrayList<>();
        List<Character> charSurname = new ArrayList<>();

        //charName = listCharacterName();

    }

    private static void compareNameAndSurname(char[] name, char[] surname) {
        methodCompare(name);
        //  methodCompare(surname);
    }

    private static void countNumberOfConsonantsInName(char[] name) {
        List<Character> listOfConsonants = methodAddConsonants(name);
        showQuantityOfConsonants(listOfConsonants);
    }

    private static void showQuantityOfConsonants(List<Character> listOfConsonants) {
        System.out.println("This is the number of consonants: " + listOfConsonants.size());
    }

    private static List<Character> methodAddConsonants(char[] name) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            char characterLoweredCase = Character.toLowerCase(name[i]);
            if (!isAVowel(characterLoweredCase)) {
                characterList.add(characterLoweredCase);
            }

        }
        return characterList;
    }

    private static boolean isAVowel(char characterLoweredCase) {
        for (char currentVowel : vowels) {
            if (characterLoweredCase == currentVowel)
                return true;
        }
        return false;
    }

    private static void methodCompare(char[] name) {
        int counter;
        for (int i = 0; i < name.length; i++) {
            counter = 0;
            for (int j = 0; j < name.length; j++) {
                counter = compareCharacters(name[i], name[j], counter);
            }
            System.out.println("The character " + name[i] + " is " + counter);
        }
    }

    private static int compareCharacters(char characterFirst, char characterSecond, int counter) {
        if (Character.isLetter(characterSecond)) {
            if (Character.toLowerCase(characterFirst) == Character.toLowerCase(characterSecond)) {
                counter++;
            }
        } else {
            System.out.println("The person names doesn't have numbers");
        }
        return counter;
    }


    private static char[] askNameOrSurname() {
        System.out.println("Write the name or surname");
        return new Scanner(System.in).nextLine().toCharArray();
    }


}
