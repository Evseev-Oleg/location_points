package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.*;
import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.inputOutput.Output;

/**
 * класс реализующий добавление новых точек
 */
public class AddAction implements UserAction {
    private final Output out;

    public AddAction(Output out) {
        this.out = out;
    }

    /**
     * метод дает название действию Add
     * @return строка названия
     */
    @Override
    public String name() {
        return "Add points";
    }


    /**
     * метод выполняет действия
     * по добавлению новых точек
     * и валидирующий некорректный ввод
     *
     * @param input интерфейс ввода
     * @param tracker класс с методом добавления
     * @return подтверждение для дальнейшей работы
     * или выхода с программы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Add a new Points ====");
        String name = input.askStr("Enter values: ");
        String[] points = name.split(" ");
        if (points.length % 2 != 0) {
            out.println("Incorrect input!");
        } else {
            for (int i = 0; i < points.length; i += 2) {
                int x;
                int y;
                try {
                    x = Integer.parseInt(points[i]);
                    y = Integer.parseInt(points[i + 1]);
                } catch (NumberFormatException e) {
                    out.println("Incorrect input!");
                    break;
                }
                tracker.add(new Point(x, y));
            }
        }
        return true;
    }
}
