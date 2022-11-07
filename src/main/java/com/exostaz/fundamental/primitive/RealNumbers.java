package com.exostaz.fundamental.primitive;

public class RealNumbers {
    public static void playWithDouble() {
        System.out.println("RealNumbers.playWithDouble");

        var aDouble = .2; // 0.2 - double by default
        double anotherDouble = 00.289; // 0.289
        double theLastDouble = 0x1.27ef9db22d0e5p-2; // 0.289
        var scientific = .2676e-3;
        var minValue = Double.MIN_VALUE;
        var maxValue = Double.MAX_VALUE;
        var zero = 0.;

        System.out.println("aDouble = " + aDouble);
        System.out.println("anotherDouble = " + anotherDouble);
        System.out.println("theLastDouble = " + theLastDouble);
        System.out.println("scientific = " + scientific);
        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValue);
        System.out.println("zero = " + zero);

        double π = Math.PI; // possible to name a variable as π

        System.out.printf("π = %-100.20f%n", π);
        System.out.printf("√2 = %-20.20f%n", Math.sqrt(2)); // automatic cast of 2 as double
        System.out.printf("%.2e%n", scientific); // 2.68
    }

    public static void playWithFloats() {
        System.out.println("RealNumbers.playWithFloats");

        var aFloat = .2; // 0.2 - double by default
        float anotherFloat = 00.289F; // cannot convert automatically a double to bloat
        var scientific = .2676e-3;
        var minValue = Float.MIN_VALUE;
        var maxValue = Float.MAX_VALUE;
        float zero = 0.f;

        System.out.println("aFloat = " + aFloat);
        System.out.println("anotherFloat = " + anotherFloat);
        System.out.println("scientific = " + scientific);
        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValue);
        System.out.println("zero = " + zero);
    }

    public static void main(String[] args) {
        playWithDouble();
        playWithFloats();
    }
}
