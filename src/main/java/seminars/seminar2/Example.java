
package seminars.seminar2;

import seminars.seminar2.some.Game;
import seminars.seminar2.tasks.Task1;
import seminars.seminar2.tasks.Task4;

public class Example {
    public static void main(String[] args) {

        ///////////////////// Task0 задание к some.Game/
        Game.toGame();

        ///////////////////// Task1 ////////////////////
        Task1 task1 = new Task1();
        System.out.println(task1.repeatStr(11));
        // либо пишем только не task1 а Task1 в
        // System.out.println(Task1.repeatStr(11));
        // только тогда в Классе Task1 переменные нахываем со
        // со Static -> так хуже чем без Static

        ///////////////////// Task4 //////////////////////
        Task4.write();



    }
}




