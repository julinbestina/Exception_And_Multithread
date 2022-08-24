package com.bridgelabz.mutlithread;

public class CharacterThread implements Runnable {
//    NumberThread numberThread = new NumberThread();

    @Override
    public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
//        numberThread.flag = true;
    }
}

