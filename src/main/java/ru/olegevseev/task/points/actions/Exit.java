package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.Tracker;

/**
 * класс реализующий выход с программы
 */
public class Exit implements UserAction {

    /**
     * метод дает название действию Exit
     * @return строка названия
     */
    @Override
    public String name() {
        return "Exit";
    }

    /**
     * метод выхода с программы
     *
     * @param input интерфейс ввода
     * @param tracker класс с методами
     * @return подтверждение для дальнейшей работы
     * или выхода с программы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
