package ru.olegevseev.task.points.inputOutput;

import java.util.Scanner;

/**
 * класс реализующий ввод данных
 */
public class ConsoleInput implements Input {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * метод ввода строки
     *
     * @param question строка подсказка
     * @return результат ввода
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * метод ввода числа
     *
     * @param question строка подсказка
     * @return результат ввода
     */
    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
