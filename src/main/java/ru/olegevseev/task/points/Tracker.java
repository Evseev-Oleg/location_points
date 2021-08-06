package ru.olegevseev.task.points;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * класс со всеми методами которые использует приложение
 */
public final class Tracker {
    private static Tracker tracker;
    private final Set<Point> groupOne = new HashSet<>();
    private final Set<Point> groupTwo = new HashSet<>();
    private final Set<Point> groupThree = new HashSet<>();
    private final Set<Point> noGroup = new HashSet<>();

    public static Tracker getTracker() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public void add(Point point) {
        List<Integer> resGroup = foundNumberGroup(point);
        for (Integer integer : resGroup) {
            if (integer == 1) {
                groupOne.add(point);
            }
            if (integer == 2) {
                groupTwo.add(point);
            }
            if (integer == 3) {
                groupThree.add(point);
            }
            if (integer == 4) {
                noGroup.add(point);
            }
        }
    }

    public Set<Point> findPoint(int numberGroup) {
        if (numberGroup == 1) {
            return groupOne;
        } else if (numberGroup == 2) {
            return groupTwo;
        } else if (numberGroup == 3) {
            return groupThree;
        } else {
            return noGroup;
        }
    }

    public void remove(int numberGroup) {
        switch (numberGroup) {
            case 1 -> groupOne.clear();
            case 2 -> groupTwo.clear();
            case 3 -> groupThree.clear();
        }
    }

    public void clear() {
        groupOne.clear();
        groupTwo.clear();
        groupThree.clear();
        noGroup.clear();
    }

    private List<Integer> foundNumberGroup(Point point) {
        List<Integer> numberGroups = new ArrayList<>();
        if (point.getY() >= point.getX()) {
            numberGroups.add(1);
            if (point.getY() >= Math.pow(point.getX(), 2)) {
                numberGroups.add(2);
            }
            if (point.getY() >= Math.pow(point.getX(), 3)) {
                numberGroups.add(3);
            }
            return numberGroups;
        } else {
            numberGroups.add(4);
            return numberGroups;
        }
    }
}
