package ru.olegevseev.task.points;

import ru.olegevseev.task.points.actions.*;
import ru.olegevseev.task.points.inputOutput.*;

/**
 * класс стартер программы
 */
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = Tracker.getTracker();
        UserAction[] actions = {
                new AddAction(output), new PrintAllPointsAction(output),
                new PrintGroupPointsAction(output), new RemoveGroupPointsAction(output),
                new ClearAction(output), new HelpAction(output), new Exit()
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
