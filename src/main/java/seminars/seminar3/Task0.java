package seminars.seminar3;
//Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Task0 {
    public void prim1(){
        ArrayList <Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(11));

        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
    }
}
