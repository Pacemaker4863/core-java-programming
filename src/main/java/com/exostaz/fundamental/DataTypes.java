package com.exostaz.fundamental;

/**
 * Let's have a look on the fundamental structures of Java.
 *
 * @author Gregory Risch
 * @version 1.0.0
 */
public class DataTypes {
    /*
     * The following part is about the primitive Java data types.
     * (and this is a multilines comment :) )
     */

    public static void playWithInt() {
        final int minInteger = Integer.MIN_VALUE;
        final int maxInteger = Integer.MAX_VALUE;
        System.out.println("minInteger = " + minInteger);
        System.out.println("maxInteger = " + maxInteger);
        final int asBinary = 0b0001;
        final int asOctal = 0_011; // Start with a zero 0. can be written 0011; the _ is for clarity
        final int asHexadecimal = 0xCAFE;
        System.out.println("asBinary = " + asBinary);
        System.out.println("asOctal = " + asOctal);
        System.out.println("asHexadecimal = " + asHexadecimal);
    }

    static public void playWithShort() {
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("minShort = " + minShort);
        System.out.println("maxShort = " + maxShort);

        final int anInt = minShort - 1; // implicit type conversion (16 -> 32 bits)
        System.out.println("anInt = " + anInt);
    }

    static public void playWithLong() {
        // L must be mentioned -> a Integer is considered as an int
        final long aLong = Integer.MAX_VALUE + 1000L;
        System.out.println("aLong = " + aLong);
    }

    public static void playWithBytes() {
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

    public static void main(String[] args) {
        playWithInt();
        playWithShort();
        playWithLong();
        playWithBytes();
    }
}
