//Дано четное число N (>0) и символы c 1 и c2.
//Написать метод, который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2, начиная с c1.

package seminars.seminar2.tasks;

public class Task1 {
    private  String one = "c1";
    private  String two = "c2";

    public String repeatStr(int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            // StringBuilder - это тип для переменной builder такойже как и тип int
            if (i % 2 == 0) {
                builder.append(one);
            }
            if (i % 2 != 0){
                builder.append(two);
            }
        }
        return builder.toString(); // метод ту стринг делает из объекта строку
    }
}


