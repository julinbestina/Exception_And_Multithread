package com.bridgelabz.mutlithread;

public class NumberThread extends Thread {
    static boolean flag;

    @Override
    public void run() {
//        try {
//                System.out.println(currentThread().getId());
        for (int i = 0; i < 100; i++) {
//
//            if (flag == true) {
//
//                        throw new InterruptedException("Program is interrupted");
//            }
            System.out.println(i + 1);
        }

//        } catch (InterruptedException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}

