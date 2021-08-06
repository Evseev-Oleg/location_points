package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.Tracker;

public class Exit implements UserAction {

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
