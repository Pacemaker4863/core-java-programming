package com.exostaz.fundamental.primitive;

/**
 * Let's have a look on the fundamental structures of Java.
 *
 * @author Gregory Risch
 * @version 1.0.0
 */
public class Integers {
    /*
     * The following part is about the primitive integer Java data types.
     * (and this is a multilines comment :) )
     */

    public static void playWithInt() {
        System.out.println("Integers.playWithInt");
        final int minInteger = Integer.MIN_VALUE;
        final int maxInteger = Integer.MAX_VALUE;
        System.out.println("minInteger = " + minInteger);
        System.out.println("maxInteger = " + maxInteger);
        final int asBinary = 0b0001;
        final int asOctal = 0_011; // Start with a zero 0. can be written 0011; the _ is for clarity
        final int asHexadecimal = 0xCAFE;
        final int scientific = (int) 1e9; // by default scientific notation is a double
        System.out.println("scientific = " + scientific);
        System.out.println("asBinary = " + asBinary);
        System.out.println("asOctal = " + asOctal);
        System.out.println("asHexadecimal = " + asHexadecimal);
    }

    static public void playWithShort() {
        System.out.println("Integers.playWithShort");
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("minShort = " + minShort);
        System.out.println("maxShort = " + maxShort);

        short aShort = 12; // 12 is an int
        byte asByte = (byte) aShort; // need an explicit cast
        int  asInt  = aShort;
        long asLong = aShort;
        System.out.println("a = " + aShort);
        System.out.println("asByte = " + asByte);
        System.out.println("asInt = " + asInt);
        System.out.println("asLong = " + asLong);

        final int anInt = minShort - 1; // implicit type conversion (16 -> 32 bits)
        System.out.println("anInt = " + anInt);
    }

    static public void playWithLong() {
        System.out.println("Integers.playWithLong");
        // L must be mentioned -> a Integer is considered as an int
        final long aLong = Integer.MAX_VALUE + 1000L;
        System.out.println("aLong = " + aLong);
    }

    public static void playWithBytes() {
        System.out.println("Integers.playWithBytes");
        final byte aByte = (byte) 0b01111111; // needs an explicit cast 127
        assert aByte == Byte.MAX_VALUE;
        System.out.println("aByte = " + aByte);
        final var anotherByte = (byte) 0b1111_1111_1111_1111_1111_1111_1000_0000;
        System.out.println("anotherByte = " + Integer.toBinaryString(anotherByte));
        assert anotherByte == Byte.MIN_VALUE;
        byte yetAnotherByte = (byte) 255;
        System.out.println("yetAnotherByte = " + yetAnotherByte); // yetAnotherByte = -1
        var lastByte = Byte.toUnsignedInt(yetAnotherByte);
        System.out.println("lastByte = " + lastByte);
    }

    public static void playWithComplement2() {
        int a = 1, b = -1;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        int c = 2, d = -2;

        /*
           c = 00000000000000000000000000000010
           all is flipped -> 0 become 1 and 1 become 0 and you add 1
               11111111111111111111111111111101
               +                              1
           d = 11111111111111111111111111111110
         */
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("d = " + Integer.toBinaryString(d));
    }

    public static void main(String[] args) {
        playWithInt();
        playWithShort();
        playWithLong();
        playWithBytes();
        playWithComplement2();
    }
}
