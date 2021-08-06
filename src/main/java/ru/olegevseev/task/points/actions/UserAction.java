package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.Tracker;
import ru.olegevseev.task.points.inputOutput.Input;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
