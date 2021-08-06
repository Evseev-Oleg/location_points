package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.inputOutput.Output;
import ru.olegevseev.task.points.Tracker;

/**
 * класс реализующий очистку памяти
 */
public class ClearAction implements UserAction {
    private final Output out;

    public ClearAction(Output out) {
        this.out = out;
    }

    /**
     * метод дает название действию Clear
     * @return строка названия
     */
    @Override
    public String name() {
        return "Clear All Points";
    }

    /**
     * метод очистки памяти
     *
     * @param input интерфейс ввода
     * @param tracker класс с методом очистки памяти
     * @return подтверждение для дальнейшей работы
     * или выхода с программы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Clear all Points ====");
        tracker.clear();
        out.println("Successfully deleted!");
        return true;
    }
}
