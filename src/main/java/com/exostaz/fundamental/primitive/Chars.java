package com.exostaz.fundamental.primitive;

public class Chars {
    static void playWithChars() {
        char a = 97;
        System.out.println("a = " + a); // prints a
        System.out.println("b = " + (a + 1)); // prints 98 - promoted to int
        System.out.println("b = " + (char) (a + 1)); // prints b
        System.out.println("c = " + (a + (char) 2)); // prints 99
        char c = (char) (a + 2);
        System.out.println("c = " + c); // prints c

        System.out.println("Character.MIN_VALUE = " + (int) Character.MIN_VALUE);
        System.out.println("(int)Character.MAX_VALUE = " + (int) Character.MAX_VALUE);

        char aChar = '\u00E0'; // prints à
        System.out.println("aChar (unicode/Hexadecimal) = " + aChar);
        char aCharInOctal = '\027';
        System.out.println("aCharInOctal = " + aCharInOctal);

        for (int letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
        for (int letter = 'a'; letter <= 'z'; letter++) {
            System.out.print((char) letter + " ");
        }
        System.out.println();
        for (int letter = 'a'; letter <= 'z'; letter++) {
            System.out.printf("%c ", letter);
        }
//        for (int ascii = Character.MIN_VALUE; ascii < (int) Math.pow(2, 7); ascii++) {
//            System.out.printf("%c ", ascii);
//        }
    }

    public static void main(String[] args) {
        playWithChars();
    }
}
