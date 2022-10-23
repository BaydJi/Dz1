// Реализовать простой калькулятор

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scan.nextInt();
        System.out.println("Введите b: ");
        int b = scan.nextInt();
        System.out.println("Введите номер опреции, которую хотите выполнить:");
        System.out.println("1. +; 2. -; 3. *; 4. /. ");
        int operation = scan.nextInt();
        int result = 0;

        if (operation == 1) {
            result = a + b;
        }

        if (operation == 2) {
            result = a - b;
        }

        if (operation == 3) {
            result = a * b;
        }

        if (operation == 4) {
            result = a / b;
        }
    
        System.out.println("Ответ: " + result);
        
    }
}
