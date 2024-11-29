package eu.chrost.git;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World again!");

        Random rand = new Random();
        int value = rand.nextInt(100);
        System.out.println(value);
    }
}
