// Создать калькулятор с простыми операторами
package homeworks.hw1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int number1 = scanner3.nextInt();
        System.out.println("Выберите оператор: +, -, /, * ");
        int operator = scanner3.next().charAt(0);
        System.out.println("Введите второе число ");
        int number2 = scanner3.nextInt();
        int result;
        if (operator == '+') {
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result + " <- Ответ");
        }
        if (operator == '-') {
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result + " <- Ответ");
        }
        if (operator == '/') {
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result + " <- Ответ");
        }
        if (operator == '*') {
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result + " <- Ответ");
        }
        if (operator != '-' && operator != '+' && operator != '/' && operator != '*') {
            System.out.println("Вы ввели другой оператор ");
        }
    }
}
