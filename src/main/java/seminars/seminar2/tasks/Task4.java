// Напишите метод, который составит строку,
// состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл,
// обработайте исключения.

package seminars.seminar2.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void write(){
        String str = createString();
        System.out.println(str.length());
        try(FileWriter writer = new FileWriter("work.txt");) {

            writer.write(str);

        } catch (IOException e) {
            throw new TaskNewWriteExeption(e.getMessage());
        }
    }
    private static String createString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("TEST");
        }
        return builder.toString();
    }
}
