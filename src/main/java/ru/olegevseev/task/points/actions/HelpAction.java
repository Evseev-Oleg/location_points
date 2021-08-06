package ru.olegevseev.task.points.actions;

import ru.olegevseev.task.points.inputOutput.Input;
import ru.olegevseev.task.points.inputOutput.Output;
import ru.olegevseev.task.points.Tracker;

public class HelpAction implements UserAction {
    private final Output out;

    public HelpAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Help menu";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Help ====");
        out.println("1 group: points lying on or above the line y=x1;\n" +
                "2 group: points lying on or above the line y=x2;\n" +
                "3 group: points lying on or above the line y=x3.\n" +
                "0. Add points - Adding new points. Enter the " +
                "numbers in pairs separated by a space.\n" + "1. Print All points - " +
                "Show all points by groups and the number of points that are not" +
                " included in any group.\n2. Print Group Points - Show the points" +
                " of the groups you selected. Enter the number of the group or groups.\n" +
                "3. Remove Group Points - Deletes the group or groups you selected. " +
                "Enter the number of the group or groups.\n4. Clear All Points - " +
                "Clearing all groups.\n5. Help - Helm menu\n6. Exit - Exit from the program.");
        return true;
    }
}
