// 3. Вывести все простые числа от 1 до 1000
package Homeworks.HW1;
public class Task3 {
    public static void main(String[] args) {
        int maxNumber = 1000;
        for(int i = 2; i < maxNumber; i++){
            boolean prime = false;
            for(int j = 2; j*j <= i; j++){
                prime = (i % j == 0);
                if (prime) {
                    break;
                }
            }
            if(!prime)
                System.out.print(i + " ");
        }
    }
}