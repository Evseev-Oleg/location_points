package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.*;
import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.inputOutput.Output;

import java.util.Set;

/**
 * класс выводящий на экран все точки
 */
public class PrintAllPointsAction implements UserAction {
    private final Output out;

    public PrintAllPointsAction(Output out) {
        this.out = out;
    }

    /**
     * метод дает название действию PrintAll
     * @return строка названия
     */
    @Override
    public String name() {
        return "Print All points";
    }

    /**
     * метод выполняет действия
     * вывода на экран всех точек
     *
     * @param input интерфейс ввода
     * @param tracker класс с методом поиска точек findPoint()
     * @return подтверждение для дальнейшей работы
     * или выхода с программы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all Points ===");
        for (int i = 0; i < 3; i++) {
            Set<Point> group = tracker.findPoint(i + 1);
            if (group.isEmpty()) {
                out.println("group_" + (i + 1) + " empty");
            } else {
                out.println("group_" + (i + 1) + ": " + group);
            }
        }
        Set<Point> group4 = tracker.findPoint(4);
        if (!group4.isEmpty()) {
            out.println("Not included in the groups: " + group4.size() + " points.");
        }
        return true;
    }
}
