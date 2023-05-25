// Задача 1. Вычислить n-ое треугольное
// число(сумма чисел от 1 до n)
package Homeworks.HW1;
import java.util.Scanner;
public class Task1 {

    public void TriangleNumber (int num){
        Scanner Scanner1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Scanner1.nextInt();
        int result;
        result = n * (n+1) / 2;
        System.out.println("Треугольное число от " + n + " = " + result);
        Scanner1.close();
    }
}

