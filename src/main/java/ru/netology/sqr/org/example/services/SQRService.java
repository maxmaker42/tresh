package ru.netology.sqr.org.example.services;

public class SQRService {
    private int minNumber;

    public int calculateSQR(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minNumber) {
                if (i * i <= maxNumber) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }
}