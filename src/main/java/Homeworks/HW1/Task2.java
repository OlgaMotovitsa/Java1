// задача 2. n! (произведение чисел от 1 до n)
package Homeworks.HW1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner Scanner2 = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = Scanner2.nextInt();
        Scanner2.close();
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("Факториал числа " + number + " = " + factorial);
    }
}