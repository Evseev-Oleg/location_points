package ru.olegevseev.task.points.inputOutput;

/**
 * интерфейс ввода данных
 */
public interface Input {
    String askStr(String question);

    int askInt(String question);
}
