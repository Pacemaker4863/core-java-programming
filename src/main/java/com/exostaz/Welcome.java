package com.exostaz;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to the core Java Language
                I hope you will enjoy the journey!
                
                and to start let's print the classic...
                """);
        String hello = "Hello, world!";
        System.out.printf("%s%n", hello);
        for (int i = 0; i < hello.length(); i++) {
            System.out.print("=");
        }
        System.out.println("\nas usual \uD83D\uDE01");
        System.exit(0);
    }
}
