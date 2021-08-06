package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.*;
import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.inputOutput.Output;


public class RemoveGroupPointsAction implements UserAction {
    private final Output out;

    public RemoveGroupPointsAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Remove Group Points";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Remove point group ===");
        String group = input.askStr("Enter group or groups: ");
        String[] groupId = group.split(" ");
        int groupNumber;
        for (String s : groupId) {
            try {
                groupNumber = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                out.println("Incorrect input!");
                break;
            }
            if (groupNumber <= 3) {
                tracker.remove(groupNumber);
            } else {
                out.println("Incorrect input!");
                break;
            }
        }

        out.println("Successfully deleted!");
        return true;
    }
}
