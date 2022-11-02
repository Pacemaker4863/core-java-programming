package com.exostaz.compilation.packagea;

import static com.exostaz.compilation.packageb.ClassB.sayHello;

public class ClassA {
    /*
        see COMPILATION.adoc at PROJECT_ROOT
     */

    public static void main(String[] args) {
        if (args != null) {
            System.out.println("the args args exists");
        }

        assert args != null;

        if (args.length == 0) {
            // with no arguments
            System.out.println("... but the args array is empty!"); // is printed with no args
        } else {
            // java src/main/java/com/exostaz/fundamental/Compilation.java Gregory
            String name = args[0];
            sayHello(name); // prints Hello, Gregory
        }

        System.out.println("""
                A simple class to compile
                - contained in a package
                - no dependency
                """);
    }
}
