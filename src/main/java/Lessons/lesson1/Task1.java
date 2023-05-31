// Задание 4
// Во фразе "Добро пожаловать на курс по Java" переставить
//слова в обратном порядке.

package Lessons.lesson1;

public class Task1 {
    public void revers(String str) {
        String[] array = str.split(" ");
        for (int i = (array.length - 1); i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
