package ru.olegevseev.task.points.inputOutput;

/**
 * класс реализующий вывод в консоль
 */
public class ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
