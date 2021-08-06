package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.*;
import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.inputOutput.Output;

import java.util.HashSet;
import java.util.Set;

public class PrintGroupPointsAction implements UserAction {
    private final Output out;

    public PrintGroupPointsAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Print Group Points";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Set<Point> result = new HashSet<>();
        out.println("=== Print point group ===");
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
                Set<Point> group1 = tracker.findPoint(groupNumber);
                result.addAll(group1);

            } else {
                out.println("Incorrect input!");
                break;
            }
        }
        if (result .isEmpty()) {
            out.println("No points!");
        } else {
            out.println(result);
        }
        return true;
    }
}
