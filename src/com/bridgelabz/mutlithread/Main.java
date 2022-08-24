package com.bridgelabz.mutlithread;

public class Main {

    public static void main(String[] args) {

        NumberThread numberThread = new NumberThread();
        numberThread.setDaemon(true);
        numberThread.start();
//      numberThread.join();
//      numberThread.setPriority(Thread.MAX_PRIORITY);

        CharacterThread characterThread = new CharacterThread();
        Thread thread = new Thread(characterThread);
        thread.start();
    }
}



