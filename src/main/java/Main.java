package ru.netology.sqr.org.example.services;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(200, 300);
        System.out.println(actual);
    }
}
