package com.bridgelabz.Exception;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of the Program");
        }

        System.out.println("Exception handled");
    }
}

