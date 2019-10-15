package com.lyl.daily.bit;

public class Bit {
    public int leftMove() {
        return 2<<1; // 0010 << 1 = 0100
    }

    public int rightMove() {
        return 2>>1; // 0010 >> 1 = 0001
    }

    public int and() {
        return 5&4; // 0101 & 0100 = 0100
    }

    public int or() {
        return 4|1; // 0100 | 0001 = 0101
    }

    /**
     * 亦或，相同为0，不同为1
     * @return
     */
    public int notor() {
        return 2^3; // 0010 ^ 0011 = 0001
    }

    public static void main(String[] args) {
        Bit bit = new Bit();
        System.out.println(bit.leftMove());
        System.out.println(bit.rightMove());
        System.out.println(bit.and());
        System.out.println(bit.or());
        System.out.println(bit.notor());
    }
}
