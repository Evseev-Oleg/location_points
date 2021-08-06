package ru.olegevseev.task.points.inputOutput;

public class ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
