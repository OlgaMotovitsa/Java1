package lessons.Lesson2;

import java.util.logging.*;

public class Logs {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logs.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
}


