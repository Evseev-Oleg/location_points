package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.inputOutput.Output;
import ru.olegevseev.task.points.Tracker;

public class ClearAction implements UserAction {
    private final Output out;

    public ClearAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Clear All Points";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Clear all Points ====");
        tracker.clear();
        out.println("Successfully deleted!");
        return true;
    }
}
