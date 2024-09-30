package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат деления: " + result);
        } catch (RuntimeException e) {
            throw new RuntimeException("Делить на ноль нельзя!");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}