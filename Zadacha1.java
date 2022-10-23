// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Zadacha1 {
   public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите число: ");
    int num = iScanner.nextInt();
    int factorial = 1;
    
    for (int i = 1; i <= num; i++) {
        factorial *= i;
    }

    System.out.println(factorial);
    iScanner.close();
   } 
}