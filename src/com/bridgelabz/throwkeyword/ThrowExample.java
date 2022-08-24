package com.bridgelabz.throwkeyword;

public class ThrowExample {
    public static void main(String args[]) {

        try {
            for (int i = 1; i < 100; i++) {
                System.out.println(i);
                if (i == 80) {
                    throw new UserDefinedException("Program stopped");
                }
            }
        } catch (UserDefinedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

